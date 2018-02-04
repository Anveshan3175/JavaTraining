package com.java.lang.baiscs;

public class IfElseDemo {

    public static void main(String[] args) {

        int testscore = 76;
        char grade;

        // if-then-else construct
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
    
    // if-then construct
    void applyBrakes() {
    	
    	boolean isMoving = false;
    	int currentSpeed = 10;
    	
        // the "if" clause: bicycle must be moving
        if (isMoving){ 
            // the "then" clause: decrease current speed
            currentSpeed--;
        }
    }
}
