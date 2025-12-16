import java.util.*;
class VolOfCyl
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double rad = sc.nextDouble();
    double hei = sc.nextDouble();
    double volume  = 3.1418*rad*rad*hei;
    System.out.println(volume);
    }
}