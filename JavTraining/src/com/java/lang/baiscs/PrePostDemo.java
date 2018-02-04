package com.java.lang.baiscs;

public class PrePostDemo {

	   public static void main(String[] args){
	        int i = 3;
	        i++;
	        // prints 4
	        System.out.println(i);
	        ++i;			   
	        // prints 5
	        System.out.println(i);
	        // prints 6
	        System.out.println(++i);
	        // prints 6
	        System.out.println(i++);
	        // prints 7
	        System.out.println(i);
	        
	        int j = 30;
	        
	        if((i > j) ){
	        	System.out.println("i > j");
	        }
	        else {
	        	System.out.println("i < j");
	        }
	        
	         System.out.println((i > j) ? "i > j" : "i > j");
	    }
}
