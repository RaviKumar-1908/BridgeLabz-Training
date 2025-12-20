//create a class YoungestAndTallestFriend
import java.util.Scanner;
class YoungestAndTallestFriend{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //creating arrays for age and height
        int[] age = new int[3];
        double[] height = new double[3];
        String[] name = {"Amar", "Akbar", "Anthony"};

        //taking user's input
        for(int index = 0; index < 3; index++){
            System.out.print("Enter age of " + name[index] + ": ");
            age[index] = sc.nextInt();
            System.out.print("Enter height of " + name[index] + ": ");
            height[index] = sc.nextDouble();
        }

        //finding youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for(int index = 1; index < 3; index++){
            if(age[index] < age[youngestIndex])
                youngestIndex = index;

            if(height[index] > height[tallestIndex])
                tallestIndex = index;
        }


	//displaying the output
        System.out.println("Youngest: " + name[youngestIndex]);
        System.out.println("Tallest: " + name[tallestIndex]);

        sc.close();
    }
}
