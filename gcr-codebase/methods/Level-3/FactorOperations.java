// Creating a class FactorOperations to perform operations using factors of a number

import java.util.Scanner;

class FactorsOfNumber {

    // Creating a method to find factors of a number and return as an array
    public static int[] findFactors(int num) {

        int count = 0;

        // first loop to count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // second loop to store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }
        return factors;
    }

    // Creating a method to find the greatest factor using factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int i = 1; i < factors.length; i++)
            if (factors[i] > greatest)
                greatest = factors[i];
        return greatest;
    }

    // Creating a method to find sum of the factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++)
            sum += factors[i];
        return sum;
    }

    // Creating a method to find product of the factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++)
            product *= factors[i];
        return product;
    }

    // Creating a method to find product of cube of factors
    public static long findProductOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++)
            product *= Math.pow(factors[i], 3);
        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++)
            System.out.print(factors[i] + " ");

	//calling function and printing result
        System.out.println("\nGreatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));

        sc.close();
    }
}
