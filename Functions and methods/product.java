import java.util.*;
public class product {
    public static int multiply(){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a : ");
       int a =sc.nextInt();
       System.out.print("Enter b : ");
       int b=sc.nextInt();
       return a*b;
       }
       public static void main(String[] args) {
        System.out.print("Product of a and b : "+multiply());
        
    }
    
}
