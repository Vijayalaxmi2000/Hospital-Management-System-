package com.ty.hospiatl_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Items 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int iid;
	private String name;
	private double cost;
	private String quantity;
	@JoinColumn
	@ManyToOne
	private MedOrder orders;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public MedOrder getOrder() {
		return orders;
	}
	public void setOrder(MedOrder orders) {
		this.orders = orders;
	}
	
	

}
