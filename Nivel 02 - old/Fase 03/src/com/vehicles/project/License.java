package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class License {

	protected String id;
	protected String type;
	protected String fullname;
	protected String expdate;
	
	public License(String id, String type, String fullname, String expdate) {
		this.id = id;
		this.type = type;
		this.fullname = fullname;
		this.expdate = expdate;
	}
}

