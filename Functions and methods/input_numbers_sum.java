import java.util.*;
public class input_numbers_sum {
    public static int caluculatesum(int a,int b){//formal Parameter
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b=sc.nextInt();
        System.out.print("Sum : "+caluculatesum(a,b));//arguments or actual Parameters
        
        
    }
}
