package com.java.lang.baiscs;

public class TestBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte simpleA = 79;
        System.out.println(Integer.toBinaryString(simpleA));
        byte signLeftShiftA =(byte) (simpleA << 4);
        System.out.println(signLeftShiftA);
        System.out.println("signLeftShiftA in Binary form : "+Integer.toBinaryString(signLeftShiftA));
        System.out.println("Left shift in Binary form : "+Integer.toBinaryString(simpleA << 4));
	}

}
