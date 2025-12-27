package com.constructor.levelone;

import java.util.Scanner;
public class LibraryBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the books ( Book1, Book2 Book3): ");
		String input = sc.nextLine();
		Book b = new Book();
		boolean bookAvail = b.isAvailable(input);
		if( bookAvail)
			System.out.print(input + " is available");
		else 
			System.out.println(input + " isn't available");
		sc.close();
	}

}
