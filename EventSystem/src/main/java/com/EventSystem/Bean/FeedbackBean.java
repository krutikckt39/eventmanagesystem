package com.EventSystem.Bean;

public class FeedbackBean {

	private String n_name;
	private String n_email;
	private String n_message;
	
	private String c_name;
	private String c_sub;
	private String c_disc;
	
	
	
	public FeedbackBean() {
		super();
	}	
	
	
	public FeedbackBean(String n_name, String n_email, String n_message, String c_name, String c_sub, String c_disc) {
		super();
		this.n_name = n_name;
		this.n_email = n_email;
		this.n_message = n_message;
		this.c_name = c_name;
		this.c_sub = c_sub;
		this.c_disc = c_disc;
	}


	// User Feedback Detail
	
	
	public String getN_name() {
		return n_name;
	}
	public void setN_name(String n_name) {
		this.n_name = n_name;
	}
	public String getN_email() {
		return n_email;
	}
	public void setN_email(String n_email) {
		this.n_email = n_email;
	}
	public String getN_message() {
		return n_message;
	}
	public void setN_message(String n_message) {
		this.n_message = n_message;
	}

	
	//Customer Feedback detail 
	
	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_sub() {
		return c_sub;
	}

	public void setC_sub(String c_sub) {
		this.c_sub = c_sub;
	}

	public String getC_disc() {
		return c_disc;
	}

	public void setC_disc(String c_disc) {
		this.c_disc = c_disc;
	}
	
	
	
	
}
