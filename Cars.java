import java.util.Scanner;
public class Bill
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2,x,m;
        n1=sc.nextInt();
        n2=sc.nextInt();
        x=sc.nextInt();
        m=((x+n1)/n2)+1;
        if(n2<n1)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(m);
        }
        
    }
}
