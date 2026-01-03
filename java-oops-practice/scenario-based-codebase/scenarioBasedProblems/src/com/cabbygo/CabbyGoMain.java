package com.cabbygo;

import java.util.Scanner;

public class CabbyGoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User u1 = new User("Ravi",20, "Bhopal");
		Driver d1 = new Driver("Mukesh",4, "JDF 434 534");
		
		
		
		u1.bookRide(d1);
		System.out.printf("%nChoose vehicle from these three","Mini","SUV","Sedan: ");
		String input = sc.next();
		Vehicle m1 = null;
		switch ( input ) {
		case "SUV" -> {
			m1 = new SUV ("BR A3 4343", 10, 20, 2000);
		}
		case "Mini" ->{
			m1 = new Mini ("HR F3 3441",5,10, 1000);
		}
		case "Sedan" -> {
			m1 =new Sedan("CH A3 2493", 7, 15, 1500);
		}
		}
		d1.assignVehicle(m1);
		u1.endRide(d1);
		m1.calculateFare(u1);
	}

}
