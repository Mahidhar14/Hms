package com.hms.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


/*
 * 
 */
@Entity
public class Interviewer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private InterviewerIdentity interviewerIdentity;

	private String name;
	private String exp;
	private String status;
	private String interview_skills;
	public Interviewer() {
		super();
	}
	public Interviewer(InterviewerIdentity interviewerIdentity, String name, String exp, String status,
			String interview_skills) {
		super();
		this.interviewerIdentity = interviewerIdentity;
		this.name = name;
		this.exp = exp;
		this.status = status;
		this.interview_skills = interview_skills;
	}
	public InterviewerIdentity getInterviewerIdentity() {
		return interviewerIdentity;
	}
	public void setInterviewerIdentity(InterviewerIdentity interviewerIdentity) {
		this.interviewerIdentity = interviewerIdentity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInterview_skills() {
		return interview_skills;
	}
	public void setInterview_skills(String interview_skills) {
		this.interview_skills = interview_skills;
	}
	
	
	
}