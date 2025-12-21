// Creating a class StudentVoteChecker to check whether a student can vote or not
import java.util.Scanner;

public class StudentVoteChecker{

    // Method to check whether a student can vote or not
    public static Boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        if (age >= 18) {
            return true;
        }
        return false;
    }
   
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
       
	int[] ages = new int[10];
	
	//running loop, taking input, calling methods and priniting the result
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
	 
	    Boolean result = canStudentVote(ages[i]);
	    if ( result ) 
		System.out.println(" student " + (i + 1) + " can vote ");
	    else
		System.out.println(" student " + (i + 1) + " can't vote ");
	
	   }

	
        


        sc.close();
    }
}
