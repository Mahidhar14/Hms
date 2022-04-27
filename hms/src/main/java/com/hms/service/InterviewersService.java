package com.hms.service;

import java.util.List;

import com.hms.entities.Interviewer;
import com.hms.entities.InterviewerIdentity;

public interface InterviewersService {
	
	public abstract InterviewerIdentity findInterviewerById(int id);

	public abstract List<Interviewer> findAllInterviewers();

	public abstract void addInterviewer(Interviewer interviewer);

}