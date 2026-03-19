import java.util.*;
public class Display_number_byuser_Except_multiple_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
              n=sc.nextInt();
              if(n%10==0){
                continue;
              }
              else{
                System.out.println("number Was : "+n);
              }
            
        }
        
    }
    
}
