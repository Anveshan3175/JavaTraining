package com.java.fileIO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.w3c.dom.CharacterData;

public class GetAllEOs {

	public static void main(String[] args){
		getAllEOs();
	}

	
	static void getAllEOs() {
		File inputFile = new File("SamplePromotionCache.xml");
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();
			//   "/BUSINESSDATA/AM/TXN/EO[1]/*/CEO/EO[1]/*";
			String expression = "/TRANSACTION/BUSINESSDATA/AM/TXN/EO/*";
			NodeList rootRowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			List<String> eoNames = new ArrayList<String>();
			collectEOs(eoNames,rootRowList,doc,xPath,expression);
			System.out.println("The EOs present in the cache which are modified are "+eoNames);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void collectEOs(List<String> eoNames, NodeList rowList,Document doc,XPath xPath,String expression) throws XPathExpressionException{
		for (int i = 0 ; i < rowList.getLength() ; i++) {
			Node node = rowList.item(i);
			String attributeValue = ((Element)node).getAttribute("PS");
			if(!attributeValue.equals("1")){
				//System.out.println("AttributeValue Name : "+node.getNodeName() +" and PS is "+attributeValue);
				Node parentNode = node.getParentNode();
				Element parentElement = (Element)parentNode;
				String hexKeyFromElement   = ((CharacterData)(parentNode).getFirstChild().getNextSibling()).getData().toUpperCase();
				System.out.println("hexKeyFromElement"+hexKeyFromElement.substring(0,10));
				eoNames.add(((Element)parentNode).getAttribute("Name"));
			}
			String initialExpression = expression;
			expression = expression.substring(0, expression.length()-2)+"/" +node.getNodeName()+"/CEO/EO/*";
			NodeList childRowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			if(childRowList.getLength() > 0){
				collectEOs(eoNames,childRowList,doc,xPath,expression);
			}
			expression = initialExpression;
		}
	}
}
