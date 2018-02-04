package com.anvesh.features;

import java.util.List;
/*
 * The @SafeVarargs annotation can only be applied to methods which cannot
 * be overridden, including static methods and final instance methods.
 * 
 * java 9 : Private instance methods are another use case that @SafeVargs could 
 * accommodate
 */

public class TestSafeVarargs {

	@SafeVarargs   // Remove this and you will warnings Till java 8
	static void printList(List<String>... strList) {
		String firstElementInFirstList = strList[0].get(0);
		System.out.println(firstElementInFirstList);
		
	}
	
	public static void main(String... args) {
		List<String> fruitList = List.of("Mango", "Apple", "Jackfruit");
		List<String> animalList = List.of("Lion", "Tiger", "Wolf");
		
		printList(fruitList,animalList);
		
		new TestSafeVarargs().displayList(fruitList,animalList);
	}
	
	@SafeVarargs   // java 9 inclusion
	private void displayList(List<String>... strList) {
		String firstElementInFirstList = strList[0].get(0);
		System.out.println(firstElementInFirstList);
		
	}
}
