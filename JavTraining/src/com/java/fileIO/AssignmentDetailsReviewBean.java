package com.java.fileIO;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AssignmentDetailsReviewBean {

    private String txnRootAMDataControl = "TransactionAMDataControl";
    private String dataBindingPath =
        "oracle.apps.hcm.employment.base.ui.DataBindings.cpx";
    private Map<String, List<ComparePojo>> comapareDetailsMap;

    public void initCompare() {

    	comapareDetailsMap =  new TransactionXmlHelper().retrieveTxnCompare();
    }
    
    public String getDisplayValue(String attValue){
        if(null == attValue || "".equals(attValue) || "null".equalsIgnoreCase(attValue)) return "-";
        return attValue;  
    }

    public String getAssignmentMDVOAssignmentStatusTypeNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("AssignmentStatusType").getNewValue());
    }

    public String getAssignmentMDVOAssignmentStatusTypeOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("AssignmentStatusType").getOldValue());
    }
	
	public String getAssignmentMDVOAssignmentStatusTypeLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("AssignmentStatusType") != null)
            return assignmentMDVOPojo.getCompareMap().get("AssignmentStatusType").getLabel();
        return "";
    }

	public boolean isAssignmentMDVOAssignmentStatusTypeIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("AssignmentStatusType") != null)
            return assignmentMDVOPojo.getCompareMap().get("AssignmentStatusType").getIsModified();
        return false;
    }
    
    public String getAssignmentMDVOAssignmentTypeNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("AssignmentType").getNewValue());
    }

    public String getAssignmentMDVOAssignmentTypeOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("AssignmentType").getOldValue());
    }
	public boolean isAssignmentMDVOAssignmentTypeIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("AssignmentType") != null)
            return assignmentMDVOPojo.getCompareMap().get("AssignmentType").getIsModified();
        return false;
    }
	public String getAssignmentMDVOAssignmentTypeLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("AssignmentType") != null)
            return assignmentMDVOPojo.getCompareMap().get("AssignmentType").getLabel();
        return "";
    }
	
    

    public String getAssignmentMDVOProjectedAssignmentEndNewValue() {
	ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ProjectedAssignmentEnd").getNewValue());
    }

    public String getAssignmentMDVOProjectedAssignmentEndOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ProjectedAssignmentEnd").getOldValue());
    }

    public boolean isAssignmentMDVOProjectedAssignmentEndIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ProjectedAssignmentEnd") != null)
            return assignmentMDVOPojo.getCompareMap().get("ProjectedAssignmentEnd").getIsModified();
        return false;
    }
	public String getAssignmentMDVOProjectedAssignmentEndLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ProjectedAssignmentEnd") != null)
            return assignmentMDVOPojo.getCompareMap().get("ProjectedAssignmentEnd").getLabel();
        return "";
    }

    public String getAssignmentMDVOBusinessUnitNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("BusinessUnit").getNewValue());
    }

    public String getAssignmentMDVOBusinessUnitOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("BusinessUnit").getOldValue());
    }
	
	public boolean isAssignmentMDVOBusinessUnitIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("BusinessUnit") != null)
            return assignmentMDVOPojo.getCompareMap().get("BusinessUnit").getIsModified();
        return false;
    }
	public String getAssignmentMDVOBusinessUnitLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("BusinessUnit") != null)
            return assignmentMDVOPojo.getCompareMap().get("BusinessUnit").getLabel();
        return "";
    }	

    
    public String getAssignmentMDVOPositionNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Position").getNewValue());
    }

    public String getAssignmentMDVOPositionOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Position").getOldValue());
    }

	public boolean isAssignmentMDVOPositionIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Position") != null)
            return assignmentMDVOPojo.getCompareMap().get("Position").getIsModified();
        return false;
    }
	public String getAssignmentMDVOPositionLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("PositionId") != null)
            return assignmentMDVOPojo.getCompareMap().get("PositionId").getLabel();
        return "";
    }

    public String getAssignmentMDVOAllowAsgOverrideFlagNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("PositionOverrideFlag").getNewValue());
    }

    public String getAssignmentMDVOAllowAsgOverrideFlagOldValue() {
       ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("PositionOverrideFlag").getOldValue());
    }

	public boolean isAssignmentMDVOAllowAsgOverrideFlagIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("PositionOverrideFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("PositionOverrideFlag").getIsModified();
        return false;
    }
	public String getAssignmentMDVOAllowAsgOverrideFlagLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("PositionOverrideFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("PositionOverrideFlag").getLabel();
        return "";
    }


    public String getAssignmentMDVOJobNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Job").getNewValue());
    }

    public String getAssignmentMDVOJobOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Job").getOldValue());
    }

	public boolean isAssignmentMDVOJobIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Job") != null)
            return assignmentMDVOPojo.getCompareMap().get("Job").getIsModified();
        return false;
    }
	public String getAssignmentMDVOJobLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Job") != null)
            return assignmentMDVOPojo.getCompareMap().get("Job").getLabel();
        return "";
    }


    public String getAssignmentMDVOOrganizationIdNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Department").getNewValue());
    }

    public String getAssignmentMDVOOrganizationIdOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Department").getOldValue());
    }

	public boolean isAssignmentMDVOOrganizationIdIsModified() {
      if (null == comapareDetailsMap)
          initCompare();
      ComparePojo assignmentMDVOPojo =
          comapareDetailsMap.get("AssignmentMDVO").get(0);
      if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Department") != null)
          return assignmentMDVOPojo.getCompareMap().get("Department").getIsModified();
      return false;
    }
	public String getAssignmentMDVOOrganizationIdLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Department") != null)
            return assignmentMDVOPojo.getCompareMap().get("Department").getLabel();
        return "";
    }
	

    public String getAssignmentMDVOGradeLadderPgmIdNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("GradeLadder").getNewValue());
    }

    public String getAssignmentMDVOGradeLadderPgmIdOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("GradeLadder").getOldValue());
    }

	public boolean isAssignmentMDVOGradeLadderPgmIdIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("GradeLadder") != null)
            return assignmentMDVOPojo.getCompareMap().get("GradeLadder").getIsModified();
        return false;
    }
	public String getAssignmentMDVOGradeLadderPgmIdLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("GradeLadder") != null)
            return assignmentMDVOPojo.getCompareMap().get("GradeLadder").getLabel();
        return "";
    }
	

    public String getAssignmentMDVOGspEligibilityFlagNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("GspEligibilityFlag").getNewValue());
    }

    public String getAssignmentMDVOGspEligibilityFlagOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("GspEligibilityFlag").getOldValue());
    }

	public boolean isAssignmentMDVOGspEligibilityFlagIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("GspEligibilityFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("GspEligibilityFlag").getIsModified();
        return false;
    }
	public String getAssignmentMDVOGspEligibilityFlagLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("GspEligibilityFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("GspEligibilityFlag").getLabel();
        return "";
    }

    public String getAssignmentMDVOGradeNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Grade").getNewValue());
    }

    public String getAssignmentMDVOGradeOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Grade").getOldValue());
    }

	public boolean isAssignmentMDVOGradeIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Grade") != null)
            return assignmentMDVOPojo.getCompareMap().get("Grade").getIsModified();
        return false;
    }
	public String getAssignmentMDVOGradeLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Grade") != null)
            return assignmentMDVOPojo.getCompareMap().get("Grade").getLabel();
        return "";
    }

    public String getAssignmentMDVOWorkAtHomeNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("WorkAtHome").getOldValue());
    }

    public String getAssignmentMDVOWorkAtHomeOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("WorkAtHome").getNewValue());
    }

	public boolean isAssignmentMDVOWorkAtHomeIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("WorkAtHome") != null)
            return assignmentMDVOPojo.getCompareMap().get("WorkAtHome").getIsModified();
        return false;
    }
	public String getAssignmentMDVOWorkAtHomeLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("WorkAtHome") != null)
            return assignmentMDVOPojo.getCompareMap().get("WorkAtHome").getLabel();
        return "";
    }

    public String getAssignmentMDVOManagerFlagNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ManagerFlag").getNewValue());
    }

    public String getAssignmentMDVOManagerFlagOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ManagerFlag").getOldValue());
    }

	public boolean isAssignmentMDVOManagerFlagIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ManagerFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("ManagerFlag").getIsModified();
        return false;
    }
	public String getAssignmentMDVOManagerFlagLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ManagerFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("ManagerFlag").getLabel();
        return "";
    }

    public String getAssignmentMDVOPersonTypeIdNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("PersonTypeId").getNewValue());
    }

    public String getAssignmentMDVOPersonTypeIdOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("PersonTypeId").getOldValue());
    }

	public boolean isAssignmentMDVOPersonTypeIdIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("PersonTypeId") != null)
            return assignmentMDVOPojo.getCompareMap().get("PersonTypeId").getIsModified();
        return false;
    }
	public String getAssignmentMDVOPersonTypeIdLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("PersonTypeId") != null)
            return assignmentMDVOPojo.getCompareMap().get("PersonTypeId").getLabel();
        return "";
    }

    public String getAssignmentMDVOFullPartTimeNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("FullPartTime").getNewValue());
    }

    public String getAssignmentMDVOFullPartTimeOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("FullPartTime").getOldValue());
    }

	public boolean isAssignmentMDVOFullPartTimeIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("FullPartTime") != null)
            return assignmentMDVOPojo.getCompareMap().get("FullPartTime").getIsModified();
        return false;
    }
	public String getAssignmentMDVOFullPartTimeLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("FullPartTime") != null)
            return assignmentMDVOPojo.getCompareMap().get("FullPartTime").getLabel();
        return "";
    }

    public String getAssignmentMDVOPermanentTemporaryFlagNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("PermanentTemporaryFlag").getNewValue());
    }

    public String getAssignmentMDVOPermanentTemporaryFlagOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("PermanentTemporaryFlag").getOldValue());
    }

	public boolean isAssignmentMDVOPermanentTemporaryFlagIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("PermanentTemporaryFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("PermanentTemporaryFlag").getIsModified();
        return false;
    }
	public String getAssignmentMDVOPermanentTemporaryFlagLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("PermanentTemporaryFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("PermanentTemporaryFlag").getLabel();
        return "";
    }

    public String getAssignmentMDVOHourlySalariedCodeNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("HourlySalariedCode").getNewValue());
    }

    public String getAssignmentMDVOHourlySalariedCodeOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("HourlySalariedCode").getOldValue());
    }

	public boolean isAssignmentMDVOHourlySalariedCodeIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("HourlySalariedCode") != null)
            return assignmentMDVOPojo.getCompareMap().get("HourlySalariedCode").getIsModified();
        return false;
    }
	public String getAssignmentMDVOHourlySalariedCodeLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("HourlySalariedCode") != null)
            return assignmentMDVOPojo.getCompareMap().get("HourlySalariedCode").getLabel();
        return "";
    }

    public String getAssignmentMDVONormalHoursNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("NormalHours").getOldValue());
    }

    public String getAssignmentMDVONormalHoursOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("NormalHours").getNewValue());
    }

	public boolean isAssignmentMDVONormalHoursIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("NormalHours") != null)
            return assignmentMDVOPojo.getCompareMap().get("NormalHours").getIsModified();
        return false;
    }
	public String getAssignmentMDVONormalHoursLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("NormalHours") != null)
            return assignmentMDVOPojo.getCompareMap().get("NormalHours").getLabel();
        return "";
    }

    public String getAssignmentMDVOFrequencyNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Frequency").getNewValue());
    }

    public String getAssignmentMDVOFrequencyOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("Frequency").getOldValue());
    }

	public boolean isAssignmentMDVOFrequencyIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Frequency") != null)
            return assignmentMDVOPojo.getCompareMap().get("Frequency").getIsModified();
        return false;
    }
	public String getAssignmentMDVOFrequencyLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("Frequency") != null)
            return assignmentMDVOPojo.getCompareMap().get("Frequency").getLabel();
        return "";
        }

    public String getAssignmentMDVOSeniorityBasisNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("SeniorityBasis").getNewValue());
    }

    public String getAssignmentMDVOSeniorityBasisOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("SeniorityBasis").getOldValue());
    }

	public boolean isAssignmentMDVOSeniorityBasisIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("SeniorityBasis") != null)
            return assignmentMDVOPojo.getCompareMap().get("SeniorityBasis").getIsModified();
        return false;
    }
	public String getAssignmentMDVOSeniorityBasisLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("SeniorityBasis") != null)
            return assignmentMDVOPojo.getCompareMap().get("SeniorityBasis").getLabel();
        return "";
    }

    public String getAssignmentMDVOProbationPeriodNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ProbationPeriod").getNewValue());
    }

    public String getAssignmentMDVOProbationPeriodOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ProbationPeriod").getOldValue());
    }

	public boolean isAssignmentMDVOProbationPeriodIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ProbationPeriod") != null)
            return assignmentMDVOPojo.getCompareMap().get("ProbationPeriod").getIsModified();
        return false;
    }
	public String getAssignmentMDVOProbationPeriodLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ProbationPeriod") != null)
            return assignmentMDVOPojo.getCompareMap().get("ProbationPeriod").getLabel();
        return "";
    }

    public String getAssignmentMDVOProbationUnitNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ProbationUnit").getNewValue());
    }

    public String getAssignmentMDVOProbationUnitOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ProbationUnit").getOldValue());
    }

	public boolean isAssignmentMDVOProbationUnitIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ProbationUnit") != null)
            return assignmentMDVOPojo.getCompareMap().get("ProbationUnit").getIsModified();
        return false;
    }
	public String getAssignmentMDVOProbationUnitLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ProbationUnit") != null)
            return assignmentMDVOPojo.getCompareMap().get("ProbationUnit").getLabel();
        return "";
    }

    public String getAssignmentMDVONoticePeriodNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("NoticePeriod").getNewValue());
    }

    public String getAssignmentMDVONoticePeriodOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("NoticePeriod").getOldValue());
    }

	public boolean isAssignmentMDVONoticePeriodIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("NoticePeriod") != null)
            return assignmentMDVOPojo.getCompareMap().get("NoticePeriod").getIsModified();
        return false;
    }
	public String getAssignmentMDVONoticePeriodLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("NoticePeriod") != null)
            return assignmentMDVOPojo.getCompareMap().get("NoticePeriod").getLabel();
        return "";
    }

    public String getAssignmentMDVONoticePeriodUomNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("NoticePeriodUom").getNewValue());
    }

    public String getAssignmentMDVONoticePeriodUomOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("NoticePeriodUom").getOldValue());
    }

	public boolean isAssignmentMDVONoticePeriodUomIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("NoticePeriodUom") != null)
            return assignmentMDVOPojo.getCompareMap().get("NoticePeriodUom").getIsModified();
        return false;
    }
	public String getAssignmentMDVONoticePeriodUomLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("NoticePeriodUom") != null)
            return assignmentMDVOPojo.getCompareMap().get("NoticePeriodUom").getLabel();
        return "";
    }

    public String getAssignmentMDVOOvertimePeriodNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("OvertimePeriod").getNewValue());
    }

    public String getAssignmentMDVOOvertimePeriodOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("OvertimePeriod").getOldValue());
    }

	public boolean isAssignmentMDVOOvertimePeriodIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("OvertimePeriod") != null)
            return assignmentMDVOPojo.getCompareMap().get("OvertimePeriod").getIsModified();
        return false;
    }
	public String getAssignmentMDVOOvertimePeriodLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("OvertimePeriod") != null)
            return assignmentMDVOPojo.getCompareMap().get("OvertimePeriod").getLabel();
        return "";
    }

    public String getAssignmentMDVOInternalBuildingNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("InternalBuilding").getNewValue());
    }

    public String getAssignmentMDVOInternalBuildingOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("InternalBuilding").getOldValue());
    }

	public boolean isAssignmentMDVOInternalBuildingIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("InternalBuilding") != null)
            return assignmentMDVOPojo.getCompareMap().get("InternalBuilding").getIsModified();
        return false;
    }
	public String getAssignmentMDVOInternalBuildingLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("InternalBuilding") != null)
            return assignmentMDVOPojo.getCompareMap().get("InternalBuilding").getLabel();
        return "";
    }

    public String getAssignmentMDVOInternalFloorNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("InternalFloor").getNewValue());
    }

    public String getAssignmentMDVOInternalFloorOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("InternalFloor").getOldValue());
    }

	public boolean isAssignmentMDVOInternalFloorIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("InternalFloor") != null)
            return assignmentMDVOPojo.getCompareMap().get("InternalFloor").getIsModified();
        return false;
    }
	public String getAssignmentMDVOInternalFloorLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("InternalFloor") != null)
            return assignmentMDVOPojo.getCompareMap().get("InternalFloor").getLabel();
        return "";
    }

    public String getAssignmentMDVOInternalOfficeNumberNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("InternalOfficeNumber").getNewValue());
    }

    public String getAssignmentMDVOInternalOfficeNumberOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("InternalOfficeNumber").getOldValue());
    }

	public boolean isAssignmentMDVOInternalOfficeNumberIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("InternalOfficeNumber") != null)
            return assignmentMDVOPojo.getCompareMap().get("InternalOfficeNumber").getIsModified();
        return false;
    }
	public String getAssignmentMDVOInternalOfficeNumberLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("InternalOfficeNumber") != null)
            return assignmentMDVOPojo.getCompareMap().get("InternalOfficeNumber").getLabel();
        return "";
    }

    public String getAssignmentMDVOInternalMailstopNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("InternalMailstop").getNewValue());
    }

    public String getAssignmentMDVOInternalMailstopOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("InternalMailstop").getOldValue());
    }

	public boolean isAssignmentMDVOInternalMailstopIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("InternalMailstop") != null)
            return assignmentMDVOPojo.getCompareMap().get("InternalMailstop").getIsModified();
        return false;
    }
	public String getAssignmentMDVOInternalMailstopLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("InternalMailstop") != null)
            return assignmentMDVOPojo.getCompareMap().get("InternalMailstop").getLabel();
        return "";
    }

    public String getAssignmentMDVOEstablishmentIdNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("EstablishmentId").getNewValue());
    }

    public String getAssignmentMDVOEstablishmentIdOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("EstablishmentId").getOldValue());
    }

	public boolean isAssignmentMDVOEstablishmentIdIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("EstablishmentId") != null)
            return assignmentMDVOPojo.getCompareMap().get("EstablishmentId").getIsModified();
        return false;
    }
	public String getAssignmentMDVOEstablishmentIdLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("EstablishmentId") != null)
            return assignmentMDVOPojo.getCompareMap().get("EstablishmentId").getLabel();
        return "";
    }

    public String getAssignmentMDVOTaxAddressIdNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("TaxAddressId").getNewValue());
    }

    public String getAssignmentMDVOTaxAddressIdOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("TaxAddressId").getOldValue());
    }

	public boolean isAssignmentMDVOTaxAddressIdIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("TaxAddressId") != null)
            return assignmentMDVOPojo.getCompareMap().get("TaxAddressId").getIsModified();
        return false;
    }
	public String getAssignmentMDVOTaxAddressIdLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("TaxAddressId") != null)
            return assignmentMDVOPojo.getCompareMap().get("TaxAddressId").getLabel();
        return "";
    }


    public String getAssignmentMDVODefaultCodeCombIdNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("DefaultCodeCombId").getNewValue());
    }

    public String getAssignmentMDVODefaultCodeCombIdOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("DefaultCodeCombId").getOldValue());
    }

	public boolean isAssignmentMDVODefaultCodeCombIdIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("DefaultCodeCombId") != null)
            return assignmentMDVOPojo.getCompareMap().get("DefaultCodeCombId").getIsModified();
        return false;
    }
	public String getAssignmentMDVODefaultCodeCombIdLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("DefaultCodeCombId") != null)
            return assignmentMDVOPojo.getCompareMap().get("DefaultCodeCombId").getLabel();
        return "";
    }
    public String getAssignmentMDVOExpenseCheckSendToAddressNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ExpenseCheckSendToAddress").getNewValue());
    }

    public String getAssignmentMDVOExpenseCheckSendToAddressOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("ExpenseCheckSendToAddress").getOldValue());
    }

	public boolean isAssignmentMDVOExpenseCheckSendToAddressIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ExpenseCheckSendToAddress") != null)
            return assignmentMDVOPojo.getCompareMap().get("ExpenseCheckSendToAddress").getIsModified();
        return false;
    }
	public String getAssignmentMDVOExpenseCheckSendToAddressLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("ExpenseCheckSendToAddress") != null)
            return assignmentMDVOPojo.getCompareMap().get("ExpenseCheckSendToAddress").getLabel();
        return "";
    }


    public String getAssignmentMDVORetirementAgeNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("RetirementAge").getNewValue());
    }

    public String getAssignmentMDVORetirementAgeOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("RetirementAge").getOldValue());
    }

	public boolean isAssignmentMDVORetirementAgeIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("RetirementAge") != null)
            return assignmentMDVOPojo.getCompareMap().get("RetirementAge").getIsModified();
        return false;
    }
	public String getAssignmentMDVORetirementAgeLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("RetirementAge") != null)
            return assignmentMDVOPojo.getCompareMap().get("RetirementAge").getLabel();
        return "";
    }

    public String getAssignmentMDVORetirementDateNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("RetirementDate").getNewValue());
    }

    public String getAssignmentMDVORetirementDateOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("RetirementDate").getOldValue());
    }

	public boolean isAssignmentMDVORetirementDateIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("RetirementDate") != null)
            return assignmentMDVOPojo.getCompareMap().get("RetirementDate").getIsModified();
        return false;
    }
	public String getAssignmentMDVORetirementDateLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("RetirementDate") != null)
            return assignmentMDVOPojo.getCompareMap().get("RetirementDate").getLabel();
        return "";
    }

    public String getAssignmentMDVOLabourUnionMemberFlagNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("LabourUnionMemberFlag").getNewValue());
    }

    public String getAssignmentMDVOLabourUnionMemberFlagOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("LabourUnionMemberFlag").getOldValue());
    }

	public boolean isAssignmentMDVOLabourUnionMemberFlagIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("LabourUnionMemberFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("LabourUnionMemberFlag").getIsModified();
        return false;
    }
	public String getAssignmentMDVOLabourUnionMemberFlagLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("LabourUnionMemberFlag") != null)
            return assignmentMDVOPojo.getCompareMap().get("LabourUnionMemberFlag").getLabel();
        return "";
    }

    public String getAssignmentMDVOUnionIdNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("UnionName").getNewValue());
    }

    public String getAssignmentMDVOUnionIdOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("UnionName").getOldValue());
    }

	public boolean isAssignmentMDVOUnionIdIsModified() {
      if (null == comapareDetailsMap)
          initCompare();
      ComparePojo assignmentMDVOPojo =
          comapareDetailsMap.get("AssignmentMDVO").get(0);
      if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("UnionName") != null)
          return assignmentMDVOPojo.getCompareMap().get("UnionName").getIsModified();
      return false;
    }
	public String getAssignmentMDVOUnionIdLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("UnionId") != null)
            return assignmentMDVOPojo.getCompareMap().get("UnionId").getLabel();
        return "";
    }

    public String getAssignmentMDVOBargainingUnitCodeNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("BargainingUnitName").getNewValue());
    }

    public String getAssignmentMDVOBargainingUnitCodeOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("BargainingUnitName").getOldValue());
    }

	public boolean isAssignmentMDVOBargainingUnitCodeIsModified() {
		if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("BargainingUnitName") != null)
            return assignmentMDVOPojo.getCompareMap().get("BargainingUnitName").getIsModified();
        return false;
    }
	public String getAssignmentMDVOBargainingUnitCodeLabel() {
        if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("BargainingUnitCode") != null)
            return assignmentMDVOPojo.getCompareMap().get("BargainingUnitCode").getLabel();
        return "";
    }
  
  public String getAssignmentMDVOAssignmentNameNewValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("AssignmentName").getNewValue());
    }

    public String getAssignmentMDVOAssignmentNameOldValue() {
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("AssignmentName").getOldValue());
    }
  
  public boolean isAssignmentMDVOAssignmentNameIsModified() {
    if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("AssignmentName") != null)
            return assignmentMDVOPojo.getCompareMap().get("AssignmentName").getIsModified();
        return false;
    }
  
  public String getAssignmentMDVOAssignmentNameLabel() {
     if (null == comapareDetailsMap)
         initCompare();
     ComparePojo assignmentMDVOPojo =
         comapareDetailsMap.get("AssignmentMDVO").get(0);
     if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("AssignmentName") != null)
         return assignmentMDVOPojo.getCompareMap().get("AssignmentName").getLabel();
     return "";
  }
     
  public String getAssignmentMDVOLocationNameNewValue() {
     ComparePojo assignmentMDVOPojo =
         comapareDetailsMap.get("AssignmentMDVO").get(0);
     return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("LocationName").getNewValue());
  }

  public String getAssignmentMDVOLocationNameOldValue() {
     ComparePojo assignmentMDVOPojo =
         comapareDetailsMap.get("AssignmentMDVO").get(0);
     return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("LocationName").getOldValue());
  }
  public boolean isAssignmentMDVOLocationNameIsModified() {
    if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("LocationName") != null)
            return assignmentMDVOPojo.getCompareMap().get("LocationName").getIsModified();
        return false;
    }
  public String getAssignmentMDVOLocationNameLabel() {
         if (null == comapareDetailsMap)
             initCompare();
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("LocationId") != null)
             return assignmentMDVOPojo.getCompareMap().get("LocationId").getLabel();
         return "";
     }
      
  public boolean isAssignmentMDVOCollectiveAgreementNameIsModified() {
    if (null == comapareDetailsMap)
            initCompare();
        ComparePojo assignmentMDVOPojo =
            comapareDetailsMap.get("AssignmentMDVO").get(0);
        if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("CollectiveAgreementName") != null)
            return assignmentMDVOPojo.getCompareMap().get("CollectiveAgreementName").getIsModified();
        return false;
    }      
 
    
  public boolean isEmpDetailsChangesExist() {
    if(null == comapareDetailsMap) initCompare();
    return (comapareDetailsMap.get("AssignmentMDVO")!=null && comapareDetailsMap.get("AssignmentMDVO").get(0).getCompareMap().size()>2) || comapareDetailsMap.get("AssignmentMDVOToPeopleGroupKFFVO")!=null ||
      comapareDetailsMap.get("AssignmentMDVOToBaseWorkerAsgDFFVO")!=null || comapareDetailsMap.get("AssignmentMDVOToBaseWorkerAsgLegDDFVO")!=null;
  }
  
  public String getAssignmentMDVOCollectiveAgreementNameNewValue() {
      ComparePojo assignmentMDVOPojo =
          comapareDetailsMap.get("AssignmentMDVO").get(0);
      return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("CollectiveAgreementName").getNewValue());
  }

  public String getAssignmentMDVOCollectiveAgreementNameOldValue() {
      ComparePojo assignmentMDVOPojo =
          comapareDetailsMap.get("AssignmentMDVO").get(0);
      return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("CollectiveAgreementName").getOldValue());
  }
      
  
  public String getAssignmentMDVOCollectiveAgreementNameLabel() {
    if (null == comapareDetailsMap)
        initCompare();
    ComparePojo assignmentMDVOPojo =
        comapareDetailsMap.get("AssignmentMDVO").get(0);
    if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("CollectiveAgreementId") != null)
        return assignmentMDVOPojo.getCompareMap().get("CollectiveAgreementId").getLabel();
    return "";
  }
  
    public String getAssignmentMDVOEmploymentCategoryNewValue() {
       ComparePojo assignmentMDVOPojo =
           comapareDetailsMap.get("AssignmentMDVO").get(0);
       return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("EmploymentCategory").getNewValue());
    }

    public String getAssignmentMDVOEmploymentCategoryOldValue() {
       ComparePojo assignmentMDVOPojo =
           comapareDetailsMap.get("AssignmentMDVO").get(0);
       return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("EmploymentCategory").getOldValue());
    }
    public boolean isAssignmentMDVOEmploymentCategoryIsModified() {
      if (null == comapareDetailsMap)
              initCompare();
          ComparePojo assignmentMDVOPojo =
              comapareDetailsMap.get("AssignmentMDVO").get(0);
          if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("EmploymentCategory") != null)
              return assignmentMDVOPojo.getCompareMap().get("EmploymentCategory").getIsModified();
          return false;
      }
    public String getAssignmentMDVOEmploymentCategoryLabel() {
           if (null == comapareDetailsMap)
               initCompare();
           ComparePojo assignmentMDVOPojo =
               comapareDetailsMap.get("AssignmentMDVO").get(0);
           if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("EmploymentCategory") != null)
               return assignmentMDVOPojo.getCompareMap().get("EmploymentCategory").getLabel();
           return "";
       }
    
    public String getAssignmentMDVOEmployeeCategoryNewValue() {
       ComparePojo assignmentMDVOPojo =
           comapareDetailsMap.get("AssignmentMDVO").get(0);
       return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("EmployeeCategory").getNewValue());
    }

    public String getAssignmentMDVOEmployeeCategoryOldValue() {
       ComparePojo assignmentMDVOPojo =
           comapareDetailsMap.get("AssignmentMDVO").get(0);
       return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("EmployeeCategory").getOldValue());
    }
    public boolean isAssignmentMDVOEmployeeCategoryIsModified() {
      if (null == comapareDetailsMap)
              initCompare();
          ComparePojo assignmentMDVOPojo =
              comapareDetailsMap.get("AssignmentMDVO").get(0);
          if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("EmployeeCategory") != null)
              return assignmentMDVOPojo.getCompareMap().get("EmployeeCategory").getIsModified();
          return false;
      }
    public String getAssignmentMDVOEmployeeCategoryLabel() {
           if (null == comapareDetailsMap)
               initCompare();
           ComparePojo assignmentMDVOPojo =
               comapareDetailsMap.get("AssignmentMDVO").get(0);
           if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("EmployeeCategory") != null)
               return assignmentMDVOPojo.getCompareMap().get("EmployeeCategory").getLabel();
           return "";
       }
    
    
    public String getAssignmentMDVOProbationEndNewValue() {
       ComparePojo assignmentMDVOPojo =
           comapareDetailsMap.get("AssignmentMDVO").get(0);
       return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("DateProbationEnd").getNewValue());
    }

    public String getAssignmentMDVOProbationEndOldValue() {
       ComparePojo assignmentMDVOPojo =
           comapareDetailsMap.get("AssignmentMDVO").get(0);
       return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("DateProbationEnd").getOldValue());
    }
    public boolean isAssignmentMDVOProbationEndIsModified() {
      if (null == comapareDetailsMap)
              initCompare();
          ComparePojo assignmentMDVOPojo =
              comapareDetailsMap.get("AssignmentMDVO").get(0);
          if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("DateProbationEnd") != null)
              return assignmentMDVOPojo.getCompareMap().get("DateProbationEnd").getIsModified();
          return false;
      }
    public String getAssignmentMDVOProbationEndLabel() {
           if (null == comapareDetailsMap)
               initCompare();
           ComparePojo assignmentMDVOPojo =
               comapareDetailsMap.get("AssignmentMDVO").get(0);
           if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("DateProbationEnd") != null)
               return assignmentMDVOPojo.getCompareMap().get("DateProbationEnd").getLabel();
           return "";
       }
    
    
    public String getAssignmentMDVOFteValueNewValue() {
       ComparePojo assignmentMDVOPojo =
           comapareDetailsMap.get("AssignmentMDVO").get(0);
       return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("FteValue").getNewValue());
    }

    public String getAssignmentMDVOFteValueOldValue() {
       ComparePojo assignmentMDVOPojo =
           comapareDetailsMap.get("AssignmentMDVO").get(0);
       return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("FteValue").getOldValue());
    }
    public boolean isAssignmentMDVOFteValueIsModified() {
        if (null == comapareDetailsMap)
                initCompare();
            ComparePojo assignmentMDVOPojo =
                comapareDetailsMap.get("AssignmentMDVO").get(0);
            if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("FteValue") != null)
                return assignmentMDVOPojo.getCompareMap().get("FteValue").getIsModified();
            return false;
        }
      public String getAssignmentMDVOFteValueLabel() {
             if (null == comapareDetailsMap)
                 initCompare();
             ComparePojo assignmentMDVOPojo =
                 comapareDetailsMap.get("AssignmentMDVO").get(0);
             if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("FteValue") != null)
                 return assignmentMDVOPojo.getCompareMap().get("FteValue").getLabel();
             return "";
         }
      
      public String getAssignmentMDVOHeadValueNewValue() {
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("HeadValue").getNewValue());
      }

      public String getAssignmentMDVOHeadValueOldValue() {
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("HeadValue").getOldValue());
      }
      public boolean isAssignmentMDVOHeadValueIsModified() {
        if (null == comapareDetailsMap)
                initCompare();
            ComparePojo assignmentMDVOPojo =
                comapareDetailsMap.get("AssignmentMDVO").get(0);
            if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("HeadValue") != null)
                return assignmentMDVOPojo.getCompareMap().get("HeadValue").getIsModified();
            return false;
        }
      public String getAssignmentMDVOHeadValueLabel() {
             if (null == comapareDetailsMap)
                 initCompare();
             ComparePojo assignmentMDVOPojo =
                 comapareDetailsMap.get("AssignmentMDVO").get(0);
             if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("HeadValue") != null)
                 return assignmentMDVOPojo.getCompareMap().get("HeadValue").getLabel();
             return "";
         }
      
      public String getAssignmentMDVOTimeNormalStartNewValue() {
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("TimeNormalStart").getNewValue());
      }

      public String getAssignmentMDVOTimeNormalStartOldValue() {
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("TimeNormalStart").getOldValue());
      }
      public boolean isAssignmentMDVOTimeNormalStartIsModified() {
        if (null == comapareDetailsMap)
                initCompare();
            ComparePojo assignmentMDVOPojo =
                comapareDetailsMap.get("AssignmentMDVO").get(0);
            if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("TimeNormalStart") != null)
                return assignmentMDVOPojo.getCompareMap().get("TimeNormalStart").getIsModified();
            return false;
        }
      public String getAssignmentMDVOTimeNormalStartLabel() {
             if (null == comapareDetailsMap)
                 initCompare();
             ComparePojo assignmentMDVOPojo =
                 comapareDetailsMap.get("AssignmentMDVO").get(0);
             if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("TimeNormalStart") != null)
                 return assignmentMDVOPojo.getCompareMap().get("TimeNormalStart").getLabel();
             return "";
         }
      
      public String getAssignmentMDVOTimeNormalFinishNewValue() {
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("TimeNormalFinish").getNewValue());
      }

      public String getAssignmentMDVOTimeNormalFinishOldValue() {
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("TimeNormalFinish").getOldValue());
      }
      public boolean isAssignmentMDVOTimeNormalFinishIsModified() {
        if (null == comapareDetailsMap)
                initCompare();
            ComparePojo assignmentMDVOPojo =
                comapareDetailsMap.get("AssignmentMDVO").get(0);
            if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("TimeNormalFinish") != null)
                return assignmentMDVOPojo.getCompareMap().get("TimeNormalFinish").getIsModified();
            return false;
        }
      public String getAssignmentMDVOTimeNormalFinishLabel() {
             if (null == comapareDetailsMap)
                 initCompare();
             ComparePojo assignmentMDVOPojo =
                 comapareDetailsMap.get("AssignmentMDVO").get(0);
             if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("TimeNormalFinish") != null)
                 return assignmentMDVOPojo.getCompareMap().get("TimeNormalFinish").getLabel();
             return "";
         }
      
      
      
      public String getAssignmentMDVOGradeStepNewValue() {
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("GradeStep").getNewValue());
      }

      public String getAssignmentMDVOGradeStepOldValue() {
         ComparePojo assignmentMDVOPojo =
             comapareDetailsMap.get("AssignmentMDVO").get(0);
         return getDisplayValue(assignmentMDVOPojo.getCompareMap().get("GradeStep").getOldValue());
      }
      public boolean isAssignmentMDVOGradeStepIsModified() {
        if (null == comapareDetailsMap)
                initCompare();
            ComparePojo assignmentMDVOPojo =
                comapareDetailsMap.get("AssignmentMDVO").get(0);
            if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("GradeStep") != null)
                return assignmentMDVOPojo.getCompareMap().get("GradeStep").getIsModified();
            return false;
        }
      public String getAssignmentMDVOGradeStepLabel() {
             if (null == comapareDetailsMap)
                 initCompare();
             ComparePojo assignmentMDVOPojo =
                 comapareDetailsMap.get("AssignmentMDVO").get(0);
             if(assignmentMDVOPojo != null && assignmentMDVOPojo.getCompareMap().get("GradeStep") != null)
                 return assignmentMDVOPojo.getCompareMap().get("GradeStep").getLabel();
             return "";
         }
      //Flex fields -- start
      // 
      public Object[] getBaseWorkerAsgLegDDFUSVO(){
          if(null == comapareDetailsMap) initCompare();
          String flexVOName = getFlexFieldNameWithContext("BaseWorkerAsgLegDDF",comapareDetailsMap);
          if(comapareDetailsMap.get(flexVOName) != null )
                  return comapareDetailsMap.get(flexVOName).get(0).getCompareMap().entrySet().toArray();       
          return new Object[0];
          
      }
      
      public Object[] getBaseWorkerAsgDFFVO(){
          if(null == comapareDetailsMap) initCompare();
          String flexVOName = getFlexFieldNameWithContext("BaseWorkerAsgDFF",comapareDetailsMap);
          if(comapareDetailsMap.get(flexVOName) != null )
              return comapareDetailsMap.get(flexVOName).get(0).getCompareMap().entrySet().toArray();
          return new Object[0];
          
      }
      
      public Object[] getPeopleGroupKFFVO(){
          if(null == comapareDetailsMap) initCompare();
          String flexVOName = getFlexFieldNameWithContext("PeopleGroupKFF",comapareDetailsMap);
          if(comapareDetailsMap.get(flexVOName) != null )
              return comapareDetailsMap.get(flexVOName).get(0).getCompareMap().entrySet().toArray();
          return new Object[0];
          
      }
      public Object[] getAssignmentExtraInfoEFFVO(){
          if(null == comapareDetailsMap) initCompare();
          String flexVOName = getFlexFieldNameWithContext("AssignmentExtraInfoEFF",comapareDetailsMap);
          if(comapareDetailsMap.get(flexVOName) != null )
              return comapareDetailsMap.get(flexVOName).get(0).getCompareMap().entrySet().toArray();
          return new Object[0];
          
      }
      
      public String getFlexFieldNameWithContext(String flexVOName, Map<String, List<ComparePojo>> comapareDetailsMap){
          for (Map.Entry<String, List<ComparePojo>> entry : comapareDetailsMap.entrySet()) {
              if (entry.getKey().startsWith(flexVOName)) {
                  return entry.getKey();
              }
          }
          return  null;
      }
  }
