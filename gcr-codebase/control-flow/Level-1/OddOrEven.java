// create a class
import java.util.Scanner;
class OddOrEven{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //creating a variable and taking user's input
    int input = sc.nextInt();

    //printing odd or even number
    for (int i=1; i<=input ;i++){
	if( i % 2 == 0)
	    System.out.println(i + " is an even number");
	if( i % 2 == 1)
	    System.out.println(i + " is an odd number");
    }
	
    sc.close();
    }
}