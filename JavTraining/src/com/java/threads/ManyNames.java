package com.java.threads;

public class ManyNames {
	 public static void main(String [] args) {
		 // Make one Runnable
		 System.out.println("Run by " + Thread.currentThread().getName());
		 NameRunnable nr = new NameRunnable();
		 Thread one = new Thread(nr);
		 Thread two = new Thread(nr);
		 Thread three = new Thread(nr);
		 one.setName("Fred");
		 two.setName("Lucy");
		 three.setName("Ricky");
		 one.start();
		 two.start();
		 three.start();
		 System.out.println("Run by " + Thread.currentThread().getName());
		 
	 }
}


class NameRunnable implements Runnable {
	 public  void run() {
		 for (int x = 1; x <= 5; x++) {
			System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + x);  // order is not guaranteed
		 }
	 }
}