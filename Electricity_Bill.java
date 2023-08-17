import java.util.Scanner;
public class Bill
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String id,u;
        id=sc.nextLine();
        u=sc.nextLine();
        int n;
        n=sc.nextInt();
        double b,tb,s;
        if(n<=199)
        {
            b=n*1.2;
        }
        else if(n>=200 && n<400)
        {
            b=n*1.5;
        }
        else if(n>=400 && n<600)
        {
            b=n*1.8;
        }
        else
        {
            b=n*2.0;
        }
        if(b>400)
        {
            s=0.15*b;
        }
        else
        {
            s=100;
        }
        tb=b+s;
        System.out.printf("%.2f",tb);
        
    }
}
