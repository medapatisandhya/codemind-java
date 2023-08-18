import java.util.Scanner;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int c=0;
            for(int i=l;i<=r;i++)
            {
                int rr=i%10;
                if(rr==2||rr==3||rr==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}