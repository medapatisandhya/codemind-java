import java.util.Scanner;
public class Rank
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,v=0,k=1,i,j=0,r;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            r=v+k;
            v=k;
            k=r;
            if(r==n)
            {
                j++;
            }
        }
        if(j!=0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}