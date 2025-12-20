//create a class ReverseNumberUsingArray
import java.util.Scanner;
class ReverseNumberUsingArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
	//taking user's input
	System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int count = 0;

        //total digit count
        while(originalNumber != 0){
            count++;
            originalNumber = originalNumber / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        //storing digits
        while(number != 0){
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        //printing in reverse order
        for(int i = 0; i < count; i++){
            System.out.print(digits[i]);
        }

        sc.close();
    }
}
