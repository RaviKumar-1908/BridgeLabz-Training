//create a class FizzBuzz to save numbers or FizzBuzz values import java.util.Scanner;
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
