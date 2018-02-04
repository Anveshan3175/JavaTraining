package com.java.algorithms;

public class CheckIfStringHasUniqueCharactersAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hi GeHog";
		char[] charArray = word.toCharArray();
		// System.out.println("'" + word + "'" + " has unique characters : " +
		// checkUsingSimpleWay(charArray));
		//System.out.println("'" + word + "'" + " has unique characters : " + checkUsingAsciiChar(word));
		isUniqueChars(word);
		
		/* Represent number in the 2's complement
		 * 
		 * 1. Toggle the digits and add 1
		 * 2. Ensure that number is represented by sufficient binary digits
		 */
		System.out.println("Convert to binary "+Integer.toBinaryString(25));
		System.out.println("------------------------------------------------------------------");
		leftShiftWithNegativeValue(-26);
	}

	// this algorithm results O(n^2) time complexity -> quadratic in time and
	// linear in space
	public static boolean checkUsingSimpleWay(char[] charArray) {

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				if ((i != j) && charArray[i] == charArray[j])
					return false;
			}
		}
		return true;
	}

	// This algorithm is of O(n) time and space complexity
	public static boolean checkUsingAsciiChar(String word) {

		boolean[] charArray = new boolean[256];
		for (int i = 0; i < word.length(); i++) {
			if (charArray[word.charAt(i)])
				return false; // set the char of the string in the char array
			charArray[word.charAt(i)] = true;
		}
		return true;
	}

	
	/*
	 * Specifically, (1<<val) generates an integer with a single 1 bit in position val. For example, (1<<3) would be binary 1000, or 8. The expression checker & (1<<val) will return zero if 
	 * the bit in position val is not set (that is, has value 0) in checker, and (1<<val), which is always non-zero, if that bit is set. The expression checker |= (1<<val) will set that bit in checker.
	 */
	public static boolean isUniqueChars(String str) {
		
		// short circuit - supposed to imply that
	    // there are no more than 256 different characters.
	    // this is broken, because in Java, char's are Unicode,
	    // and 2-byte values so there are 32768 values
	    // (or so - technically not all 32768 are valid chars)
	    if (str.length() > 256) {
	        return false;
	    }
	    // checker is used as a bitmap to indicate which characters
	    // have been seen already
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {

	        // set val to be the difference between the char at i and 'a'
	        // unicode 'a' is 97
	        // if you have an upper-case letter e.g. 'A' you will get a
	        // negative 'val' which is illegal
			int val = str.charAt(i) - 'a';
			System.out.println("Printing 'val' "+val +" and its binary  : "+Integer.toBinaryString(val));
			System.out.println("Printing '1 << val' "+Integer.toBinaryString(1 << val));
			
			// if this lowercase letter has been seen before, then
	        // the corresponding bit in checker will have been set and
	        // we can exit immediately
			if ((checker & (1 << val)) > 0)
				return false;
			// set the bit to indicate we have now seen the letter.
			checker |= (1 << val);
		}
		
		
		return true;
	}

	// 11111111111111111111111111100110   for -26  consider last 5 bits = 6
	private static void leftShiftWithNegativeValue(int a){
		//if a = -63   -63 & 0x1f == 1, So this is actually a shift by 1 to the right, hence the answer of 4
		System.out.println(a & (0x1f));
		System.out.println("a is : "+a +" and it binay rep is "+Integer.toBinaryString(a));
		System.out.println( "Left shift with negative number : "+Integer.toBinaryString(1 << a));
	}
}
