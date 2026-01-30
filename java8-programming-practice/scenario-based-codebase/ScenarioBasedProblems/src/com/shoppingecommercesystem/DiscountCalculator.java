package com.shoppingecommercesystem;

@FunctionalInterface
public interface DiscountCalculator {
    double apply(double price);
}
