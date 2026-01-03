package com.cabbygo;

public class User implements IRideService {
	private String name;
	int distance;
	private String location;
	User(String name, int distance, String location){
		this.name = name;
		this.distance = distance;
		this.location = location;
	}
	@Override
	public void bookRide(Driver d) {
		System.out.printf("Driver %s has been assingned to you....", d.name);
	}
	@Override
	public void endRide(Driver d) {
		System.out.printf("%nDriver %s has been Dropped you to your destination....", d.name);
	}
		
	
}
