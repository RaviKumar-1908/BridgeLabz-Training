/* 10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.*/


import java.util.Scanner;

public class PhoneRecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currentBalance = 0;
        boolean active = true;

        System.out.println("--- Mobile Recharge Simulator ---");

        while (active) {
            System.out.printf("%nYour Current Balance: $%.2f%n", currentBalance);
            System.out.println("Select Operator:");
            System.out.println("1. Jio\n2. Airtel\n3. VI\n0. Exit");
            System.out.print("Choice: ");
            
            int choice = sc.nextInt();

            if (choice == 0) {
                active = false;
                System.out.println("Exiting... Thank you!");
                continue;
            }

            
            switch (choice) {
                case 1 -> System.out.println("Jio Offers: [199: 1.5GB/day] [299: 2GB/day]");
                case 2 -> System.out.println("Airtel Offers: [239: Unlimited 5G] [479: 56 Days]");
                case 3 -> System.out.println("VI Offers: [155: 1GB/day] [259: Monthly Hero]");
                default -> {
                    System.out.println("Invalid Operator selected.");
                    continue;
                }
            }

            
            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount! Please try again.");
            } else {
                currentBalance += amount;
                System.out.printf("Recharge Successful! Added: $%.2f%n", amount);
            }
        }

        sc.close();
    }
}
