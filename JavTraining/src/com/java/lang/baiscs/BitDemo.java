package com.java.lang.baiscs;

public class BitDemo {

	public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
         
       /* byte simpleA = 77;
        byte iverseA =(byte) (~ simpleA);
        System.out.println("simpleA : "+simpleA +" iverseA : "+iverseA);
        System.out.println("simpleA in Binary form : "+Integer.toBinaryString(simpleA));
        System.out.println("iverseA in Binary form : "+Integer.toBinaryString(iverseA));
        
        System.out.println();
        byte d = 79;
        byte e =(byte) (~ d);
        System.out.println("d :"+d +" e :"+e);
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(e));
        byte signLeftShiftA =(byte) (simpleA << 4);
        System.out.println("signLeftShiftA in Binary form : "+Integer.toBinaryString(signLeftShiftA));
        //System.out.println("d :"+d +" e :"+e);
        
        byte signRightShiftA =(byte) (simpleA >> 4);
        System.out.println("signRightShiftA in Binary form : "+Integer.toBinaryString(signRightShiftA));
        
        byte unSignedRightShiftA =(byte) (simpleA >>> 4);
        System.out.println("unSignedRightShiftA in Binary form : "+Integer.toBinaryString(unSignedRightShiftA));
        
        System.out.println("2 : "+Integer.toBinaryString(2)); //  0000000000000010
        System.out.println("2 << 11 "+Integer.toBinaryString(2 << 11)); // 00010000 00000000  10000 00000000
        
        
        int simpleIntA = 77;
        System.out.println("simpleIntA in Binary form : "+Integer.toBinaryString(simpleIntA << 4));*/
        
        
        
        int simpleA = 77;
        int iverseA = (~ simpleA);
        System.out.println("simpleA : "+simpleA +" iverseA : "+iverseA);
        System.out.println();
        System.out.println("simpleA in Binary form : "+Integer.toBinaryString(simpleA));
        System.out.println("iverseA in Binary form : "+Integer.toBinaryString(iverseA));
        
        int signLeftShiftA = (simpleA << 4);
        System.out.println("signLeftShiftA in Binary form : "+Integer.toBinaryString(signLeftShiftA));
        
        int signRightShiftA = (simpleA >> 4);
        System.out.println("signRightShiftA in Binary form : "+Integer.toBinaryString(signRightShiftA));
        
        int unSignedRightShiftA = (simpleA >>> 4);
        System.out.println("unSignedRightShiftA in Binary form : "+Integer.toBinaryString(unSignedRightShiftA));
        
    }
}
