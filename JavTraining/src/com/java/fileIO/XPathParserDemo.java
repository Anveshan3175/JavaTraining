package com.java.fileIO;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XPathParserDemo {

	static String getValue(String ObjectId, String attribute) {

		try {
			File inputFile = new File("clob.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();

			// /COMPAREDATA/CompareVO/PersonVORow/PhoneVORow[@key="100010034148152"]
			String expression = "/COMPAREDATA/CompareVO/PersonVORow/PhoneVORow[@key=\"" + ObjectId + "\"]";
			NodeList phoneRowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);

			Element eElement = (Element) phoneRowList.item(0);
			NodeList compareList = eElement.getElementsByTagName("Compare");
			for (int j = 0; j < compareList.getLength(); j++) {
				Node cNode = compareList.item(j);
				if (cNode.getNodeType() == Node.ELEMENT_NODE) {
					Element cElement = (Element) cNode;
					if (attribute.equals(cElement.getElementsByTagName("AttributeName").item(0).getTextContent())) {
						return cElement.getElementsByTagName("NewValue").item(0).getTextContent();
					}
				}
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		//System.out.println(getValue("100010034148152", "PhoneNumber"));
		//System.out.println(fetchFromCompare( "PhoneNumber"));
		System.out.println(getCompareDataSets( ));
	}
	
	
	
	 static String  getCompareDataSets() {
	        Long objectId = new Long("100010034148152");
	        File inputFile = new File("clob.xml");
	        try {

	            DocumentBuilderFactory dbFactory =
	            DocumentBuilderFactory.newInstance();
	            DocumentBuilder dBuilder;

	            dBuilder = dbFactory.newDocumentBuilder();

	            Document doc = dBuilder.parse(inputFile);
	            doc.getDocumentElement().normalize();

	            XPath xPath = XPathFactory.newInstance().newXPath();

	            String expression = "/COMPAREDATA/CompareVO/*";
	            // This gives required phone as per objectId
	            NodeList phoneRowList =
	                (NodeList)xPath.compile(expression).evaluate(doc,
	                                                             XPathConstants.NODESET);

	            
	            for(int i =  0; i < phoneRowList.getLength();i++){
	            	Element eElement = (Element) phoneRowList.item(i);
	            	System.out.println();
	            	System.out.println();
	            	System.out.print("VO Name is   :  "+eElement.getNodeName());
	            	System.out.println();
	            	NodeList compareList = eElement.getElementsByTagName("Compare");
	                for (int j = 0; j < compareList.getLength(); j++) {
	                    Node cNode = compareList.item(j);      
	                    if (cNode.getNodeType() == Node.ELEMENT_NODE) {
	                        Element cElement = (Element)cNode; 
	                        
	                        System.out.print("AttributeName  :  "+cElement.getElementsByTagName("AttributeName").item(0).getTextContent());
	                        System.out.print(" New Value : "+cElement.getElementsByTagName("NewValue").item(0).getTextContent());
	                        System.out.print(" Old Value : "+cElement.getElementsByTagName("OldValue").item(0).getTextContent());      
	                        System.out.println();
	                    }
	                }
	            }
 
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	 
	 
	 
    static String  fetchFromCompare(String attribute) {
        System.out.println("---------fetchFromCompare------");
        Long objectId = new Long("100010034148152");
        File inputFile = new File("clob.xml");
        try {

            DocumentBuilderFactory dbFactory =
            DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;

            dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            XPath xPath = XPathFactory.newInstance().newXPath();

            String expression = "/COMPAREDATA/CompareVO/PersonVORow/PhoneVORow[@key=\"" + objectId + "\"]";
            // This gives required phone as per objectId
            NodeList phoneRowList =
                (NodeList)xPath.compile(expression).evaluate(doc,
                                                             XPathConstants.NODESET);
            Element eElement = (Element) phoneRowList.item(0);
            //This gives list of all <Compare> within the selected phone
            NodeList compareList = eElement.getElementsByTagName("Compare");
            for (int j = 0; j < compareList.getLength(); j++) {
                Node cNode = compareList.item(j);      
                if (cNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element cElement = (Element)cNode;
                    // Check for required attribute for which we need to retrieve old Value..For Ex : DisplayPhoneNumber or Country or PhoneId in the PhoneRow
                    if (attribute.equals(cElement.getElementsByTagName("AttributeName").item(0).getTextContent())) {
                       System.out.println("-------- attribute "+attribute+"----"+cElement.getElementsByTagName("OldValue").item(0).getTextContent());
                            return (cElement.getElementsByTagName("OldValue").item(0).getTextContent());  
                    }
                   
                  
                      
                }
            }  
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}