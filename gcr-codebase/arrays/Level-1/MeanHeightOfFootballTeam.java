//create a class MeanHeightOfFootballTeam to find the mean height of players in a football team
import java.util.Scanner;
class MeanHeightOfFootballTeam{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //creating a double array to store height of players
        double[] heights = new double[11];
        double sum = 0;

        //taking input height from user
        for(int index = 0; index < 11; index++){
	    System.out.print("Enter the " + (index + 1) +" st player height: ");
            heights[index] = sc.nextDouble();
            sum = sum + heights[index];
        }

        //calcultaing and printing mean height
        double mean = sum / 11;
        System.out.println("Mean height: " + mean);

        sc.close();
    }
}
