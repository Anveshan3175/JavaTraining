package com.java.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeCat {
	 public static void main(String[] args) {
		/*Cat c = new Cat("Bell"); // 2
		try {
			 FileOutputStream fs = new FileOutputStream("testSer.txt");
			 ObjectOutputStream os = new ObjectOutputStream(fs);
			 os.writeObject(c); // 3
			 os.close();
		} catch (Exception e) 
		{ 
			e.printStackTrace(); 
		}*/
		try {
			 FileInputStream fis = new FileInputStream("testSer.txt");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 Cat c1 = (Cat) ois.readObject(); // 4
			 System.out.println(c1);
			ois.close();
		 } catch (Exception e) 
		 { 
			e.printStackTrace(); 
		 }
		 
		 
	 }
}

class Cat implements Serializable {
	
	private String name;

	Cat(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
	
}