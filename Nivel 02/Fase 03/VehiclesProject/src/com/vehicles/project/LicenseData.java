package com.vehicles.project;

public class LicenseData {
	private String id;
	private String namesurname;
	private String expdate;
	private String category;

	public LicenseData(String id, String namesurname, String expdate, String category) {
		this.id = id;
		this.namesurname = namesurname;
		this.expdate = expdate;
		this.category = category;
	}
	
	public String getid() {
		return id;
	}
	
	public String getnamesurname() {
		return namesurname;
	}
	
	public String getexpdate() {
		return expdate;
	}
	
	public String getcategory() {
		return category;
	}
}
