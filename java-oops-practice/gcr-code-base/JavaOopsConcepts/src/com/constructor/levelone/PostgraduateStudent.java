package com.constructor.levelone;

public class PostgraduateStudent extends Student{

	 private String specialization;

	    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
	        super(rollNumber, name, CGPA);
	        this.specialization = specialization;
	    }

	    public void displayDetails() {
	        System.out.println("Roll Number: " + rollNumber); 
	        System.out.println("Name: " + name);               
	        System.out.println("CGPA: " + getCGPA());          
	        System.out.println("Specialization: " + specialization);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostgraduateStudent pg =
	            new PostgraduateStudent(101, "Ravi", 8.5, "Computer Science");

	        pg.displayDetails();
	}

}
