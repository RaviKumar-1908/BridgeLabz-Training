import java.util.*;
class SI
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        double pri, rate, time;
        pri = sc.nextDouble();
        rate = sc.nextDouble();        	time = sc.nextDouble();
	double interest = pri*rate*time*0.01;
        System.out.println(interest); 
    }
}