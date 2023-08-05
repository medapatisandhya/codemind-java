import java.util.Scanner;
public class operation {
    public static void main(String args[ ])
           {
            Scanner sc = new Scanner(System.in);
            int num1,num2;
            num1=sc.nextInt();
            num2=sc.nextInt();
            float num3=(float)(num1+num2)/2;
            System.out.format("%.4f",num3);
           }
    
}
