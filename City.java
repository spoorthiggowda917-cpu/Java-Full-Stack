package com.tnsif.inheritance;

public class City extends State{

private String cityName;
private long pincode;


public City() {
	super();
	
}
public City(String countryName, String aadharNo, String state, String lang, String cityName , long pincode) {
	super(countryName, aadharNo, state, lang);
	this.cityName=cityName;
	this.pincode=pincode;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
public String toString() {
    return "Country: " + getCountryName() +
           ", Aadhar: " + getAadharNo() +
           ", State: " + getState() +
           ", Language: " + getLang() +
           ", City: " + cityName +
           ", Pincode: " + pincode;
}


}
