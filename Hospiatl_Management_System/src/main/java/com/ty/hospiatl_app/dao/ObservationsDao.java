package com.ty.hospiatl_app.dao;

import java.util.List;

import com.ty.hospiatl_app.dto.Observation;

public interface ObservationsDao
{
	public Observation saveObservation(int eid, Observation observation);

	public Observation getObservationById(int oid);

	public boolean deleteObservationById(int oid);

	public Observation updateObservation(int oid, Observation observation);
	
	public List<Observation> getAllObservation();
	
	public List<Observation> getObservationByDoctorName(String name);
}
