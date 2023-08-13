import java.util.Scanner;
public class Large
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,max=0,r,q;
        n=sc.nextInt();
        q=n;
        while(q!=0)
        {
            r=q%10;
            if(r>max)
            {
                max=r;
            }
            q=q/10;
        }
        System.out.printf("%d",max);
    }
}