package com.ip.wePro.assessment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="assessment_result")
public class AssessmentResult {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "assessment_id")
	private String assessmentId;
	
	private int result;
	
	public AssessmentResult()
	{
		
	}

	public AssessmentResult(String userId, String assessmentId, int result) {
		super();
		this.userId = userId;
		this.assessmentId = assessmentId;
		this.result = result;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "AssessmentResult [userId=" + userId + ", assessmentId=" + assessmentId + ", result=" + result + "]";
	}	
}
