import java.util.*;
public class prime_number_modified {
    public static boolean isPrime(int n){
        boolean a=true;
        // if(n==1){
        //     return false;
        // }
        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0){
        //         a=false;
        //         break;
        //     }
        // }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                a=false;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();
        System.out.println("Is this number is prime or not : "+isPrime(n));         
    }
    
}
