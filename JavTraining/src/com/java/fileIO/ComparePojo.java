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
import java.util.Map;

public class ComparePojo {
    public ComparePojo() {
            // TODO Auto-generated constructor stub
    }

    String name;
    Map<String,ComparisonAttribute> compareMap;
    
    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public Map<String, ComparisonAttribute> getCompareMap() {
            return compareMap;
    }

    public void setCompareMap(Map<String, ComparisonAttribute> compareMap) {
            this.compareMap = compareMap;
    }

    @Override
    public String toString() {
            return "ComparePojo [name=" + name + ", compareMap=" + compareMap + "]";
    }
}
