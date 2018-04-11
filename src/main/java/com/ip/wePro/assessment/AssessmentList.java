package com.ip.wePro.assessment;

import java.util.List;

public class AssessmentList {
	
	private List<Assessment> assessmentQuestions;
	
	public AssessmentList()
	{
		
	}

	public AssessmentList(List<Assessment> assessmentQuestions) {
		super();
		this.assessmentQuestions = assessmentQuestions;
	}

	public List<Assessment> getAssessmentQuestions() {
		return assessmentQuestions;
	}

	public void setAssessmentQuestions(List<Assessment> assessmentQuestions) {
		this.assessmentQuestions = assessmentQuestions;
	}
	
	

}
