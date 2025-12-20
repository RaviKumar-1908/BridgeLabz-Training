//create a class EmployeeBonus find bonus and new salary
import java.util.Scanner;
class EmployeeBonus{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //creating arrays for salary and years of year
        double[] salary = new double[10];
        double[] year = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        //taking input from user
        for(int index = 0; index < 10; index++){
            System.out.print("Enter salary: ");
            salary[index] = sc.nextDouble();
            System.out.print("Enter years of year: ");
            year[index] = sc.nextDouble();

            if(salary[index] <= 0 || year[index] < 0){
                System.out.println("Invalid input, enter again");
                index--;
            }
        }

        //calculating bonus and new salary
        for(int index = 0; index < 10; index++){
            if(year[index] > 5)
                bonus[index] = salary[index] * 0.05;
            else
                bonus[index] = salary[index] * 0.02;

            newSalary[index] = salary[index] + bonus[index];

            totalBonus = totalBonus + bonus[index];
            totalOldSalary = totalOldSalary + salary[index];
            totalNewSalary = totalNewSalary + newSalary[index];
        }

        //printing the output
        System.out.println("Total bonus: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        sc.close();
    }
}
