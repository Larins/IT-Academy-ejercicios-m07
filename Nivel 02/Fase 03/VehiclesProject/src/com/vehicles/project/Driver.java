package com.vehicles.project;

import java.util.*;

public class Driver extends Person {
	
	public Driver(String fullname, String birthdate) {
		super(fullname, birthdate);
		
	}

	public String getfullname() {
		return fullname;
	}
	public String getbirthdate() {
		return birthdate;
	}

	public static void addLicense(String id, String namesurname, String expdate, String category) {
		addLicense(id, namesurname, expdate, category);
	}
	
	public static void main(String[] args) {
		
	}
}
