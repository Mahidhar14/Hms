package com.hms.service;

import java.util.List;

import com.hms.entities.Candidates;

/*
 * 
 */
public interface CandidatesService {

	public abstract Candidates findCandidateById(int id);

	public abstract List<Candidates> findAllCandidates();

	public void addCandidates(Candidates candidates);

//	public abstract Candidates updateCandidates(Candidates candidates);
}
