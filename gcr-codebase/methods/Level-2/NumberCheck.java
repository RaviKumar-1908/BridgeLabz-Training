//create a class NumberCheck to check if the number I positive, negative, odd, even
import java.util.Scanner;

public class NumberCheck {

    // this function checks positive or negative
    public static boolean isPositive(int num) {
        return num > 0;
    }

    // this function checks even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Mthis function  compares two numbers
    public static int compare(int n1, int n2) {
        if (n1 > n2) {
            return 1;
        } else if (n1 == n2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (isPositive(num)) {
                if (isEven(num))
                    System.out.println(num + " is Positive and Even");
                else 
                    System.out.println(num + " is Positive and Odd");    
            }
	        else 
                    System.out.println(num + " is Negative");
            
        }

        // Comparing first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.print("Comparison of first and last elements: ");
        if (result == 1)
            System.out.println("First number is greater than last number");
        else if (result == 0)
            System.out.println("First number is equal to last number");
        else
            System.out.println("First number is less than last number");

        sc.close();
    }
}
