import java.util.*;
public class Binomial_cofficient {
    public static int Binomial(int n,int r){
        int a=1;
        int b=1;
        int c=1;
        for(int i=1;i<=n;i++){
            a=a*i;
        }
        for(int i=1;i<=r;i++){
            b=b*i;
        }
        for(int i=1;i<=n-r;i++){
            c=c*i;
        }
        return a/(b*c);
    }
    public static void main(String[] args) {
        //ncr
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.print("Enter r : ");
        int r=sc.nextInt();
        System.out.println("Value of Binomial Cofficient : "+Binomial(n,r));
        
    }
    
}
