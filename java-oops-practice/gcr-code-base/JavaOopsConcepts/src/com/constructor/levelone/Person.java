package com.constructor.levelone;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	public Person (Person oldObj ) {
		this.name = oldObj.name;
		this.age = oldObj.age;
	}
	
	public void getDetails() {
		System.out.println("Name :" + this.name + "\nage :" + this.age);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1  = new Person("Ravi Kumar", 17);
		Person p2 = new Person(p1);
		System.out.println("Getting details using copy constructor");
		p2.getDetails();
			
		
	}

}
