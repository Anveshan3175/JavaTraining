package com.java.threads;

public class SimpleWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object lock = new Object();
		
		Runnable simpleTask = () -> {
			synchronized(lock) {
				for (int i = 0; i < 1; i++){
					System.out.println("Value "+i+", ");
					 try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
				}
			}
			System.out.println("Exiting block");				
		};
		
		System.out.println("--- Main -----");
		Thread t1 = new Thread(simpleTask);
		t1.start();
		System.out.println("--- Main threade invoked-----");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Before block");
		synchronized (lock) {
			lock.notify();
		}
		
		
		System.out.println("After block");
		
		 try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 System.out.println("ENd of main");
	}

}


