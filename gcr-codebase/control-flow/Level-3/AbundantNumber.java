// create a class AbundantNumber to find whether the input is an abundant number or not
import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating variables and taking user's input
        System.out.print("Enter the number ");
        int input = sc.nextInt();

        // calculating sum of the divisors
        int sum = 0;
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                sum += i;
            }
        }

        // displaying the output
        if (sum > input)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");

        sc.close();
    }
}
