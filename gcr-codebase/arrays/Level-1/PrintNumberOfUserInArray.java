//create a class PrintNumberOfUserInArray to print number of user in array
import java.util.Scanner;
class PrintNumberOfUserInArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        //creating a variable to store user input and an array
        double[] arr = new double[10];
        int index = 0;

        //store number until zero or negative
        while(true){
            if(index > 9)
                break;

            System.out.print("Enter a number: ");
            arr[index] = sc.nextInt();

            if(arr[index] <= 0)
                break;

            index++;  // it counts the number of maximum index that the input reaches
        }

        //printing output
        int i = 0;
	int total = 0;
        while(i < index){
	    total += arr[i];
            System.out.println(arr[i]);
            i++;
        }

	System.out.println("Total sum : " + total);	

        sc.close();
    }
}
