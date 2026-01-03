package com.cabbygo;

public class Driver {
	String name;
	private int rating ;
	private String licenseNumber;
	
	Driver(String name, int rating, String licenseNumber){
		this.name = name;
		this.rating = rating;
		this.licenseNumber = licenseNumber;
	}
	
	public void assignVehicle(Vehicle m1) {
		System.out.printf("%nThe driver is driving %s",m1.name);
	}
	
}
