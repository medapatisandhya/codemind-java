import java.util.Scanner;
public class Cf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double c,f;
        f=sc.nextInt();
        c=((f-32)*5/9);
        System.out.printf("%.2f",c);
    }
}