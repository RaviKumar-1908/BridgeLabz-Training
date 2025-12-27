package com.constructor.levelone;

public class Vehicle {

	private String ownerName;
    private String vehicleType;

    private static double registrationFee = 2500;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println("\nUpdating Registration Fee...\n");
        Vehicle.updateRegistrationFee(3000);

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
	}

}
