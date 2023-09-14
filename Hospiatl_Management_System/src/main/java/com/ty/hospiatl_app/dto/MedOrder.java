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
public class MedOrder {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int mid;
	private String dname;
	private String orderDate;
	@OneToMany(mappedBy = "orders")
	private List<Items> items;
	@JoinColumn
	@ManyToOne
	private Encounter encounters;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Encounter getEncounter() {
		return encounters;
	}

	public void setEncounter(Encounter encounters) {
		this.encounters = encounters;
	}

}
