package com.java.string;

public class TestStrings {

    static String XML_NAMESPACE = "<?xml version='1.0' encoding='UTF-8'?>";
    static String SPACE = "   ";
    static String EQUAL = "=";
    static String JSP_ROOT_TAG_START = "<jsp:root ";
    static String JSP_ROOT_TAG_END = ">";
    static String JSP_PAGE_NS = "xmlns:jsp= " +"http://java.sun.com/JSP/Page" +" version=\"2.1\"";
    static String JSF_CORE_LIB_NS = "xmlns:f="+"http://java.sun.com/jsf/core";
    static String JSP_HTML_LIB_NS = "xmlns:h="+"http://java.sun.com/jsf/html";
    static String ADF_FACES_RICH_NS = "xmlns:af=\"http://xmlns.oracle.com/adf/faces/rich\"";
    static String ADF_PAGE_EDITOR_NS = "xmlns:pe=\"http://xmlns.oracle.com/adf/pageeditor\"";
    static String ADF_CUST_NS = "xmlns:cust=\"http://xmlns.oracle.com/adf/faces/customizable\"";
    static String ADF_CUST_HTML_NS = "xmlns:custh=\"http://xmlns.oracle.com/adf/faces/customizable/html\"";
    static String JSP_DIRECTIVE = "<jsp:directive.page contentType=\"text/html;charset=UTF-8\"/>";
    static String NEW_LINE = "\n";
    static String  FVIEW_TAG_START = "<f:view>";
    static String  FVIEW_TAG_END = "</f:view>";
    static String DOCUMENT_START_TAG = "<af:document id=\"****\" styleClass=\"fusePlus-container\">";
    
    static  int documentId;
    
    public static void main(String[] args){
    	
    	StringBuffer sb = new StringBuffer();

    	sb.append(XML_NAMESPACE);
    	sb.append(NEW_LINE);
    	sb.append(JSP_ROOT_TAG_START);
    	sb.append(JSP_PAGE_NS);
    	sb.append(NEW_LINE);
    	sb.append(SPACE);
    	sb.append(JSF_CORE_LIB_NS);
    	sb.append(NEW_LINE);
    	sb.append(SPACE);
    	sb.append(JSP_HTML_LIB_NS);
    	sb.append(NEW_LINE);
    	sb.append(SPACE);
    	sb.append(ADF_FACES_RICH_NS);
    	sb.append(NEW_LINE);
    	sb.append(SPACE);
    	sb.append(ADF_PAGE_EDITOR_NS);
    	sb.append(NEW_LINE);
    	sb.append(SPACE);
    	sb.append(ADF_CUST_NS);
    	sb.append(NEW_LINE);
    	sb.append(SPACE);
    	sb.append(ADF_CUST_HTML_NS);
    	sb.append(JSP_ROOT_TAG_END);
    	sb.append(NEW_LINE);
    	sb.append(JSP_DIRECTIVE);
    	sb.append(NEW_LINE);
    	sb.append(FVIEW_TAG_START);
    	sb.append(NEW_LINE);
    	sb.append(FVIEW_TAG_END);
    	sb.append(NEW_LINE);
    	
    	sb.append(DOCUMENT_START_TAG.replace("****", "d"+documentId++));
    	sb.append(NEW_LINE);
    	sb.append(DOCUMENT_START_TAG.replace("****", "d"+documentId++));
    	System.out.println(sb.toString());
    }
}
