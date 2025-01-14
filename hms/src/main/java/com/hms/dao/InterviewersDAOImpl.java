package com.hms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hms.entities.Interviewer;
import com.hms.entities.InterviewerIdentity;

@Repository
public class InterviewersDAOImpl implements InterviewersDAO {
	
	@PersistenceContext
	private EntityManager em;

	/*
	 * Get the Interviewers By Id.
	 */
	@Override
	public InterviewerIdentity findInterviewerById(int id) {
		InterviewerIdentity interviewerIdentity = em.find(InterviewerIdentity.class, id);
		return interviewerIdentity;
	}
	
	/*
	 * Get all the Interviewer present in the table.
	 */
	@Override
	public List<Interviewer> findAllInterviewers() {
		  return em.createQuery("SELECT i FROM Interviewer i", Interviewer.class).getResultList();   
	}

	/*
	 * Add Interviewer Details into database.
	 */
	@Override
	public void addInterviewer(Interviewer interviewer) {
		em.persist(interviewer);
	}
}
