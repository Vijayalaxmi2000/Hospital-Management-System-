package com.ty.hospiatl_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter
{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int eid;
	private String reason;
	private String dateOfJoin;
	private String dateOfDischarge;
	@OneToMany(mappedBy="encounters")
	private List<Observation> obs;
	@JoinColumn
	@ManyToOne
	private Person persons;
	@JoinColumn
	@ManyToOne
	private Branch branches;
	@OneToMany(mappedBy="encounters")
	private List<MedOrder> orders;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public String getDateOfDischarge() {
		return dateOfDischarge;
	}
	public void setDateOfDischarge(String dateOfDischarge) {
		this.dateOfDischarge = dateOfDischarge;
	}
	public List<Observation> getObs() {
		return obs;
	}
	public void setObs(List<Observation> obs) {
		this.obs = obs;
	}
	public Person getPerson() {
		return persons;
	}
	public void setPerson(Person persons) {
		this.persons = persons;
	}
	public Branch getBranch() {
		return branches;
	}
	public void setBranch(Branch branches) {
		this.branches = branches;
	}
	public List<MedOrder> getOrder() {
		return orders;
	}
	public void setOrder(List<MedOrder> order) {
		this.orders = order;
	}
	
	
	
}
