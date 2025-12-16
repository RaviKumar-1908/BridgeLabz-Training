import java.util.*;
class CelToFahr
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double cel = sc.nextDouble();
    double fahr  = (cel * (9.0/5.0)+32);
    System.out.println(fahr);
    }
}