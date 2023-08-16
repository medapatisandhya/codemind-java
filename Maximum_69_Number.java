import java.util.Scanner;
public class Equal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,r,f,s,t,l;
        n=sc.nextInt();
        l=n%10;
        n=n/10;
        t=n%10;
        n=n/10;
        s=n%10;
        n=n/10;
        f=n%10;
        n=n/10;
        if(f==6)
        {
            f=9;
        }
        else if(s==6)
        {
            s=9;
        }
        else if(t==6)
        {
            t=9;
        }
        else if(l==6)
        {
            l=9;
        }
        System.out.print(f);
        System.out.print(s);
        System.out.print(t);
        System.out.print(l);
    }
}