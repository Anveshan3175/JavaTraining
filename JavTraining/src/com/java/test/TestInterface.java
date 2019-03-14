package com.java.test;

public class TestInterface {

	public TxmMatching test(){
	      String strName = "com.java.test.PITxnMatching";
	      
          try {
              Class instr = Class.forName(strName);
              return ((TxmMatching)instr.newInstance());
          } catch (ClassNotFoundException e) {                
                  return null;
          } catch (IllegalAccessException e) {
              throw new RuntimeException(e);
          }
          catch (InstantiationException e) {
              throw new RuntimeException(e);
          }
	}
	
	
	public static void main(String[] args){
		
	}
}
