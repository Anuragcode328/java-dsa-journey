import java.util.*;
public class Decimal_binary {
    public static int Decimal_binary(int dec){
        int bin=0;
        int rem;
        int pow =1; //first multiply by 1 then 10 then 100 and so on
        while(dec>0){
            rem=dec%2;
            dec=dec/2;
            bin=bin+rem*pow;
            pow=pow*10;
            
        }
        return bin;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int dec=sc.nextInt();
        System.out.println("Its Binary number is : "+Decimal_binary(dec));

        
    }
    
}
