import java.util.Scanner;
public class Capacity
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t,s,b,c;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        c=2*s*t*b*512;
        System.out.println(c);
    }
}