//create a class PrintMultiplicationTable to find the multiplication table of a number from 6 to 9
import java.util.Scanner;
class PrintMultiplicationTable{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //creating a variable to store user input and an array
	System.out.print(" Enter a number:");
        int number = sc.nextInt();
        int[] resultArray = new int[4];

        //using for loop to store multiplication result from 6 to 9
        int index = 0;
        for(int i = 6; i <= 9; i++){
            resultArray[index] = number * i;
            index++;
        }

        //displaying the result
        index = 0;
        for(int i = 6; i <= 9; i++){
            System.out.println(number + " * " + i + " = " + resultArray[index]);
            index++;
        }

        sc.close();
    }
}
