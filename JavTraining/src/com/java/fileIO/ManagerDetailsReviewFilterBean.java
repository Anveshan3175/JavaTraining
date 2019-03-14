package com.java.fileIO;


public class ManagerDetailsReviewFilterBean {
  public ManagerDetailsReviewFilterBean() {
    super();
  }
  public ManagerDetailsReviewFilterBean(String name, String managerType, String managerId) {
    this.name=name;    
    this.managerType= managerType;    
    this.managerId = managerId;
  }
  
  private String name;
  private String managerType;
  private String managerId;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setManagerType(String managerType) {
    this.managerType = managerType;
  }

  public String getManagerType() {
    return managerType;
  }

  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }

  public String getManagerId() {
    return managerId;
  }
}
