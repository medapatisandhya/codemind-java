import java.util.Scanner;
public class Inches
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int cen;
        cen=sc.nextInt();
        double inches;
        inches=2.54*cen;
        System.out.printf("%.2f",inches);
    }
}