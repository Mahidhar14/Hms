package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.dao.CandidatesDAO;
import com.hms.entities.Candidates;

/*
 * 
 */
@Service
@Transactional(readOnly = true)
public class CandidatesServiceImpl implements CandidatesService {

	@Autowired
	private CandidatesDAO dao;

	@Override
	public Candidates findCandidateById(int id) {
		Candidates candidates = dao.findCandidateById(id);
		return candidates;
	}

	@Override
	public List<Candidates> findAllCandidates() {
		return dao.findAllCandidates();
	}

	@Override
	@Transactional
	public void addCandidates(Candidates candidates) {
		dao.addCandidates(candidates);
	}

//	@Override
//	@Transactional
//	public Candidates updateCandidates(Candidates candidates) {
//		Candidates c = findCandidateById(candidates.getCandidates_id());
//		System.out.println(candidates.getCandidates_id());
//		if (c == null) {
//			throw new IllegalArgumentException("Id not Found " + candidates.getCandidates_id());
//		}
//		c.setFirstname(candidates.getFirstname());
//		c.setLastname(candidates.getLastname());
//		c.setExp(candidates.getExp());
//		c.setNoticeperiod(candidates.getNoticeperiod());
//		c.setPhoneno(candidates.getPhoneno());
//		c.setEmail(candidates.getEmail());
//		c.setInterview_sceduled_date(candidates.getInterview_sceduled_date());
//		c.setFeedback(candidates.getFeedback());
//		c.setInterviewer(candidates.getInterviewer());
//		c.setCandidates_skill(candidates.getCandidates_skill());
//		c.setQuestionaire(candidates.getQuestionaire());
//		return dao.updateCandidates(c);
//	}
}