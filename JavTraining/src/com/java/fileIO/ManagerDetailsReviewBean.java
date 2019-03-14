package com.java.fileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import com.java.fileIO.ComparePojo;
import com.java.fileIO.ComparisonAttribute;


public class ManagerDetailsReviewBean {
  public ManagerDetailsReviewBean() {
    super();
    getManagerDetailstoShow();
  }

  private Map<String, List<ComparePojo>> comapareDetailsMap;
  private List<ManagerDetailsReviewFilterBean> proposedManagers = new ArrayList<ManagerDetailsReviewFilterBean> ();
  private List<ManagerDetailsReviewFilterBean>  currentManagers = new ArrayList<ManagerDetailsReviewFilterBean> ();
  private String supervisorVoName ="AssignmentSupervisorMDVO";

  public void initCompare() { 
    comapareDetailsMap =  new TransactionXmlHelper().retrieveTxnCompare();
  }
  
/*  public void getManagerDetailstoShow(){
    if(null == comapareDetailsMap) initCompare();
    if(comapareDetailsMap.get(supervisorVoName) != null){
       List<ComparePojo> assignmentSupervisorVos=(List<ComparePojo>)comapareDetailsMap.get(supervisorVoName);
       for(int i =0;i<assignmentSupervisorVos.size();i++){
           ComparePojo eachSupervisorVo = assignmentSupervisorVos.get(i);
           Map<String,ComparisonAttribute> supervisorCompareMap = eachSupervisorVo.getCompareMap();
         
           
           String newmanagerrName = supervisorCompareMap.get("ManagerName").getNewValue();
           String oldmanagerName = supervisorCompareMap.get("ManagerName").getOldValue();
          
           boolean isNewMngerExist = newmanagerrName!=null && !newmanagerrName.equalsIgnoreCase("null") && !newmanagerrName.equals("");
           boolean isOldMngerExist = oldmanagerName!=null && !oldmanagerName.equalsIgnoreCase("null") && !oldmanagerName.equals("");
         
           //get proposed values
           if(isNewMngerExist && !newmanagerrName.equals(oldmanagerName)){
        	 String newMgrType = supervisorCompareMap.get("ManagerType") == null  ? null : getDisplayValue((supervisorCompareMap.get("ManagerType").getNewValue()));
        	 String newManagerId = supervisorCompareMap.get("ManagerId") == null ? null : supervisorCompareMap.get("ManagerId").getNewValue();
             proposedManagers.add(new ManagerDetailsReviewFilterBean(newmanagerrName,newMgrType,
            		 newManagerId));
           }
         
           //get current values           
           if(isOldMngerExist && !newmanagerrName.equals(oldmanagerName)){
        	   String oldMgrType = supervisorCompareMap.get("ManagerType") == null  ? null : getDisplayValue((supervisorCompareMap.get("ManagerType").getOldValue()));
             currentManagers.add(new ManagerDetailsReviewFilterBean(oldmanagerName, oldMgrType,
                                                                    supervisorCompareMap.get("ManagerId").getOldValue()));
           }
       }
    }  
    
  }*/
  
  public void getManagerDetailstoShow(){
	    String newmanagerrName="";
	    String oldmanagerName="";
	    if(null == comapareDetailsMap) initCompare();
	    if(comapareDetailsMap.get(supervisorVoName) != null){
	       List<ComparePojo> assignmentSupervisorVos=(List<ComparePojo>)comapareDetailsMap.get(supervisorVoName);
	       for(int i =0;i<assignmentSupervisorVos.size();i++){
	           ComparePojo eachSupervisorVo = assignmentSupervisorVos.get(i);
	           Map<String,ComparisonAttribute> supervisorCompareMap = eachSupervisorVo.getCompareMap();
	         
	           boolean isMngrNameExists = supervisorCompareMap.get("ManagerListName")!=null;
	           if(isMngrNameExists){  
	               newmanagerrName = supervisorCompareMap.get("ManagerListName").getNewValue();              
	               oldmanagerName = supervisorCompareMap.get("ManagerListName").getOldValue();          
	           }
	          
	           boolean isNewMngerExist = newmanagerrName!=null && !newmanagerrName.equalsIgnoreCase("null") && !newmanagerrName.equals("");
	           boolean isOldMngerExist = oldmanagerName!=null && !oldmanagerName.equalsIgnoreCase("null") && !oldmanagerName.equals("");
	         
	           //get proposed values
	           if(isNewMngerExist && !newmanagerrName.equals(oldmanagerName)){
	             proposedManagers.add(new ManagerDetailsReviewFilterBean(newmanagerrName, getDisplayValue(supervisorCompareMap.get("ManagerType").getNewValue()),
	                                                                     supervisorCompareMap.get("ManagerId").getNewValue()));
	           }
	         
	           //get current values           
	           if(isOldMngerExist && !newmanagerrName.equals(oldmanagerName)){
	             currentManagers.add(new ManagerDetailsReviewFilterBean(oldmanagerName, getDisplayValue(supervisorCompareMap.get("ManagerType").getOldValue()),
	                                                                    supervisorCompareMap.get("ManagerId").getOldValue()));
	           }
	       }
	    }  
	    
	  }

  
  /*public void getManagerDetailstoShow(){
	    if(null == comapareDetailsMap) initCompare();
	    if(comapareDetailsMap.get(supervisorVoName) != null){
	       List<ComparePojo> assignmentSupervisorVos=(List<ComparePojo>)comapareDetailsMap.get(supervisorVoName);
	       for(int i =0;i<assignmentSupervisorVos.size();i++){
	           ComparePojo eachSupervisorVo = assignmentSupervisorVos.get(i);
	           Map<String,ComparisonAttribute> supervisorCompareMap = eachSupervisorVo.getCompareMap();
	         
	           
	           String newManagerrName = "";
	           String oldManagerName = "";
	           boolean isMngrNameExists = supervisorCompareMap.get("ManagerName")!=null;
	           if(isMngrNameExists){
	              newManagerrName = supervisorCompareMap.get("ManagerName").getNewValue();
	              oldManagerName = supervisorCompareMap.get("ManagerName").getOldValue();
	           }
	          
	           boolean isNewMngerExist = newManagerrName!=null && !newManagerrName.equalsIgnoreCase("null") && !newManagerrName.equals("");
	           boolean isOldMngerExist = oldManagerName!=null && !oldManagerName.equalsIgnoreCase("null") && !oldManagerName.equals("");
	         
	           boolean isMngrTypeExists = supervisorCompareMap.get("ManagerType")!=null;
	           String oldMngrType ="";
	           String newMngrType ="";
	           if(isMngrTypeExists){
	             oldMngrType = supervisorCompareMap.get("ManagerType").getOldValue();
	             newMngrType = supervisorCompareMap.get("ManagerType").getNewValue();
	           }
	         
	           String oldMngrId = supervisorCompareMap.get("ManagerId")!=null?supervisorCompareMap.get("ManagerId").getOldValue():"";
	           String newMngrId = supervisorCompareMap.get("ManagerId")!=null?supervisorCompareMap.get("ManagerId").getNewValue():"";
	         
	           //get proposed values
	           if(isNewMngerExist && !newManagerrName.equals(oldManagerName)){
	             proposedManagers.add(new ManagerDetailsReviewFilterBean(newManagerrName, getDisplayValue(newMngrType),
	                                                                     newMngrId));
	           }
	         
	           //get current values           
	           if(isOldMngerExist && !newManagerrName.equals(oldManagerName)){
	             currentManagers.add(new ManagerDetailsReviewFilterBean(oldManagerName, getDisplayValue(oldMngrType),
	                                                                    oldMngrId));
	           }
	       }
	    }  
	    
	  }*/
  public String getDisplayValue(String attValue){
      if(null == attValue || "".equals(attValue) ) return "-";
      return attValue;  
  }

  public boolean isSupervisorChangesExist() {
    if(null == comapareDetailsMap) initCompare();
    return comapareDetailsMap.get(supervisorVoName)!=null;
  }

  public List<ManagerDetailsReviewFilterBean> getProposedManagers() {
    return proposedManagers;
  }
  
  public int getProposedManagersLength(){
    return proposedManagers.size();
  }

  public int getCurrentManagersLength(){
    return currentManagers.size();
  }
  
  public List<ManagerDetailsReviewFilterBean> getCurrentManagers() {
    return currentManagers;
  }
}
