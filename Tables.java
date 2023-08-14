import java.util.Scanner;
public class Table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,m,n;
        b=sc.nextInt();
        n=sc.nextInt();
        for(a=1;a<=n;a++)
        {
            if(a%2==1)
            {
                m=b*a;
                System.out.printf("%d x %d = %d
",b,a,m);
            }
        }
    }
}