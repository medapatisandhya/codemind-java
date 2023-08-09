import java.util.Scanner;
public class Octal
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int t;
        t=Integer.parseInt(s,8);
        System.out.println(t);
    }
}