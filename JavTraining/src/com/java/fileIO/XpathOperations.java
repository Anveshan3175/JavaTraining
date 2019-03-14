package com.java.fileIO;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XpathOperations {

	public static void main(String[] args) {
		// System.out.println(fetchFromCompare( "PhoneNumber"));
		//fetchSubObjId();
		fetchOperation();
		//fetchDelOperation();
		//fetchViewAttributes();
		//fetchViewAttributesWithOutXpath();
		
	}

	static void fetchViewAttributesWithOutXpath() {
		File inputFile = new File("viewdef.txt");
		System.out.println("File Exists ? "+inputFile.exists());
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
            dBuilder.setEntityResolver(new EntityResolver() {
                @Override
                public InputSource resolveEntity(String publicId, String systemId)
                        throws SAXException, IOException {
                    if (systemId.contains("jbo_03_01.dtd")) {
                        return new InputSource(new StringReader(""));
                    } else {
                        return null;
                    }
                }
            });

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
			NodeList entityObjectNodeList = doc.getElementsByTagName("ViewAttribute");
            
          for(int i = 0; i < entityObjectNodeList.getLength() ; i ++){
        	  Element eElement = (Element) entityObjectNodeList.item(i);
  				System.out.println(eElement.getAttribute("Name"));
          }
            
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	static void fetchViewAttributes() {
		File inputFile = new File("viewdef.txt");
		System.out.println("File Exists ? "+inputFile.exists());
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			
			dbFactory.setValidating(false);
			dbFactory.setNamespaceAware(true);
			dbFactory.setFeature("http://xml.org/sax/features/namespaces", false);
			dbFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
			//dbFactory.setFeature("http://xml.org/sax/features/validation", false);
			//dbFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
			

			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
            XPath xPath = XPathFactory.newInstance().newXPath();

            String expression = "/ViewObject/ViewAttribute";

            NodeList entityObjectNodeList =
                (NodeList)xPath.compile(expression).evaluate(doc,
                                                             XPathConstants.NODESET);
            
          for(int i = 0; i < entityObjectNodeList.getLength() ; i ++){
        	  Element eElement = (Element) entityObjectNodeList.item(i);
  				System.out.println(eElement.getAttribute("Name"));
          }
            
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	static void fetchDelOperation() {
		File inputFile = new File("atomicCache.xml");
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();


			
			
			
            XPath xPath = XPathFactory.newInstance().newXPath();

            String expression = "/BUSINESSDATA/AM/TXN/EO[1]/*/CEO/EO[1]/*";
            
            if(xPath.evaluate(expression, doc, XPathConstants.NODE) == null){
                expression = "/BUSINESSDATA/AM/TXN/EO[1]/*";
            }
            NodeList entityObjectNodeList =
                (NodeList)xPath.compile(expression).evaluate(doc,
                                                             XPathConstants.NODESET);
            
            
            
			Element eElement = (Element) entityObjectNodeList.item(0);
			System.out.println(eElement.getAttribute("PS"));
			System.out.println(getOperation(Integer.parseInt(eElement.getAttribute("PS"))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	static void fetchOperation() {
		File inputFile = new File("EndDatedClob_1.xml");
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();

			//String expression = "/BUSINESSDATA/AM/TXN/EO[1]/*";
			//String expression = "/TRANSACTION/BUSINESSDATA/AM/TXN/EO[1]/PersonEORow/CEO/EO[1]/*";
			String expression = "/BUSINESSDATA/AM/TXN/EO[1]/*/CEO/EO[1]/*";
			
            boolean isTxnHavingChildEntityObjects =
                    xPath.evaluate(expression, doc, XPathConstants.NODE) != null;
                if (!isTxnHavingChildEntityObjects) {
                    expression = "/BUSINESSDATA/AM/TXN/EO[1]/*";
                }
                NodeList entityObjectNodeList =
                    (NodeList)xPath.compile(expression).evaluate(doc,
                                                                 XPathConstants.NODESET);
                Element entityObjectElement =
                    (Element)entityObjectNodeList.item(0);
                

			System.out.println(entityObjectElement.getAttribute("PS"));
			System.out.println(getOperation(Integer.parseInt(entityObjectElement.getAttribute("PS"))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
    private static String getOperation(int ps){
        switch(ps){
          case 0: return "New";
          case 1: return "No Change";
          case 3: return "Delete";
          case 2: return "Update";
        }
        return null;
      }
	static String fetchSubObjId() {

		File inputFile = new File("datacache.xml");
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();

			String expression = "/TRANSACTION/TransCtx/HrcTxnValues";

			NodeList rowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			Element eElement = (Element) rowList.item(0);
			System.out.println(eElement.getElementsByTagName("ObjectId").item(0).getTextContent());
			System.out.println(eElement.getElementsByTagName("SubjectId").item(0).getTextContent());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
