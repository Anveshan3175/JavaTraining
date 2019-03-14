package com.java.threads;

public class PrintOddEvenNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable evenTask = () -> {
			for (int i = 0 ; i < 50; ){
				System.out.println(i);
				i = i+2;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		new Thread(evenTask).start();
		
		Runnable oddTask = () -> {
			for (int i = 1 ; i < 50; ){
				System.out.println(i);
				i = i+2;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		new Thread(oddTask).start();
	}

}


class EvenNumber implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < 50; ){
			System.out.println(i);
			i = i+2;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class OddNumber implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1 ; i < 50; ){
			System.out.println(i);
			i = i+2;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}