package com.cabbygo;

public class SUV extends Vehicle{
	String name = "SUV";
	protected int capacity;
	private double baseFare ;
	private double rate  ;
	SUV(String vehicleNumber, int capacity,int rate, int baseFare){
	super(vehicleNumber,"SUV");
	this.capacity = capacity;
	this.rate =  rate;
	this.baseFare = baseFare;
	}
	public void calculateFare(User u1) {
		int totalprice =(int) (baseFare + (u1.distance * rate));
		System.out.printf("%n Total Fare for the ride of  %d km is %d ",  u1.distance,  totalprice  );
	}
	
}
