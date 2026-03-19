import java.util.*;
public class Factorial_n {
    public static int factorial(int n){
        int pro=1;
        for(int i=1;i<=n;i++){
             pro=pro*i;
            }
            return pro;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.println("Factorial n : "+factorial(n));
        
    }
    
}
