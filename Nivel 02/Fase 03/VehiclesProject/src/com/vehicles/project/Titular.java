package com.vehicles.project;

import java.util.*;

public class Titular extends Person {
	
	protected String insurance;
	protected String parking;

	public Titular(String fullname, String birthdate, String insurance, String parking) {
		super(fullname, birthdate);
		this.insurance = insurance;
		this.parking = parking;
		
	}

	public String getfullname() {
		return fullname;
	}
	public String getbirthdate() {
		return birthdate;
	}
	public String getinsurance() {
		return insurance;
	}
	public String getparking() {
		return parking;
	}

	public static void addLicense(String id, String namesurname, String expdate, String category) {
		addLicense(id, namesurname, expdate, category);
	}
	
	public static void main(String[] args) {
		
	}
}
