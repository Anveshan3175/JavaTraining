package com.java.fileIO;

public class TestAssignmentDetailReview {

	public TestAssignmentDetailReview() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//new AssignmentDetailsReviewBean().getBaseWorkerAsgDFFVO();
		//System.out.println(new AssignmentDetailsReviewBean().getAssignmentMDVOFteValueNewValue());
		AssignmentDetailsReviewBean bean = new AssignmentDetailsReviewBean();
		System.out.println(bean.getAssignmentMDVOFteValueLabel());
		System.out.println(bean.getAssignmentMDVOFteValueOldValue());
		System.out.println(bean.isAssignmentMDVOFteValueIsModified());
		System.out.println(bean.getAssignmentMDVOFteValueNewValue());
		//print();
	}
}
