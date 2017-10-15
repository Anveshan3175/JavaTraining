package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class TestHashCode {

	public TestHashCode() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Emp emp = new Emp(23);
		System.out.println("Overridden hashCode()--->>>"+emp.hashCode());
		int originalHashCode = System.identityHashCode(emp);
		System.out.println("Original hashCode of Emp---->>>"+originalHashCode); // The number is arbitrary, it depends upon your system
		
		
		Emp emp1 = new Emp(23);
		Emp emp2 = new Emp(23);
		System.out.println("emp1.equals(emp2)--->>>"+emp1.equals(emp2));
		
		Animal animalObjOne = new Animal("cat");
		Animal animalObjTwo = new Animal("dog");
		System.out.println( "The objects are equal : "+animalObjOne.equals(animalObjTwo));
		
		System.out.println("Printing animalObjOne "+animalObjOne);
		
		
		
		
		System.out.println("The object animalObj is " +animalObjOne.toString());
		System.out.println("Hashcode for Animal : "+animalObjOne.hashCode());
		
		
		List<Animal> animalList = new ArrayList<>();
		animalList.add(animalObjOne);
		animalList.add(animalObjTwo);
		System.out.println( "IS cat there in list : "+IsCatThereInList(animalList));
		
	}
	
	public static boolean IsCatThereInList(List<Animal> list){
		
		Iterator<Animal> animalItr = list.iterator();
		/*while(animalItr.hasNext()){
			if(animalItr.next().name.equals("cat")){
				return true;
			}
		}*/
		
		
		Animal animal = new Animal("cat");
		return list.contains(animal);
		
		//return false;
	}

}

/* 1. The contract in java is, if you are override one of the methods, you have to overridde another one as well.
 * 2. If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.BUt
 * vice versa need not be true
 * 3.  If equal objects must have the same hash code, then hash code computation should not include any field that is not used for equality checks.
 */
class Emp 
{
	private int age ;
	
	public Emp( int age )
	{
		super();
		this.age = age;
	}
	
	public int hashCode()
	{
		return age;
		//return Objects.hash(age);
	}
	
	public boolean equals( Object obj )
	{
		boolean flag = false;
		Emp emp = ( Emp )obj;
		if( emp.age == age )
			flag = true;
		return flag;
	}
	
	
}

class Animal {
	
	public String name;
	public int id;
	
	
	Animal(String name){
		this.name = name;
	}
	// public boolean equals(Object obj) {
	 public boolean equals(Object obj) {
		 boolean flag = false;
		 
		Animal otherAnimal = (Animal)obj;
		 if(this.name.equals(otherAnimal.name)){
			 flag = true;
		 }
		 
		 return flag;
	    }
	 
	 
	 public int hashCode(){
		return id;  //('n' + 'a' + 'm' + 'e')
		// return Objects.hash(name);
	 }
	 
	  public String toString() {
	        return "This is Animal Object.The name is : "+name;
	    }
}