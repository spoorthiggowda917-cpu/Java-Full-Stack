package com.tnsif.inheritance;

public class State extends Country{
	private String state;
	private String lang;
	
	
	public State() {
		System.out.println("i am a default constructor");
		
	}
	public State(String countryName, String aadharNo, String state, String lang) {
		super(countryName, aadharNo);
		this.state=state;
		this.lang=lang;
		
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
	

}
