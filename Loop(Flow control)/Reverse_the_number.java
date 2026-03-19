import java.util.*;
public class Reverse_the_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt(); 
        int num=0;
        while(n!=0){
            num=num*10+n%10;
            n=n/10;
         
        } 
        System.out.println(num);
    }
    
}
