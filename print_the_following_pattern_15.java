import java.util.Scanner;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++){
                System.out.printf("%c ",(char)(64+i));
            }
            System.out.printf("
");
        }
        
    }
}