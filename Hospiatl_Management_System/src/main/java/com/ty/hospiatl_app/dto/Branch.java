package com.ty.hospiatl_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Branch 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int bid;
	private String name;
	private long phNo;
	private String email;
	@JoinColumn
	@ManyToOne
	private Hospital hospitals;
	@JoinColumn
	@OneToOne
	private Address address;
	@OneToMany(mappedBy="branches")
	private List<Encounter> encounters;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Encounter> getEncounter() {
		return encounters;
	}
	public void setEncounter(List<Encounter> encounters) {
		this.encounters = encounters;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Hospital getHospital() {
		return hospitals;
	}
	public void setHospital(Hospital hospitals) {
		this.hospitals = hospitals;
	}



}
