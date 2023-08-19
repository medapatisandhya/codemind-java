import java.util.Scanner;
public class A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr = new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        double s=0;
        for(int i=0;i<l;i++){
            s+=arr[i];
        }
        double av=s/l;
        System.out.printf("%.2f",av);
    }
}