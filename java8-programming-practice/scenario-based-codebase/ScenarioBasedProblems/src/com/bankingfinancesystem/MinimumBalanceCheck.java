package com.bankingfinancesystem;

@FunctionalInterface
public interface MinimumBalanceCheck {
    boolean check(double balance);
}
