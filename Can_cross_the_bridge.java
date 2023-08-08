import java.util.Scanner;
public class Bridge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        a=(z-y)/x;
        System.out.println(a);
    }
}