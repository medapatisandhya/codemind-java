import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        double c;
        c=(n+m)*0.5;
        System.out.printf("Average of %d and %d is: %.2f",n,m,c);
    }
}