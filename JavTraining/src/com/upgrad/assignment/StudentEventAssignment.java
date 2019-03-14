package com.upgrad.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 *  1. Collect the input from user and each entry from user is populated as Input
 *  2. Create the Priority Queue. This priority Queue , when POLLed, does SERVED  
 *  3. Input,Student are bean classes
 *  4. StudentComparator does sorting based on criteria mentioned
 */
public class StudentEventAssignment {

	/* Collect input */
	public List<Input> collectInput() {
		
		List<Input> inputList = new ArrayList<Input>();
		
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the input size");
		
		int inputSize = Integer.parseInt(scannerObject.nextLine());
		for(int i = 0; i < inputSize ; i++) {
			System.out.println("Enter the event");
			String rawInput = scannerObject.nextLine();
			if (rawInput.equals("SERVED")){
				inputList.add(new Input("SERVED", null));
			}
			else {
				String[] inputSplit = rawInput.split(" ");
				inputList.add(new Input(inputSplit[0],new Student(inputSplit[1], Float.parseFloat(inputSplit[2]), Integer.parseInt(inputSplit[3]))));
			}
		}
		System.out.println("Printing Input List : "+inputList);
		scannerObject.close();
		System.out.println("");
		return inputList;
	}

	// Create priority queue
	public void createPriorityStudentQueue(List<Input> inputs){
		
		PriorityQueue<Student> studentPriorityQueue = new 
	             PriorityQueue<Student>(new StudentComparator()); 
		
		for(Input input : inputs){
			if("ENTER".equals(input.getEvent() )){
				studentPriorityQueue.add(input.getStudent());
			}
			else{
				studentPriorityQueue.poll();  // Served is implemented here 
			}
			System.out.println("Contents of Priority Queue : "+studentPriorityQueue);
		}
		
		
	}
	
	// Testing
	public static void main(String[] args){
		
		StudentEventAssignment assignment =  new StudentEventAssignment();
		List<Input> inputList  = assignment.collectInput();
		assignment.createPriorityStudentQueue(inputList);
	}
	
}	
//Input
	class Input {

		private String event;
		private Student student;

		public String getEvent() {
			return event;
		}

		public void setEvent(String event) {
			this.event = event;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		@Override
		public String toString() {
			return "Input [event=" + event + ", student=" + student + "]";
		}

		public Input(String event, Student student) {
			super();
			this.event = event;
			this.student = student;
		}
	}

	//Student
	class Student {

		private String name;
		private float cgpa;
		private int token;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getCgpa() {
			return cgpa;
		}

		public void setCgpa(float cgpa) {
			this.cgpa = cgpa;
		}

		public int getToken() {
			return token;
		}

		public void setToken(int token) {
			this.token = token;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", cgpa=" + cgpa + ", token=" + token + "]";
		}

		public Student(String name, float cgpa, int token) {
			super();
			this.name = name;
			this.cgpa = cgpa;
			this.token = token;
		}
	}
	
	//Comparator
	class StudentComparator implements Comparator<Student>{
		@Override
		public int compare(Student std1, Student std2) {
			// TODO Auto-generated method stub
			int value = 0;
			// Check for greater CGPA
			value = new Float(std2.getCgpa()).compareTo(new Float(std1.getCgpa()));
			// Check for increasing alphabetical order
			if(value == 0) {
				value = std1.getName().compareTo(std2.getName());
			}
			//Check for increasing Token
			if(value == 0) {
				value = new Integer(std1.getToken()).compareTo( new Integer(std2.getName()));
			}
			return value;
		}
	}
