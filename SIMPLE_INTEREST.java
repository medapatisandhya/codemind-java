import java.util.Scanner;
public class Cf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p,r,t,s;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        s=(p*r*t)/100;
        System.out.println(s);
    }
}