//create a class FindFactorsOfNumber to find and store factors of a number
import java.util.Scanner;
class FindFactorsOfNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //taking number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //creating variables for factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        //finding factors of the number
        for(int i = 1; i <= number; i++){
            if(number % i == 0){

                //checking if array is full
                if(index == maxFactor){
                    maxFactor = maxFactor * 2;

                    //creating temp array to store  elements
                    int[] temp = new int[maxFactor];
                    for(int j = 0; j < index; j++){
                        temp[j] = factors[j];
                    }

                    //assigning temp array to factors array
                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }

        //displaying the output
        System.out.println("Factors of " + number + ":");
        for(int i = 0; i < index; i++){
            System.out.println(factors[i]);
        }

        sc.close();
    }
}
