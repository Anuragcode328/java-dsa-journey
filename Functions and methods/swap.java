import java.util.*;
public class swap {
    public static void swap(){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a : ");
         int a=sc.nextInt();
         System.out.print("Enter b : ");
         int b=sc.nextInt();
         int temp=a;
         a=b;
         b=temp;
         System.out.println("Swap value of a : "+a);
         System.out.println("Swap Value of b : "+b);
    }
    public static void main(String[] args) {
        swap();
    }
    
}
