package com.constructor.levelone;

public class Manager extends Employee {

    private String designation;

    public Manager(int employeeID, String department,
                   double salary, String designation) {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);   // public
        System.out.println("Department: " + department);    // protected
        System.out.println("Salary: " + getSalary());        // private via method
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub

        Manager m = new Manager(501, "IT", 60000, "Project Manager");

        m.displayDetails();

        m.setSalary(70000);
        System.out.println("\nUpdated Salary: " + m.getSalary());
    }
}


