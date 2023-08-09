import java.util.Scanner;
public class Temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float f,c;
        c=sc.nextFloat();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}