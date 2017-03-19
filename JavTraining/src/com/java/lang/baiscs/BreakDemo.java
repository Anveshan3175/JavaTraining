package com.java.lang.baiscs;

public class BreakDemo {

	public static void main(String[] args) {

		int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int searchfor = 12;

		int i;
		boolean foundIt = false;

		// The break statement, shown in boldface, terminates the for loop when
		// that value is found.
		// Control flow then transfers to the statement after the for loop
		for (i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] == searchfor) {
				foundIt = true;
				break;
			}
		}

		if (foundIt) {
			System.out.println("Found " + searchfor + " at index " + i);
		} else {
			System.out.println(searchfor + " not in the array");
		}
	}

}

class BreakWithLabelDemo {
	public static void main(String[] args) {

		int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };
		int searchfor = 12;

		int i;
		int j = 0;
		boolean foundIt = false;

		search: for (i = 0; i < arrayOfInts.length; i++) {
			for (j = 0; j < arrayOfInts[i].length; j++) {
				if (arrayOfInts[i][j] == searchfor) {
					foundIt = true;
					// The break statement terminates the labeled statement; it
					// does not transfer the flow of control to the label.
					// Control flow is transferred to the statement immediately
					// following the labeled (terminated) statement.
					break search;
				}
			}
		}

		if (foundIt) {
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		} else {
			System.out.println(searchfor + " not in the array");
		}
	}
}

class LabelTest {
    public static void main(String[] args) {
        label1: System.out.println("");
        label2: {LabelTest t = new LabelTest();}  
    //label cannot be applied to variable declarations : http://stackoverflow.com/questions/5057931/using-labels-in-java-without-loops/19799375#19799375
    //LabelTest1 t1 = new LabelTest();
    }                                               
}
