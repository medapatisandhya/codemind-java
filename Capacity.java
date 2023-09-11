import java.util.Scanner;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t,s,b,m;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        m=(2*t*s*b*512)/1024;
        System.out.printf("%d KB",m);
    }
}