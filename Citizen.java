package com.tnsif.scanner;

public class Citizen {
private String name;
private String aadharNo;
private String address;
private long phno;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhno() {
	return phno;
}

public Citizen() {
	System.out.println("i am a default constructor");
	
}

public Citizen(String name, String aadharNo, String address, long phno) {
	super();
	this.name = name;
	this.aadharNo = aadharNo;
	this.address = address;
	this.phno = phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}

}
