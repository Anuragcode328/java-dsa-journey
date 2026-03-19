import java.util.*;
public class Prime_composite {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                count=1;   
            }
            else{
                continue;
            }
        }
        if(count==1){
            System.out.println("Composite Number");
        }
        else{
            System.out.println("Prime Number");
        }

        
    }
    
}
