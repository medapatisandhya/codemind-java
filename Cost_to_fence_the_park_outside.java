import java.util.Scanner;
public class Odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l,b,w,c,t;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        t=c*((l+2*w)*(b+2*w)-(l*b));
        System.out.println(t);
    }
}