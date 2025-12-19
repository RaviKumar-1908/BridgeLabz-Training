//create a class BMI to determine the weight status of the person
import java.util.Scanner;
class BMI{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variables and taking user's input
	System.out.print("Enter the weight (in KG): ");
	double weight  = sc.nextDouble();
	System.out.print("Enter the height (in cm): ");
	double height= sc.nextDouble();
		
	//BMI calculation
	double 	bmi = weight / (height * height / 10000);

	//printing the status depending on the bmi value
	if ( bmi > 40.0)
	    System.out.println("Obese");
	else if ( bmi > 25.0 && bmi < 40.0)
	    System.out.println("Overweight");
	else if ( bmi > 18.5 && bmi < 25)
	    System.out.println("Normal");
	else if ( bmi <= 18.4)
	    System.out.println("Underweight");

	
	
	
	sc.close();
    }
}