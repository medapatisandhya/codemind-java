import java.util.Scanner;
public class A
{
    public static int prime(int x)
    {
        int c=0;
        if(x==1){
            return -1;
        }
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                return -1;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int m=0;
        for(int i=n1;i<=n2;i++)
        {
            if(prime(i)==1)
            {
                m++;
            }
        }
        System.out.println(m);
    }
}