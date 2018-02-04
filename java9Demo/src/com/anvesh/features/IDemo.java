package com.anvesh.features;

/*
 * No need to write duplicate code, hence more code reusability.
 * We got the choice to expose only our intended methods implementations to clients.
 */
public interface IDemo {

	public static final String ONE = "1";
	
	// Java 8 prior methods
	public abstract String getDemoValue();
	
	// Java 8 feature 
	public default  void printDemo() {
		System.out.println("This is Default method in Demo");
	}
	
	// java 9 feature
	private void printPrivateDemo() {
		System.out.println("This is printPrivateDemo ");
	}
	
	
	private static String getStaticStringFromDemo() {
		return ONE;
	}
	
}
