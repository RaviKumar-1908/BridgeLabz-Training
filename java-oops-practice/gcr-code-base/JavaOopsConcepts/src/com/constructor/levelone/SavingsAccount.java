package com.constructor.levelone;



public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance: " + getBalance());          // private via method
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        SavingsAccount sa = new SavingsAccount(12345, "Ravi", 25000, 4.5);

        sa.displayDetails();

        sa.setBalance(30000);
        System.out.println("\nUpdated Balance: " + sa.getBalance());
    }
}
