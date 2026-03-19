import java.util.*;
public class sum_n_natural_numbers {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int i=1;int sum=0;
         System.out.print("Enter The Number : ");
         int n=sc.nextInt(); 
         while(i!=n+1){
            sum=sum+i;
            i++;
         }    
         System.out.println(sum);   
    }
    
}
