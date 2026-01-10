package com.foodloop;

public class FoodLoopMain {

	public static void main(String[] args) {
		User user1 = new User("Ravi");
		Order order1 = new Order(user1);
		
		FoodItem dal = new VegItem(30.0,"Dal");
		FoodItem sabji = new VegItem(20.0,"Sabji");
		FoodItem chawal = new VegItem(15.0,"Chawal");
		FoodItem chicken = new NonVegItem(20.0,"Chicken");
		FoodItem fish = new NonVegItem(15.0,"Fish");

		order1.placeOrder(dal, sabji);
		order1.placeOrder(fish);
		order1.placeOrder(chicken);
		order1.cancelOrder();
		order1.generateBill();
		
		
	}

}
