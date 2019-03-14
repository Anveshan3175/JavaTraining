package com.java.fileIO;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ContactEndatedClob {

	public ContactEndatedClob() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEndatedObect());
	}

	
	/*
	 *  PS=2
	 *  has EffectiveEndDate
	 *  Only one EOrow node
	 */
	static boolean isEndatedObect() {
		File inputFile = new File("EndDatedClob_ContactRelEndated_Yes.xml");
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();
			//   "/BUSINESSDATA/AM/TXN/EO[1]/*/CEO/EO[1]/*";
			String expression = "/BUSINESSDATA/AM/TXN/EO[1]/*";
			NodeList rootRowList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			
			System.out.println("============Length=========================="+rootRowList.getLength());
			boolean noOfEOsGreaterThanOne = rootRowList.getLength() > 1;
			if (noOfEOsGreaterThanOne) return false; // Since number of EOs are greater than2 , it is not case of DateEnded Object
						
            boolean isEffectiveEndDatePresent = (xPath.evaluate("/BUSINESSDATA/AM/TXN/EO[1]/*/EffectiveEndDate", doc, XPathConstants.NODE) != null);
            if(isEffectiveEndDatePresent){
                   return true;
            }
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
