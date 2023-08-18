import java.util.Scanner;
public class Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,a=0,b=1,c=0;
        n=sc.nextInt();
        System.out.printf("%d ",a);
        for(i=1;i<n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.printf("%d ",c);
        }
    }
}