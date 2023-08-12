import java.util.Scanner;
public class Dog
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=1,c,i;
        n=sc.nextInt();
        System.out.printf("%d %d ",a,b);
        for(i=1;i<n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.printf("%d ",c);
            
        }
    }
}