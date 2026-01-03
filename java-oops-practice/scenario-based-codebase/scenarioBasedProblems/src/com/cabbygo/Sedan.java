package com.cabbygo;

public class Sedan extends Vehicle{
	String name = "Sedan";
	protected int capacity;
	private double baseFare = 1500;
	private double rate  = 15;

	Sedan(String vehicleNumber, int capacity, int rate, int baseFare){
	super("BR 21A 9990", "Sedan");
	this.capacity = capacity;
	this.baseFare= baseFare;
	this.rate = rate;
	}
	
	public void  calculateFare(User u1) {
		int totalprice =(int) (baseFare + (u1.distance * rate));
		System.out.printf("%n Total Fare for the ride of  %d km is %d ",  u1.distance,  totalprice  );	}
}
