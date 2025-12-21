import java.util.Scanner;

public class BMICalculator {

    // This method is calculating and storing the bmi of each person
    public static void calculateBMI(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            double weight = arr[i][0];
            double heightCm = arr[i][1];
            double heightMeter = heightCm / 100;

            arr[i][2] = weight / (heightMeter * heightMeter);
        }
    }

    // determine BMI status
    public static String[] getBMIStatus(double[][] arr) {
        String[] status = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            double bmi = arr[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 40) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //creating an array
        double[][] persons = new double[10][3];

        // Input weight and height from user
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        //calling function to get the BMI of each person
        calculateBMI(persons);

        // Get BMI status
        String[] bmiStatus = getBMIStatus(persons);

        // printing result

    for (int i = 0; i < persons.length; i++)
    System.out.println("Weight: " + persons[i][0] + ", Height: " + persons[i][1] + ", BMI: " + persons[i][2] + ", Status: " + bmiStatus[i]);

        sc.close();
    }
}
