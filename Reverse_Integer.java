import java.util.Scanner;
public class Reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,r,sum=0;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.printf("%d",sum);
    }
}