package com.java.algorithms;


/*
 * An activist, of a banned organisation, plans to escape from Bhopal jail. The activist is basically a monkey man and is able to jump across the wall. 
 * He practises to cross a wall. He is able to jump 'X' meters, but because of the slippery wall he falls 'Y' meters after each jump. To escape from jail, he has to cross 'N' number of walls, 
 * where height of each wall is given in an array.
 * Write a program to find out the total number of jumps he has make, to escape from the Bhopal jail.
 * 
 * Your function will take three arguments
 * Argument 1: An integer depicting X
 * Argument 2: An integer depicting Y
 * Argument 3: An array of N integers having the height of each wall
 * 
 * Your program should return total number of jumps required to escape.
 * 
 * i/p
 * 10
 * 1
 * 1
 * 10
 * 
 * o/p
 * 1
 * -------------------
 * 5
 * 1
 * 2
 * 9
 * 10
 * 
 * o/p
 * 5
 * 
 */
public class ClimbingWall {

	public ClimbingWall() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int jump = 5;  // input1
		int slide = 1; // // input2
		int[] walls = {9,10}; // input3 is int[]
		int noOfJumps = 0, remainingHeightOfWell=0;
		
		for(int heightOfWall : walls){
			remainingHeightOfWell = heightOfWall;
			do{
				noOfJumps++;
				remainingHeightOfWell = remainingHeightOfWell - jump;
				if(remainingHeightOfWell <= 0) break;
				remainingHeightOfWell = remainingHeightOfWell + slide;
				
				
			}while(true);
		}
		
		System.out.println("Total number of Jumps : "+noOfJumps);
		
	}

}
