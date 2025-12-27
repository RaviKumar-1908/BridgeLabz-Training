package com.constructor.levelone;

import java.util.Scanner;
public class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	public Circle() {
		this(12) ;
	}
		
	public void displayRadius() {
		System.out.println("Radius = " + radius);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int inputRadius = sc.nextInt();
		System.out.println("radius Set using constructor using default constructor");

		Circle c1 = new Circle();
		c1.displayRadius();
		
		System.out.println("radius Set using constructor with one parameters");
		Circle c2 = new Circle(inputRadius);
		c2.displayRadius();
		
		sc.close();
	}

}
