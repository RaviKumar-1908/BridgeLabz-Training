//creating a calculateSmallestLargest to find the smallest and largest among 3 numbers
import java.util.Scanner;
class SmallestLargest {
	
    //finding largest and smallest number
    public static int[] findSmallestAndLargest(int first, int second, int third){
	int arr[] = new int[2];
	if ( first > second && first > third ){
	     arr[0] = first; 
	    if ( second > third )
		arr[1] = third;
		else 
		arr[1] = second;
	} else if ( second > first && second > third ){
	    arr[0] = second;
	    if ( first > third )
		arr[1] = third;
		else 
		arr[1] =  first;
	} else if ( third > second && third > first){
	    arr[0] = third;
	    if ( second > first )
		arr[1]= first;
		else 
		  arr[1] = second;
	}
	return arr;
    }

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	    
	//creating variable and taking user's input
	System.out.print("Enter First number :" );
	int first = sc.nextInt();
	System.out.print("Enter second number :" );
	int second = sc.nextInt();
	System.out.print("Enter third number :" );
	int third= sc.nextInt();
	
	//calling methods to get maximum handshakes
	int [] arr = findSmallestAndLargest( first, second, third);
	System.out.println("Largest :" + arr[0]);
	System.out.println("Smallest :" + arr[1]);

		
		
	  sc.close();  
    }
}