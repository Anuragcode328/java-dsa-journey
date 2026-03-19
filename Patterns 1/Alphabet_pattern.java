import java.util.*;
public class Alphabet_pattern {
    public static void main(String[] args) {
        //A
        //AB
        //ABC
        //ABCD
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the Size : ");
         int n=sc.nextInt();
        
         for(int i=1;i<=n;i++){
             char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
         }        
    }
    
}
