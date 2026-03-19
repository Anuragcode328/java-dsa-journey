import java.util.*;
public class Caluculator {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second number : ");
        int b=sc.nextInt();
        System.out.print("Enter Character : ");
        String type=sc.next();
        switch(type){
            case "+": System.out.println("Addition : "+(a+b));
            break;
            case "-": System.out.println("Subtraction : "+(a-b));
             break;
            case "*": System.out.println("Multiplication : "+(a*b));
             break;
            case "/": System.out.println("Division : "+(a/b));
             break;
            default: System.out.println("Invalid symbol");
             break;
        }





    }
    
}
