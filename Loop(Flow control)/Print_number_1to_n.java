import java.util.*;
public class Print_number_1to_n {
    public static void main(String[] args) {
        
    int i=1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n=sc.nextInt();
    while(i!=n+1){
        System.out.println(i);
        i++;
    }
    }
}
