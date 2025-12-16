import java.util.*;
class PowerCalc
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    int base, expo;
    base = sc.nextInt();
    expo = sc.nextInt();
    System.out.println(Math.pow(base,expo));
    }
}