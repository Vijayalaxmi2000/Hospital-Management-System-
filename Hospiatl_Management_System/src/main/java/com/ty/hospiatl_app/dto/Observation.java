package com.ty.hospiatl_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Observation
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int oid;
	private String dname;
	private String reason_Observation;
	@JoinColumn
	@ManyToOne
	private Encounter encounters;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getReasonOfObservation() {
		return reason_Observation;
	}
	public void setReasonOfObservation(String reason_Observation) {
		this.reason_Observation = reason_Observation;
	}
	public Encounter getEncounter() {
		return encounters;
	}
	public void setEncounter(Encounter encounters) {
		this.encounters = encounters;
	}
	

}
