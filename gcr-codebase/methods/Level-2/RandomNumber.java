//creating a class RandomNumber to generate 5 random number and find minimum, maximum and their average 

import java.util.Scanner;

public class RandomNumber{

    // this method generates five 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    //  find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double avg = (double) sum / numbers.length;
	double [] result = {avg, min, max};
        return result;
    }

    public static void main(String[] args) {

        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated Numbers:");
        for (int n : randomNumbers) {
            System.out.print(n + " ");
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
