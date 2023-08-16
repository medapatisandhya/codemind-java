import java.util.Scanner;
public class Equal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,s=0,sn,r;
        n=sc.nextInt();
        sn=n*n;
        m=sn;
        while(m!=0)
        {
            r=m%10;
            s=s+r;
            m=m/10;
            
        }
        if(n==s)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}