package com.java.client;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;

public class ClientConnectionTest
{
   static
   {
      System.setProperty("javax.net.ssl.trustStore", "D:/Software/SSLs/HttpClientProj/client.jks");
      System.setProperty("javax.net.ssl.trustStorePassword", "password");
      System.setProperty("javax.net.ssl.keyStore", "D:/Software/SSLs/HttpClientProj/client.jks");
      System.setProperty("javax.net.ssl.keyStorePassword", "password");
      
      
      /* Invalid SSL
      System.setProperty("javax.net.ssl.trustStore", "D:/Software/SSLs/HttpClientProj/keystore.jks");
      System.setProperty("javax.net.ssl.trustStorePassword", "password");
      System.setProperty("javax.net.ssl.keyStore", "D:/Software/SSLs/HttpClientProj/keystore.jks");
      System.setProperty("javax.net.ssl.keyStorePassword", "password"); */
   }
 
   /**
    * @param args
    * @throws IOException 
    * @throws HttpException 
    */
   public static void main(String[] args) throws HttpException, IOException
   {
      HttpClient client = new HttpClient();
      GetMethod method = new GetMethod();
      method.setURI(new URI("https://localhost:8443", false));
      //method.setURI(new URI("http://localhost:8088/", false));
      
      client.executeMethod(method);
 
      System.out.println(method.getResponseBodyAsString());
   }
}