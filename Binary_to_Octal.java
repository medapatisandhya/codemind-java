import java.util.Scanner;
public class Some
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
        for(int i=1;i<=c;i++){
            String s = sc.next();
            int m =Integer.parseInt(s,2);
            String d = Integer.toString(m,8);
            System.out.println(d);
        }
    }
}