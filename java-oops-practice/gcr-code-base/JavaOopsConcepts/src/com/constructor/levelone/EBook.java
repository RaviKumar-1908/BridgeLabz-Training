package com.constructor.levelone;

public class EBook extends Book1{

	  private double fileSize;

	    public EBook(String ISBN, String title, String author, double fileSize) {
	        super(ISBN, title, author);
	        this.fileSize = fileSize;
	    }

	    public void displayDetails() {
	        System.out.println("ISBN: " + ISBN);        
	        System.out.println("Title: " + title);      
	        System.out.println("Author: " + getAuthor());
	        System.out.println("File Size: " + fileSize + " MB");
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook eb = new EBook("978-0134685991",
                "Effective Java",
                "Joshua Bloch",
                5.4);

		eb.displayDetails();

		eb.setAuthor("J. Bloch");
		System.out.println("\nUpdated Author: " + eb.getAuthor());
	}

}
