//create a class SaveOddAndEvenNumbers to save odd and even numbers into arrays
import java.util.Scanner;
class SaveOddAndEvenNumbers{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //getting number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //checking for natural number
        if(number <= 0){
            System.out.println("Error: not a natural number");
            sc.close();
            return;
        }

        //creating odd and even arrays
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        //creating index variables
        int oddIndex = 0;
        int evenIndex = 0;

        //saving odd and even numbers into arrays
        for(int i = 1; i <= number; i++){
            if(i % 2 == 0){
                even[evenIndex] = i;
                evenIndex++;
            }else{
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        //printing odd numbers array
        System.out.println("Odd numbers:");
        for(int index = 0; index < oddIndex; index++){
            System.out.println(odd[index]);
        }

        //printing even numbers array
        System.out.println("Even numbers:");
        for(int index = 0; index < evenIndex; index++){
            System.out.println(even[index]);
        }

        sc.close();
    }
}
