//create a class Copy2DArrayTo1DArray to copy 2D array into 1D array
import java.util.Scanner;
class Copy2DArrayTo1DArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //taking input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        //create 2D array
        int[][] matrix = new int[rows][columns];
//create a class FizzBuzz to save numbers or FizzBuzz values in an array
import java.util.Scanner;
class FizzBuzz{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //taking number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //checking for positive integer
        if(number <= 0){
            System.out.println("Error: not a positive number");
            sc.close();
            return;
        }

        //creating string array to store result
        String[] result = new String[number + 1];

        //saving values in array
        for(int i = 0; i <= number; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result[i] = "FizzBuzz";
            }else if(i % 3 == 0){
                result[i] = "Fizz";
            }else if(i % 5 == 0){
                result[i] = "Buzz";
            }else{
                result[i] = String.valueOf(i);
            }
        }

        //printing array result with position
        for(int index = 0; index <= number; index++){
            System.out.println("Position " + index + " = " + result[index]);
        }

        sc.close();
    }
}

        //taking input values for 2D array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //creating array to store copied elements
        int[] array = new int[rows * columns];
        int index = 0;

        //copying elements from 2D array to 1D array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[index] = matrix[row][col];
                index++;
            }
        }

        //printing 1D array elements
        System.out.println("1D array elements:");
        for(int i = 0; i < index; i++){
            System.out.println(array[i]);
        }

        sc.close();
    }
}
