package com.cabbygo;

public class Mini extends Vehicle {
	String name = "Mini";
	protected int capacity;
	private double baseFare = 1000;
	private double rate  = 10;
	Mini(String vehicleNumber, int capacity, int rate, int baseFare){
	super("JK 21A 9080", "Mini");
	this.capacity = capacity;
	}
	
	public void calculateFare(User u) {
		int totalprice =(int) (baseFare + (u.distance * rate));
		System.out.printf("%nTotal Fare for the ride of  %d km is %d ",  u.distance,  totalprice  );
	}
}
