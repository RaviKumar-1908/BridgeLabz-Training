//creating a class EmployeeBonus to find the bonus for employee on the basis of their experience
import java.util.Scanner;
class EmployeeBonus{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variable and taking input
	System.out.print("Enter salary: ");
	int salary = sc.nextInt();
	System.out.print("Enter Year of experience: ");
	int year = sc.nextInt();

	//calculating bonus
	double bonus = 0;
	if(year > 5)
	    bonus = salary * 0.05;
	
	System.out.println("Bonus Amount: " + bonus);
	sc.close();
    }
}