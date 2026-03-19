import java.util.*;
public class Ternary_operator {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number=sc.nextInt();
        String type=number%2==0?"even number":"Odd Number";
        System.out.println(type);

    }
    
}
