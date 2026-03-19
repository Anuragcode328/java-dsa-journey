import java.util.*;
public class Simple_number_triangle {
    public static void main(String[] args) {
       //1
       //12
       //123
       //1234
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter The Size : ");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.print("\n");
       }
    }
    
}
