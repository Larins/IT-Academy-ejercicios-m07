package com.vehicles.project;
import java.util.*;

public abstract class Person {

	protected static String fullname;
	protected static String birthdate;
	protected static List<LicenseData> license = new ArrayList<LicenseData>();

	public Person(String fullname, String birthdate) {
		Person.fullname = fullname;
		Person.birthdate = birthdate;
	}
}

