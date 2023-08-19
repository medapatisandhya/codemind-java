import java.util.Scanner;
public class A{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int m=0;
        for(int i=0;i<l;i++){
            if(arr[i]==s)
            {
                m=1;
            }
        }
        if(m==1)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}