import java.util.Scanner;
public class A{
    public static int collatz(int x){
        int c=0;
        while(x!=1){
            if(x%2==0){
                x=x/2;
            }
            else{
                x=3*x+1;
            }
            c++;
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int m=0,num=0,t=0;
        for(int i=n1;i<=n2;i++){
            t=collatz(i);
            if(t>m){
                m=t;
                num=i;
            }
        }
        System.out.println(num);
    }
}