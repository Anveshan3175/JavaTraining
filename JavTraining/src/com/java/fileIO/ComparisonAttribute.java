package com.java.fileIO;

/*===========================================================================+
 |      Copyright (c) 2008 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |                                                                           |
 |  HISTORY                                                                  |
 |  Name        Date         Version Bug      Text                           |
 |  ----------- -----------  ------- -------- -----------------------------  |
 | akunduru     16/Jan/2018  27369644         Added to this class for impleme|
 |                                            ntation of review page display |
 +===========================================================================*/


public class ComparisonAttribute {
    public ComparisonAttribute() {
        super();
    }
    
    
    private String attributeName;
    private String oldValue;
    private String newValue;
    private String resBundle;
    private String resKey;
    public static final String LABEL_NOT_DEFINED_IN_COMPARE_DUMP = null;


    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getNewValue() {
        return newValue;
    }

    
    public String getLabel() {
        if (null != resBundle && !"".equals(resBundle) &&
            null != resKey && !"".equals(resKey)) {
            //return BundleFactory.getBundle(resBundle).getString(resKey);
        	return "Label";
        }
        return LABEL_NOT_DEFINED_IN_COMPARE_DUMP;
    }

    public boolean getIsModified() {
        if (oldValue != null && newValue != null && oldValue.equals(newValue))
            return false;
        if (oldValue == null && newValue == null)
            return false;
        if (oldValue != null && newValue == null)
            return false;
        if (oldValue == null && newValue != null)
            return false;
        return true;

    }

    public void setResBundle(String resBundle) {
        this.resBundle = resBundle;
    }

    public String getResBundle() {
        return resBundle;
    }

    public void setResKey(String resKey) {
        this.resKey = resKey;
    }

    public String getResKey() {
        return resKey;
    }
}
