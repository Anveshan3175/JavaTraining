package com.java.fileIO;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ExtractOrderEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExtractOrderEO().extractEOMap();
	}
	
	
	boolean extractEOMap() {
		File inputFile = new File("OrderEOMap.xml");
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();
			//   "/BUSINESSDATA/AM/TXN/EO[1]/*/CEO/EO[1]/*";
			String expression = "/TRANSACTION/TransCtx/HrcTxnValues/EONAMESMAP/*";
			NodeList rootRowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			
			String eoName = rootRowList.item(0).getNodeName();
			String eoValue = rootRowList.item(0).getTextContent();
			System.out.println(eoName);
			System.out.println("getTextContent : "+eoValue);
			
			
			System.out.println("============Length========================== : "+rootRowList.getLength());
			boolean noOfEOsGreaterThanOne = rootRowList.getLength() > 1;
			if (noOfEOsGreaterThanOne) return false; // Since number of EOs are greater than2 , it is not case of DateEnded Object
						
            boolean isPersonEOPresent = (xPath.evaluate("/TRANSACTION/BUSINESSDATA/AM/TXN/EO[@Name='oracle.apps.hcm.people.core.protectedModel.entity.PersonEO']", doc, XPathConstants.NODE) != null);
            //System.out.println("isPersonEOPresent : "+ isPersonEOPresent);
            
            //boolean isPhoneEOPresent = (xPath.evaluate("/TRANSACTION/BUSINESSDATA/AM/TXN/EO/PersonEORow/CEO/EO[@Name='oracle.apps.hcm.people.core.protectedModel.entity.PhoneEO']", doc, XPathConstants.NODE) != null);
            boolean isPhoneEOPresent = (xPath.evaluate("/TRANSACTION/BUSINESSDATA/AM/TXN/EO/*/*/EO[@Name='"+eoName+"']", doc, XPathConstants.NODE) != null);
            //System.out.println("isPhoneEOPresent : "+ isPhoneEOPresent);
            
            NodeList eoRowList = (NodeList) xPath.compile("/TRANSACTION/BUSINESSDATA/AM/TXN/*").evaluate(doc, XPathConstants.NODESET);
            StringBuffer operation = new StringBuffer();
            getEoRowList(eoRowList,eoName,operation);
            System.out.println("operation is "+operation); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public void getEoRowList(NodeList eoRowList,String eoName,StringBuffer opertaion){
		for (int i = 0; i < eoRowList.getLength(); i++) {
			Node node = eoRowList.item(i);
			if(null != node.getAttributes() && null != node.getAttributes().getNamedItem("Name")){
				String nodeName = node.getAttributes().getNamedItem("Name").getNodeValue();
				if(nodeName.equals(eoName)) {
					Node cnode = node.getChildNodes().item(3);
					opertaion.append(cnode.getAttributes().getNamedItem("PS").getNodeValue()); 
					System.out.println("----node Name----------"+nodeName);
					return;
				}
				else {
					getEoRowList(node.getChildNodes(),eoName,opertaion);
				}
			}
			else {
				getEoRowList(node.getChildNodes(),eoName,opertaion);
			}	
        }
	}

}
