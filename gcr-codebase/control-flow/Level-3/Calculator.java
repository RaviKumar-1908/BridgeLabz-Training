// creating a class Calculator using switch case to perform various mathematical operations
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating variables and taking user's input
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter operator: ");
        String op = sc.next();

        // performing calculation using switch 
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0)
                    System.out.println("Result: " + (first / second));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
