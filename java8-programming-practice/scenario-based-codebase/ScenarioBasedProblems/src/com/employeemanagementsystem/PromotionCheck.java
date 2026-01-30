package com.employeemanagementsystem;

@FunctionalInterface
public interface PromotionCheck {
    boolean isEligible(int experience);
}
