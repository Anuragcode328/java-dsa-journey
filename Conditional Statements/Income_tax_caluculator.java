import java.util.*;
public class Income_tax_caluculator {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Monthly Salary : ");
        int income= sc.nextInt();
        int tax;
        if(income<=500000){
            System.out.println("Your Inhand salary is : "+income);
        }
        else if(income>500000 && income<=1000000){
            income =income-((income*20)/100);
            System.out.println("your Inhand Salary is : "+income);
        }
        else{
            income =income- ((income*30)/100);
            System.out.println("Your Inhand Salary is : "+income);
        }

    }
    
}
