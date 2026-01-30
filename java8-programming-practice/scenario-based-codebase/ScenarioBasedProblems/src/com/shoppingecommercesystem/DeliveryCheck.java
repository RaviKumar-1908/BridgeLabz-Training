package com.shoppingecommercesystem;

@FunctionalInterface
public interface DeliveryCheck {
    boolean isFree(double amount);
}
