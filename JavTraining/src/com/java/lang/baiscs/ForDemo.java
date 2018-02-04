package com.java.lang.baiscs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForDemo {

	   public static void main(String[] args){
	         for(int i=1; i<11; i++){
	              System.out.println("Count is: " + i);
	         }
	         
	         for(;;){
	        	 int i=1;
	        	 if( i<11)
	        		 System.out.println("Count is: " + i);
	              i++;
	         }
	    }

}


class EnhancedForDemo {
    public static void main(String[] args){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
         
         char[] letters = {'r','t','y'};
         for(char alphabet: letters){
        	 int sum = alphabet + 12;
        	 System.out.println("sum : " +sum);
         }
       
         List<String> strList = new ArrayList();
         strList.add("Hello");
         strList.add("How");
         strList.add("are");
         
         for(String strElement : strList){
        	 System.out.println(strElement);
         }
         
    }
}