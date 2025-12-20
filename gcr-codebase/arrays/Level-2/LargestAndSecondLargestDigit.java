//create a class LargestAndSecondLargestDigit to find the largest and second largest number
import java.util.Scanner;
class LargestAndSecondLargestDigit{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
	
	//taking user's inuput
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //storing digits
        while(number != 0 && index < maxDigit){
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        //finding largest and second largest
        for(int i = 0; i < index; i++){
            if(digits[i] > largest){
                secondLargest = largest;
                largest = digits[i];
            }else if(digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }
        }
	//printing output
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        sc.close();
    }
}
