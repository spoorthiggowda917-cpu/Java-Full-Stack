package com.tnsif.scanner;

public class Student extends Citizen {

	private int rollno;
	private String collegeName;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	public Student() {
		super();
		
	}
	
	public Student(String name, String aadharNo, String address, long phno,int rollno,String collegeName) {
		super(name, aadharNo, address, phno);//refer to it immediate superclass
		this.collegeName=collegeName;
		this.rollno=rollno;
	}
	
    public String toString() {
        return "Name: " + getName() +
               ", Aadhar: " + getAadharNo() +
               ", Address: " + getAddress() +
               ", Phone: " + getPhno() +
               ", Roll No: " + rollno +
               ", College: " + collegeName;
    }

}
