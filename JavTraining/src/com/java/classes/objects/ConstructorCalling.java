package com.java.classes.objects;

public class ConstructorCalling {

	public ConstructorCalling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassC();
	}

}


class ClassA
{
	ClassA()    
	{
		System.out.println("One");    
	}
}
class ClassB extends ClassA
{
	ClassB()    
	{    
		System.out.println("Two");    
	}
	
	ClassB(int i)
	{
        System.out.println("Four");
    }
}
class ClassC extends ClassB
{
	ClassC()    
	{    
		super(10);  // Comment this line and no-arg constructor in classB, you will get compile error. Super()(placed by compiler) needs default constructor
		System.out.println("Three");    
	}
}