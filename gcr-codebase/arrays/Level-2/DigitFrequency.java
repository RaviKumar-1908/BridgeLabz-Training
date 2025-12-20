//create a class DigitFrequency to find frequency of each digit in a number
import java.util.Scanner;
class DigitFrequency{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //taking number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int count = 0;

        //finding count of digit
        while(originalNumber != 0){
            count++;
            originalNumber = originalNumber / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        //finding digits and saving in array
        while(number != 0){
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        //creating frequency array
        int[] frequency = new int[10];

        //finding frequency of each digit
        for(int i = 0; i < count; i++){
            frequency[digits[i]]++;
        }

        //displaying frequency of each digit
        for(int i = 0; i < 10; i++){
            if(frequency[i] > 0)
                System.out.println(i + " : " + frequency[i]);
        }

        sc.close();
    }
}
