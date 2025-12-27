package com.constructor.levelone;

public class Course {

	private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "TIT";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new Course("Java", 6, 25000);
        Course c2 = new Course("Python", 4, 18000);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        System.out.println("\nUpdating Institute Name...\n");
        Course.updateInstituteName("Techncrats");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
	}

}
