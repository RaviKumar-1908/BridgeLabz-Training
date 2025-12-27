package com.constructor.levelone;

public class Product {
	 
    private String productName;
    private double price;

   
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Product p1 = new Product("Laptop", 55000);
	        Product p2 = new Product("Mobile", 18000);

	        p1.displayProductDetails();
	        System.out.println();
	        p2.displayProductDetails();
	        System.out.println();

	        Product.displayTotalProducts();
	}

}
