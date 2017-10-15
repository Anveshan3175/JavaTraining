package com.java.exception;

public class TestNull {

	public TestNull() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;
		try{
			System.out.println(s.charAt(0));  
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("NUll pointer  : "+e.getCause());
		}
		catch(NullPointerException e){
			System.out.println("NUll pointer  : "+e.getCause());
		}
		
		System.out.println("Outside NUll pointer");
	}

}
