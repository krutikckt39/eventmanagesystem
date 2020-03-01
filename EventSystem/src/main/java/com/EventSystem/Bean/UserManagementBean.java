package com.EventSystem.Bean;

public class UserManagementBean {

	private String owner_name;
	private String owner_email;
	private String owner_phone;
	private String owner_gender;
	private String owner_address;
	
	
	
	public UserManagementBean() {
		super();
	}


	public UserManagementBean(String owner_name, String owner_email, String owner_phone, String owner_gender,
			String owner_address) 
	{
		super();
		this.owner_name = owner_name;
		this.owner_email = owner_email;
		this.owner_phone = owner_phone;
		this.owner_gender = owner_gender;
		this.owner_address = owner_address;
	}
	
	
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getOwner_email() {
		return owner_email;
	}
	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}
	public String getOwner_phone() {
		return owner_phone;
	}
	public void setOwner_phone(String owner_phone) {
		this.owner_phone = owner_phone;
	}
	public String getOwner_gender() {
		return owner_gender;
	}
	public void setOwner_gender(String owner_gender) {
		this.owner_gender = owner_gender;
	}
	public String getOwner_address() {
		return owner_address;
	}
	public void setOwner_address(String owner_address) {
		this.owner_address = owner_address;
	}
	
	
}
