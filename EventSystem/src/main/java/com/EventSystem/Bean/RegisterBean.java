package com.EventSystem.Bean;

public class RegisterBean {
	
	private String email;
	private String uname;
	private String passwd;
	
	private String adname;
	private String adpassword;
	private String ademail;
	
	

	public RegisterBean() {
		super();
	}


	
	
	
	public RegisterBean(String email, String uname, String passwd, String adname, String adpassword, String ademail) {
		super();
		this.email = email;
		this.uname = uname;
		this.passwd = passwd;
		this.adname = adname;
		this.adpassword = adpassword;
		this.ademail = ademail;
	}





	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}





	public String getAdname() {
		return adname;
	}





	public void setAdname(String adname) {
		this.adname = adname;
	}





	public String getAdpassword() {
		return adpassword;
	}





	public void setAdpassword(String adpassword) {
		this.adpassword = adpassword;
	}





	public String getAdemail() {
		return ademail;
	}





	public void setAdemail(String ademail) {
		this.ademail = ademail;
	}


	
	
}
