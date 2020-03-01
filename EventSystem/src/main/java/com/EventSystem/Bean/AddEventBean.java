package com.EventSystem.Bean;

public class AddEventBean {

	
	private String owner_name;
	private String owner_email;
	private String owner_phone;
	private String lang;


	public AddEventBean() {
		super();
	}




	public AddEventBean(String lang) {
		super();
		this.lang = lang;
	}




	public AddEventBean(String owner_name, String owner_email, String owner_phone) {
		super();
		this.owner_name = owner_name;
		this.owner_email = owner_email;
		this.owner_phone = owner_phone;

	}
	
	
	
	






	public String getLang() {
		return lang;
	}




	public void setLang(String lang) {
		this.lang = lang;
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

	
}
