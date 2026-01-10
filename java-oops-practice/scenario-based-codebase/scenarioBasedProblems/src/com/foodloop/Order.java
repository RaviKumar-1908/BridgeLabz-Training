package com.foodloop;
import java.util.*;

public class Order implements IOrderable{
	
	double totalAmount;
	
	ArrayList<FoodItem> foodItems;
	
	User user;
	
	Order( User user){
		System.out.printf("====== Welcome to FoodLoop =====%n");
		System.out.printf("Add your meals...%n");
		foodItems = new ArrayList<>();
		this.user  = user;
		
	}
	
	
	public void placeOrder(FoodItem fooditem) {
		System.out.println(" Single order placed: "+ fooditem.name);
		foodItems.add(fooditem);
	}
	
	public void placeOrder(FoodItem foodItem1, FoodItem foodItem2) {
		System.out.println(" Combo Order placed..: " + foodItem1.name + ", " + foodItem2.name);;
		foodItems.add(foodItem1);
		foodItems.add(foodItem2);
	}
	
	public void cancelOrder() {
		System.out.println("\nOrder cancled..");
		foodItems.clear();
	}
	
	public void generateBill() {
		System.out.println("\n=====BILL====\n");
		double totalAmount = 0;
		for ( FoodItem item : foodItems) {
			
			if ( item instanceof VegItem) {
				totalAmount += item.price * .9;   // 10% off on Veg item;
			}
			else
			{
				totalAmount += item.price * .95;   // 5% off on Non-veg item;
			}
			
			System.out.printf("%-10s %.1f%n",item.name, item.price);
		}
		System.out.printf("%n----------------------------------------%n");
		System.out.printf("Total amount after Discount is:  %.2f" ,totalAmount);
		};
	
}
