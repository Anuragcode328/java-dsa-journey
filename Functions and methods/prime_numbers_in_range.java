import java.util.*;
public class prime_numbers_in_range {
    public static void Range(int n,int r){
        for(int i=n;i<=r;i++){
            int j;
            for(j=2;j<=i-1;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i && i>1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower number : ");
        int n=sc.nextInt();
        System.out.print("Enter Upper Number : ");
        int r=sc.nextInt();
        System.out.println("Prime numbers between them are : ");
        Range(n,r);    
    }
}
