package com.employeemanagementsystem;

@FunctionalInterface
public interface BonusCalculator {
    double calculate(double salary);
}
