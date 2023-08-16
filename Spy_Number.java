import java.util.Scanner;
public class Equal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,r,q,s=0,p=1;
        n=sc.nextInt();
        q=n;
        while(q!=0)
        {
            r=q%10;
            s=s+r;
            p=p*r;
            q=q/10;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}