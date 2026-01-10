package com.foodloop;

public interface IOrderable {
	void placeOrder(FoodItem fooditem1);
	void placeOrder(FoodItem fooditem, FoodItem fooitem2);
	void cancelOrder();
}
