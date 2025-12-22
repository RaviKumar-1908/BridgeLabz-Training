// Creating a class NumberChecker to perform digit based operations

import java.util.Scanner;

class NumberChecker {

    // Creating a function to find the count of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Creating a function to store digits of number into an array
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num = num / 10;
        }
        return digits;
    }

    // Creating a function to check whether the number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0)
                return true;
        }
        return false;
    }

    // Creating a function to check whether the number is an Armstrong Number
    public static boolean isArmstrongNumber(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == num;
    }

    // Creating a function to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
	int arr[] = {largest, secondLargest};
        return arr;
    }

    // Creating a function to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        int arr[] = {smallest, secondSmallest};
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	
	// Taking the inputs From user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
	
	
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(number, digits));

	// Calling find largest and second largest Function to get second largest and largest number
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second Largest digit: " + largest[1]);

	// Calling the function file smallest and second In order to find the smallest and second smallest number
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second Smallest digit: " + smallest[1]);

        sc.close();
    }
}
