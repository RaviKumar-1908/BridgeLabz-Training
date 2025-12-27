package com.constructor.levelone;

public class HotelBooking {
	private String guestName, roomType;
	private int night;
	
	public HotelBooking() {
		this.guestName = "Guest";
		this.roomType = "Delux";
		this.night = 3;
	}
	
	public HotelBooking(String guestName, String roomType, int night) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.night = night;
	}
	
	public HotelBooking(HotelBooking oldObj) {
		this.guestName = oldObj.guestName;
		this.roomType = oldObj.roomType;
		this.night = oldObj.night;
	}
	
	public void getDetails() {
		System.out.println("Guest Name : " + guestName + "\n Room Type :" + roomType + "\n Night :" + night);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelBooking h1 = new HotelBooking();
		HotelBooking h2 = new HotelBooking("Ravi", "Single", 2);
		HotelBooking h3 = new HotelBooking(h2);
		
		System.out.println("Using default parameter\n");
		h1.getDetails();
		System.out.println("Using parameterized parameter\n");
		h2.getDetails();
		System.out.println("Using copy constructor\n");
		h3.getDetails();
		
		
	}

}
