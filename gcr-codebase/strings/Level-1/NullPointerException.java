import java.util.Scanner;
class NullPointerException {
	//generates an exception
    public static void nullPointerException(){
	String s = null;
	System.out.println(s.length());
    }	
    //handles the null Pointer exception
    public static void handleNullPointerException(){
	try{
	   nullPointerException();
	}
	catch(Exception e){
	     System.out.println("Null pointer Exception :" + e.getMessage());
	}
	
   }
	
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	
	handleNullPointerException();

    sc.close();
    }
}