//creating a class YongestAndTallest to find youngest among 3 friends and also tallest among them
import java.util.Scanner;
class YongestAndTallest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//creating variables and taking user age and height input
	System.out.print("Enter Amar Age: ");
	int amarAge = sc.nextInt();
	System.out.print("Enter Akbar Age: ");
	int akbarAge = sc.nextInt();
	System.out.print("Enter Anthony Age: ");
	int anthonyAge = sc.nextInt();
	System.out.print("Enter Amar Height: ");
	int amarHeight = sc.nextInt();
	System.out.print("Enter Amar Height: ");
	int akbarHeight = sc.nextInt();
	System.out.print("Enter Amar Height: ");
	int anthonyHeight = sc.nextInt();

	// finding youngest using if conditions on age input
	if(amarAge < akbarAge && amarAge < anthonyAge )
	    System.out.println("Yongest Friend is Amar :" + amarAge);
	else if (akbarAge < amarAge && akbarAge < anthonyAge)
	    System.out.println("Yongest Friend is Akbar :" + akbarAge);
	else
	    System.out.println("Yongest Friend is Anthony :" + anthonyAge);

	//finding the tallest using if conditions on height input
	if(amarHeight > akbarHeight && amarHeight > anthonyHeight )
	    System.out.println("Tallest Friend is Amar :" + amarHeight);
	else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
	    System.out.println("Tallest Friend is Akbar :" + akbarHeight);
	else
	    System.out.println("Tallest Friend is Anthony :" + anthonyHeight);
	
	sc.close();
    }
}