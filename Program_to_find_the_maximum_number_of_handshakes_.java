import java.util.Scanner;
public class Maximum
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        a=(n*(n-1))/2;
        System.out.println(a);
    }
}