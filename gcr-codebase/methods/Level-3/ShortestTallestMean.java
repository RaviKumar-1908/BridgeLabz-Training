// Creating a class to find shortest tallest and mean height of player present in a football team
	
import java.util.Scanner;
class ShortestTallestMean{

    // Creating a function which returns the sum All the heights present in the array
    public static int calculatingSumOfHeights(int [] arr){
	int sum = 0;
	for( int i=0; i < arr.length; i++)
	    sum+=arr[i];
	return sum;
    }

    // Creating the function to To find the smallest height among all 11 players
    public static int calculatingSmallest(int [] arr){
	int smallest = arr[0];
	for( int i=0; i < arr.length; i++)
	    if (arr[i] < smallest)
	        smallest = arr[i];
	return smallest;
    }

    // Creating the function to To find the tallest height among all 11 players
    public static int calculateTallest(int [] arr){
	int tallest = arr[0];
	for( int i=0; i < arr.length; i++)
	    if (arr[i] > tallest)
	        tallest = arr[i];
	return tallest;
    }
	
	
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int heights[] = new int[11];
	
	for(int i=0; i<11;i++){
	    System.out.print("Enter height (in cms) from 150 to 250 :" );
	    int height = sc.nextInt();
	    if ( height > 150 && height < 250)
		heights[i] = height;
	    else{
		    System.out.println("Enter a valid number:");
		    i--;
		}
	}
	
	//calling the function to get the sum of all the heights
	int sum = calculatingSumOfHeights(heights);
	System.out.println("The sum of all the heights are :" + sum);

	System.out.println("The mean of all the heights are :" + sum/11);
	
	// Calling the function to get the smallest of all heights
	int smallest = calculatingSmallest(heights);
	System.out.println("The smallest of all the heights are :" + smallest);
	
	// Calling the function to get the Tallest of all heights
	int tallest = calculateTallest(heights);
	System.out.println("The tallest of all the heights are :" + tallest);
	sc.close();
    }
	
}