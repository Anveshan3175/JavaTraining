package com.java.fileIO;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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

public class TransactionXmlHelper {

	public TransactionXmlHelper() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		new TransactionXmlHelper().retrieveTxnCompare();
		//print();
	}
	
	public Map<String, List<ComparePojo>> retrieveTxnCompare() {
		//File inputFile = new File("ManagerClob.xml");
		File inputFile = new File("AssignmentDetailsReview_DFFOrder.xml");
		
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();
				
			String expression = "/COMPAREDATA/CompareVO";
			NodeList rootRowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
            Map<String, List<ComparePojo>> map =
                    new LinkedHashMap<String, List<ComparePojo>>();
			extractRows(rootRowList.item(0), map);
			System.out.println(map);
			return map;
		} catch (Exception xpee) {
			// TODO: Add catch code
			//throw new Exception(xpee);
		}
		// Extracts all VO rows under compareVO
		return null;
	}

	private void extractRows(Node node, Map<String, List<ComparePojo>> map) {
		boolean isNodeAnAttributeComparsion = node.getNodeName().equals("Compare");
		if (isNodeAnAttributeComparsion)
			return; // Compare attributes are handled in seperate method
					// extractCompare().

		NodeList voNodeList = node.getChildNodes();
		for (int i = 0; i < voNodeList.getLength(); i++) {
			Node voNode = voNodeList.item(i);

			boolean isVONodeCorrespondsToRow = voNode.getNodeType() == Node.ELEMENT_NODE
					&& (voNode.getNodeName().contains("Row") || voNode.getNodeName().equals("CompareVO"));
			if (isVONodeCorrespondsToRow) {
				Map<String, ComparisonAttribute> compareMap = extractCompare(voNode.getChildNodes());
				String voName = voNode.getNodeName().replace("Row", "");
				boolean isVOOfDefaultType = "default".equalsIgnoreCase(((Element)voNode).getAttribute("operationType"));
				
				if(!isVOOfDefaultType){
				// This is where a pojo wich corresponds to VO in compare clob
				// is created ad each pojo will have list of compareVO
				ComparePojo voCompareImage = new ComparePojo();
				voCompareImage.setCompareMap(compareMap);
				voCompareImage.setName(voName);

				List<ComparePojo> pojoList = map.get(voName);
				boolean needToInitializeList = (pojoList == null);
				if (needToInitializeList) {
					pojoList = new ArrayList<ComparePojo>();
				}
				pojoList.add(voCompareImage);
				map.put(voName, pojoList);
				}
				extractRows(voNode, map); // recursion is need to handle nested
											// VOs in the clob
			}
		}
	}

	private Map<String, ComparisonAttribute> extractCompare(NodeList compareList) {
		Map<String, ComparisonAttribute> compareMap = new LinkedHashMap<String, ComparisonAttribute>();
		for (int j = 0; j < compareList.getLength(); j++) {
			Node cNode = compareList.item(j);
			if (cNode.getNodeType() == Node.ELEMENT_NODE && cNode.getNodeName().equals("Compare")) {
				Element cElement = (Element) cNode;

				ComparisonAttribute attributeComparison = new ComparisonAttribute();
				attributeComparison
						.setAttributeName(cElement.getElementsByTagName("AttributeName").item(0).getTextContent());
				attributeComparison.setOldValue(cElement.getElementsByTagName("OldValue").item(0).getTextContent());
				attributeComparison.setNewValue(cElement.getElementsByTagName("NewValue").item(0).getTextContent());
				attributeComparison
						.setResBundle(cElement.getElementsByTagName("ResourceBundle").item(0).getTextContent());
				attributeComparison.setResKey(cElement.getElementsByTagName("ResourceKey").item(0).getTextContent());

				compareMap.put(attributeComparison.getAttributeName(), attributeComparison);
			}
		}
		return compareMap;
	}
}
