package com.tnsif.staticdemo;

public class Employee {
	//Declare instance variables.
	private String name;
	private int id;
	
	//Declare a static variable companyName with data type String
		//TNS company which is common for all objects.
		static String companyName = "TNS";

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//Declare a two-parameter constructor with parameters
	Employee(String name,int id){
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + " ,Company=" + companyName +"]";
	}
	
	}
	

