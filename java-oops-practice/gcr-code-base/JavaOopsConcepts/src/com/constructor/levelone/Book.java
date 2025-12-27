package com.constructor.levelone;

public class Book {
		
	private String title;
	private String author;
	private int price;
	
	private String[] books = {"Book1", "Book2", "Book3" };
	private boolean[] availibility= {true, false,true};
	public Book() {
		title = "Panchvati";
		author = "Ravi Kumar";
		price = 100;
	}
	public boolean isAvailable(String input) {
		for ( int i =0; i < books.length; i++) {
			if( books[i].equals(input))
			  return availibility[i];
		}
		return false;
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void displayResult() {
		System.out.println("Title Name: " + this.title + "\n Author Name :" + this.author + "\n Price : " + this.price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using default constructors");
		Book b1 = new Book();
		b1.displayResult();
		
		System.out.println("Using parameterized constructor");
		Book b2 = new Book("BookName" , "Ravi" , 169);
		b2.displayResult();
	}

}
