package com.java.fileIO;

import java.io.File;
import java.util.HashMap;
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

public class EndatedClob {
	private String _ = "hi";

	public EndatedClob() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		System.out.println(isEndatedObect());
	}
	
	/*
	 *  PS=2
	 *  has EffectiveEndDate
	 *  Only one EOrow node
	 */
	static boolean isEndatedObect() {
		File inputFile = new File("EndDatedClob_1.xml");
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();
			//   "/BUSINESSDATA/AM/TXN/EO[1]/*/CEO/EO[1]/*";
			String expression = "/TRANSACTION/BUSINESSDATA/AM/TXN/EO[1]/*/CEO/*";
			NodeList rootRowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			
			System.out.println("============Length=========================="+rootRowList.getLength());
			boolean noOfEOsGreaterThanOne = rootRowList.getLength() > 1;
			if (noOfEOsGreaterThanOne) return false; // Since number of EOs are greater than2 , it is not case of DateEnded Object
			
			expression = "/TRANSACTION/BUSINESSDATA/AM/TXN/EO[1]/*/CEO/EO[1]/*/EffectiveEndDate";
			//String expression1 = "/TRANSACTION/BUSINESSDATA/AM23/TXN/CEO[4]";
			xPath = XPathFactory.newInstance().newXPath();
            
			if(xPath.evaluate(expression, doc, XPathConstants.NODE) != null){
				return true;
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
