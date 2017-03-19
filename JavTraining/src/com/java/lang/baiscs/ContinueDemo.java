package com.java.lang.baiscs;

public class ContinueDemo {

	 public static void main(String[] args) {

	        String searchMe = "peter piper picked a " + "peck of pickled peppers";
	        int max = searchMe.length();
	        int numPs = 0;

	        for (int i = 0; i < max; i++) {
	            // interested only in p's
	            if (searchMe.charAt(i) != 'p')
	                continue;
	            // If it is a "p", the program increments the letter count. otherwise it is skipped
	            // process p's
	            numPs++;
	        }
	        System.out.println("Found " + numPs + " p's in the string.");
	    }

}


class ContinueWithLabelDemo {
    public static void main(String[] args) {

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - 
                  substring.length();

    test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found the sub string" : "Didn't find it");
    }
}