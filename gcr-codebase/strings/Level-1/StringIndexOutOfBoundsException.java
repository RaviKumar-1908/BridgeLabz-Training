import java.util.Scanner;
class StringIndexOutOfBoundsException {
	
    public static void stringIndexOutOfBoundsException( String s){
	int lastIndex = s.length()-1;


    }	
 
    public static void handleStringIndexOutOfBoundsException(String s){
	int lastIndex = s.length()-1;
	
	try{
	   System.out.println(s.charAt(lastIndex + 1));
	}
	catch(Exception e){
	     System.out.println("String Index Out of Bounds Exception :" + e.getMessage());
	}
	
   }
	
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String: ");
	String input = sc.next();		
	
	stringIndexOutOfBoundsException(input);
	handleStringIndexOutOfBoundsException(input);

    sc.close();
    }
}