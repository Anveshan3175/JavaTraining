package com.java.collections;

public class TestCollection {

	public TestCollection() {
		// TODO Auto-generated constructor stub
		AbtractListPartialImpl list = new AbtractListImplExt();
		
	}

}


interface IList{
	public static final int FINAL_LEVEL = 10;
	int MEDIUM_LEVEL = 5;
	int LOWER_LEVEL = 1;
	
	int sum();
	
	default int remove(){
		return 12;
	}
}

abstract class AbtractList implements IList{
	
	void method1(){
		System.out.println("Hello");
	}
	
	public abstract int  method2();
	
	public abstract String  method3();
}

abstract class AbtractListPartialImpl extends AbtractList{
	
	public int  method2(){
		return 4;
	}
}

class AbtractListImpl extends AbtractListPartialImpl{
	
	public String  method3(){
		return "";
	}
	
	public int sum(){
		return 6;
	}
}

class AbtractListImplExt extends AbtractListPartialImpl{
	
	public String  method3(){
		return "";
	}
	
	public int sum(){
		return 6;
	}
}