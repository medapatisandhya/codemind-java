import java.util.Scanner;
public class A{
    public static int pal(int x){
        int s=0,t=x;
        while(x!=0){
            int r=x%10;
            s=s*10+r;
            x=x/10;
        }
        if(t==s) return 1;
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        for(int i=n;i<=x;i++){
            if(pal(i)==1){
                System.out.printf("%d ",i);
            }
        }
    }
}