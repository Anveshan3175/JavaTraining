package com.java.threads;

public class TestThreads {
	 public static void main (String [] args) {
		 MyRunnable r = new MyRunnable();
		 Thread foo = new Thread(r,"foo");
		 Thread bar = new Thread(r,"bar");
		 Thread bat = new Thread(r,"bat");
		 foo.start();  //-- main thread, foo thread
		 bar.start(); // main, foo, bar
		 bat.start();
	 }
}



class MyRunnable implements Runnable {
	 public void run() {
		System.out.println("Important job running in MyRunnable"+Thread.currentThread());
	 }
}