// Creating a utility class NumberCheckerVersionFour to perform number based operations

import java.util.Scanner;

class NumberCheckerVersionFour {

    // Creating a method to check whether a number is Prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Creating a method to check whether a number is a Neon Number
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square = square / 10;
        }
        return sum == num;
    }

    // Creating a method to check whether a number is a Spy Number
    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num = num / 10;
        }
        return sum == product;
    }

    // Creating a method to check whether a number is an Automorphic Number
    public static boolean isAutomorphicNumber(int num) {
	int square = num * num;
        int originalNumber = num;
	int countDigits = 0;
	while( originalNumber != 0){
	    countDigits++;
	    originalNumber /=10;
	}
	int divisor = (int) Math.pow(10, countDigits);
	int lastNumberOfSquare  =  square % divisor;
	return num == lastNumberOfSquare;
    }

    //// Creating a method to check whether a number is a buzz number
    public static boolean isBuzzNumber(int num) {
	if ( num % 7 == 0 || num % 10 ==7 )
	    return true;
	else 
	    return false;       
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

	// Calling each function one by one and printing the result
        System.out.println("Prime Number: " + isPrime(number));
        System.out.println("Neon Number: " + isNeonNumber(number));
        System.out.println("Spy Number: " + isSpyNumber(number));
        System.out.println("Automorphic Number: " + isAutomorphicNumber(number));
	 System.out.println("Buzz Number: " + isBuzzNumber(number));

        sc.close();
    }
}
