// Creating a utility class NumberCheckerVersionTwo to perform digit based operations

import java.util.Scanner;

class NumberCheckerVersionTwo {

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

        for (int i= count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num = num / 10;
        }
        return digits;
    }

    // Creating a function to find sum of digits using digits array
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int i= 0; i < digits.length; i++)
            sum += digits[i];
        return sum;
    }

    // Creating a function to find sum of squares of digits using Math.pow()
    public static int findSumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int i= 0; i < digits.length; i++)
            sum += Math.pow(digits[i], 2);
        return sum;
    }

    // Creating a function to check whether a number is a Harshad Number
    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = findSumOfDigits(digits);
        return num % sum == 0;
    }

    // Creating a function to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;   // digit
            freq[i][1] = 0;   // frequency
        }

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);
	
	// Following each function and printing the results
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + findSumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + findSumOfSquaresOfDigits(digits));
        System.out.println("Harshad Number: " + isHarshadNumber(number, digits));
	// Calling fine digit frequency function to get the frequency of each digit in second 2D array
        int[][] frequency = findDigitFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0)
                System.out.println("Digit: " + frequency[i][0] + " Frequency: " + frequency[i][1]);
        }

        sc.close();
    }
}
