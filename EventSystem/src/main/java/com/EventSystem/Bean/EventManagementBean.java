package com.EventSystem.Bean;

public class EventManagementBean {

	
	private String e_type;
	private String hall_name;
	private String org_email;
	private String org_phone;
	private String hall_capacity;
	private String e_location;
	private String e_price;
	
	
	public EventManagementBean(String e_type, String hall_name, String org_email, String org_phone,
			String hall_capacity, String e_location, String e_price) {
		super();
		this.e_type = e_type;
		this.hall_name = hall_name;
		this.org_email = org_email;
		this.org_phone = org_phone;
		this.hall_capacity = hall_capacity;
		this.e_location = e_location;
		this.e_price = e_price;
	}


	public EventManagementBean() {
		super();
	}


	public String getE_type() {
		return e_type;
	}


	public void setE_type(String e_type) {
		this.e_type = e_type;
	}


	public String getHall_name() {
		return hall_name;
	}


	public void setHall_name(String hall_name) {
		this.hall_name = hall_name;
	}


	public String getOrg_email() {
		return org_email;
	}


	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}


	public String getOrg_phone() {
		return org_phone;
	}


	public void setOrg_phone(String org_phone) {
		this.org_phone = org_phone;
	}


	public String getHall_capacity() {
		return hall_capacity;
	}


	public void setHall_capacity(String hall_capacity) {
		this.hall_capacity = hall_capacity;
	}


	public String getE_location() {
		return e_location;
	}


	public void setE_location(String e_location) {
		this.e_location = e_location;
	}


	public String getE_price() {
		return e_price;
	}


	public void setE_price(String e_price) {
		this.e_price = e_price;
	}
	
	
	
	
	
	
		
}
