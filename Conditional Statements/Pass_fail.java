import java.util.*;
public class Pass_fail {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter marks : ");
        int number=sc.nextInt();
        String type=number>=33?"Pass":"fail";
        System.out.println(type);

    }
    
}
