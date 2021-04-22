package com.vehicles.project;
import java.util.*;

public class Titular extends Person {
	
	protected static String fullname;
	protected static String birthdate;
	protected static String insurance;
	protected static String parking;

	public Titular(String fullname, String birthdate, String insurance, String parking) {
		super(fullname, birthdate);
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
	
	public static void addLicenseData(List<LicenseData> id, List<LicenseData> fullname, List<LicenseData> expdate, List<LicenseData> category) throws Exception {
		addLicenseData(id);
		addLicenseData(fullname);
		addLicenseData(expdate);
		addLicenseData(category);
	}
	
	private static void addLicenseData(List<LicenseData> license) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
	}
}
