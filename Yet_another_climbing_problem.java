import java.util.Scanner;
public class Steps
{
    public static void main(String args[])
    {
        
        Scanner sc  = new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int x,y,z;
            x=sc.nextInt();
            y=sc.nextInt();
            z=(x%y)+(x/y);
            System.out.println(z);  
        }
    }
}