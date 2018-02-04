package com.java.lang.baiscs;

public class WhileDemo {

	public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
        
        //You can implement an infinite loop using the while statement as follows
        while (true){
            // your code goes here
        }
    }

}


class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}