package com.java.test;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee empl = new Doctor();
		empl.work();
		//empl.transfer();
	}

}

class Employee {
	
	int name;
	int empId;
	
	public void work(){
		System.out.println("In the Employee work");
	}
	
}


class Doctor extends Employee {
	
	public void work(){
		System.out.println("In the Doctor work");
	}
	
	public void transfer(){
		System.out.println("In the Doctor transfer");
	}
}
