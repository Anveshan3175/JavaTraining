package com.java.confDetection;

import java.util.ArrayList;
import java.util.List;

public class TxnChangeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TxnChangeList tcl = new TxnChangeList();
		tcl.addObjectId("123213");
		tcl.addObjectId("234324");
		tcl.addObjectId("345435");
		tcl.addObjectId("456546");
		
		System.out.println(tcl.objectIds);
		
		System.out.println(tcl.getObjectIdList());
	}
	
	
    private String objectIds;
    
    
    public void addObjectId(String objectId){
    	if (objectIds == null) objectIds = objectId;
        objectIds = objectIds + ","+objectId;
    }
    
    public List<Long> getObjectIdList(){
        
    	if (objectIds == null) return null;
    	String[] strs = objectIds.trim().split(",");
    	System.out.println("strs"+strs[0]);
    	
    	List<Long> objIds = new ArrayList<Long>();
    	for(String str : strs) {
    		System.out.println("Str"+str);
    		objIds.add(Long.valueOf(str));
    	}
    	
    	return objIds;
    }

}
