package com.tnsif.inheritance;

public class Country {

private String countryName;
private String aadharNo;

public Country() {
	System.out.println("i am a default constructor");
	
}
public Country(String countryName, String aadharNo) {
	super();
	this.countryName = countryName;
	this.aadharNo = aadharNo;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}

}
