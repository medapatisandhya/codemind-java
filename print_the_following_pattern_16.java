import java.util.Scanner;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++){
                System.out.printf("%d ",i);
            }
            System.out.printf("
");
        }
        
    }
}