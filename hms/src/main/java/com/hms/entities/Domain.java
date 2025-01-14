package com.hms.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Domain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int domain_id;

	@Column(nullable = false)
	private String domain_role;

	@OneToMany(mappedBy = "domain", cascade = CascadeType.ALL)
	private Set<Candidates> candidates = new HashSet<>();

	public Domain() {
		super();
	}

	public Domain(int domain_id, String domain_role, Set<Candidates> candidates) {
		super();
		this.domain_id = domain_id;
		this.domain_role = domain_role;
		this.candidates = candidates;
	}

	public int getDomain_id() {
		return domain_id;
	}

	public void setDomain_id(int domain_id) {
		this.domain_id = domain_id;
	}

	public String getDomain_role() {
		return domain_role;
	}

	public void setDomain_role(String domain_role) {
		this.domain_role = domain_role;
	}

	@JsonbTransient
	public Set<Candidates> getCandidates() {
		return candidates;
	}

	public void setCandidates(Set<Candidates> candidates) {
		this.candidates = candidates;
	}

	@Override
	public String toString() {
		return "Domain [domain_id=" + domain_id + ", domain_role=" + domain_role + ", candidates=" + candidates + "]";
	}

}
