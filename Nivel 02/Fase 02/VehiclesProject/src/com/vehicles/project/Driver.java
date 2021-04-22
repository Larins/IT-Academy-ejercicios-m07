package com.vehicles.project;
import java.util.*;

public class Driver extends Person {
	
	protected String fullname;
	protected String birthdate;

	public Driver(String fullname, String birthdate) {
		super(fullname, birthdate);
	}

	public String getfullname() {
		return fullname;
	}
	public String getbirthdate() {
		return birthdate;
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
