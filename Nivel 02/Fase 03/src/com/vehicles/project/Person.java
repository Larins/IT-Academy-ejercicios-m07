package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {

	protected String name;
	protected String surname;
	protected String birthdate;
	protected String license;
	
	public Person(String name, String surname, String birthdate, String license) {
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.license = license;
	}
}

