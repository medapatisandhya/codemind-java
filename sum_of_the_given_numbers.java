import java.util.Scanner;
public class Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x+y);
        }
    }
}