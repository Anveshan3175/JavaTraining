package com.java.classes.objects;

public class ParametersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub

		String name = "";
		int idnum = 0;
		Object address = null;
		// vargs demo
		// public PrintStream printf(String format, Object... args)
		System.out.printf("%s: %d, %s%n", name, idnum, address);
	}

	// Simple method definition
	public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
		double interest = rate / 100.0;
		double partial1 = Math.pow((1 + interest), -numPeriods);
		double denominator = (1 - partial1) / interest;
		double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
		return answer;
	}

	// Demo f varargs
	public Polygon polygonFrom(Point... corners) {
		int numberOfSides = corners.length;
		double squareOfSide1, lengthOfSide1;
		squareOfSide1 = (corners[1].x - corners[0].x) * (corners[1].x - corners[0].x)
				+ (corners[1].y - corners[0].y) * (corners[1].y - corners[0].y);
		lengthOfSide1 = Math.sqrt(squareOfSide1);

		// more method body code follows that creates and returns a
		// polygon connecting the Points
		return new Polygon();
	}

	class Polygon {
	}

	class Point {
		public int y;
		public int x;
	}
}

class PassPrimitiveByValue {

	public static void main(String[] args) {

		int x = 3;

		// invoke passMethod() with
		// x as argument
		passMethod(x);

		// print x to see if its
		// value has changed
		System.out.println("After invoking passMethod, x = " + x);
		
		PassPrimitiveByValue testObj = new PassPrimitiveByValue();
		PassPrimitiveByValue.Circle myCircle = testObj.new Circle(12,34);
		testObj.moveCircle(myCircle, 23, 56);

	}

	// change parameter in passMethod()
	public static void passMethod(int p) {
		p = 10;
	}

	public void moveCircle(Circle circle, int deltaX, int deltaY) {
		// code to move origin of circle to x+deltaX, y+deltaY
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);

		// code to assign a new reference to circle
		circle = new Circle(0, 0);
	}

	class Circle {

		public Circle(int i, int j) {
			// TODO Auto-generated constructor stub
		}

		public int getX() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setY(int i) {
			// TODO Auto-generated method stub

		}

		public void setX(int i) {
			// TODO Auto-generated method stub

		}

		public int getY() {
			// TODO Auto-generated method stub
			return 0;
		}

	}
}
