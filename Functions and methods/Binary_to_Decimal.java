import java.util.*;
public class Binary_to_Decimal {
    public static int Binary_decimal(int n){
        int dec=0;
        int pow=0;
        int last_digit;// last digit in binary number
        int i=0;// 2 ki power
        while(n!=0){
            last_digit=n%10;
            dec=dec+last_digit*(int)(Math.pow(2,i));
            n=n/10;
            i++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Binary Number : ");
        int n=sc.nextInt();
        System.out.println(Binary_decimal(n));
        
    }
    
}
