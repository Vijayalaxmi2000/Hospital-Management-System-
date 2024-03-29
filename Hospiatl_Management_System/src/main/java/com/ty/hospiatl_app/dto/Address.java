package com.ty.hospiatl_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Address 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int aid;
	private String street;
	private String state;
	private String country;
	@OneToOne(mappedBy="address")
	private Branch branches;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Branch getBranch() {
		return branches;
	}
	public void setBranch(Branch branches) {
		this.branches = branches;
	}
	

}
