//create a class BMICalculation to find bmi and status of people
import java.util.Scanner;
class BMICalculation{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
	//Syste.out.print("Enter the number of people ");
        int number = sc.nextInt();
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for(int index = 0; index < number; index++){
            System.out.print("Enter weight: ");
            weight[index] = sc.nextDouble();
            System.out.print("Enter height: ");
            height[index] = sc.nextDouble();

            bmi[index] = weight[index] / (height[index] * height[index] / 10000);

            if(bmi[index] < 18.5)
                status[index] = "Underweight";
            else if(bmi[index] < 25)
                status[index] = "Normal";
            else if(bmi[index] < 40)
                status[index] = "Overweight";
            else
                status[index] = "Obese";
        }

        for(int index = 0; index < number; index++){
            System.out.println(height[index] + " " + weight[index] + " " + bmi[index] + " " + status[index]);
        }

        sc.close();
    }
}
