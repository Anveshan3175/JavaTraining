package com.java.fileIO;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class ReviewCompare {

	public ReviewCompare() {
		// TODO Auto-generated constructor stub
	}

	//Map<String,List<ComparePojo>>
	//map.get("WorkingHourPatternVORow") = List<ComparePojo> = this in getWorkingHourPatternVOList()
	//comparePojo.get("WorkingHourPatternId") = ComparisonAttribute [attributeName=WorkingHourPatternId, oldValue=, newValue=300100138668369, isModified=true]
						
	public static void main(String[] args) {
		getCompareDataSets();
		//print();
	}
	
	

	
	//static Map<String,List<ComparePojo>> map = new HashMap<String,List<ComparePojo>>();
	
	static String getCompareDataSets() {
		File inputFile = new File("ReviewClob.xml");
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();
			Map<String,List<ComparePojo>> map = new HashMap<String,List<ComparePojo>>();

			String expression = "/COMPAREDATA/ComparisonAttribute";
			NodeList rootRowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			
			extractRows(rootRowList.item(0),map);
			System.out.println("======================================");
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	static void extractRows(Node node,Map<String,List<ComparePojo>> map) {
		if(node.getNodeName().equals("Compare")) return;
		System.out.println(node.getNodeName());	
	    NodeList nodeList = node.getChildNodes();
	    for (int i = 0; i < nodeList.getLength(); i++) {
	        Node currentNode = nodeList.item(i);
	        if (currentNode.getNodeType() == Node.ELEMENT_NODE && (currentNode.getNodeName().contains("Row") || currentNode.getNodeName().equals("ComparisonAttribute"))) {
	        	ComparePojo pojo = new ComparePojo();
	        	Map<String,ComparisonAttribute> compareMap = extractCompare(((Element)currentNode).getChildNodes());
	        	pojo.setCompareMap(compareMap);
	        	String voName = currentNode.getNodeName().replace("Row","");
	        	Element e = (Element)currentNode;
	        	System.out.println(e.getAttribute("operationType"));
	        	if(!"default".equals(e.getAttribute("operationType"))){
		        	pojo.setName(voName);
		        	List<ComparePojo> pojoList = map.get(voName);
		        	if(pojoList  == null){
		        		pojoList = new ArrayList<ComparePojo>();	        		
		        	}
		        	pojoList.add(pojo);
		        	map.put(voName, pojoList);
	        	}
	        	extractRows(currentNode, map);
	        }
	    }
	}
	
	static boolean  isModified(String oldValue,String newValue){
		if(oldValue != null && newValue != null && oldValue.equals(newValue) ) return false;
		if(oldValue == null && newValue == null) return false;
		if(oldValue != null && newValue == null) return false;
		if(oldValue == null && newValue != null) return false;
		return true;
		
	}
	static Map<String,ComparisonAttribute> extractCompare(NodeList compareList) {
		System.out.println("------Compare list-------");
		Map<String,ComparisonAttribute> compareMap = new HashMap<String,ComparisonAttribute>();
		for (int j = 0; j < compareList.getLength(); j++) {
			Node cNode = compareList.item(j);
			if (cNode.getNodeType() == Node.ELEMENT_NODE && cNode.getNodeName().equals("Compare")) {
				Element cElement = (Element) cNode;
				ComparisonAttribute cmp = new ComparisonAttribute();
				
				String attrName = cElement.getElementsByTagName("AttributeName").item(0).getTextContent();
				String oldValue = cElement.getElementsByTagName("OldValue").item(0).getTextContent();
				String newValue = cElement.getElementsByTagName("NewValue").item(0).getTextContent();
				
				cmp.setAttributeName(attrName);
				cmp.setOldValue(oldValue);
				cmp.setNewValue(newValue);
				//if (isModified(oldValue,newValue) ) cmp.setModified(true);
				
				/*System.out.print("AttributeName  :  "
						+ attrName);
				System.out.print(
						" New Value : " + newValue);
				System.out.print(
						" Old Value : " + oldValue);
				System.out.println();*/
				System.out.println(cmp);
				compareMap.put(attrName,cmp);
			}
		}
		return compareMap;
	}
}
