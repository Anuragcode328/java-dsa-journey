import java.util.*;
public class Inverted_half_pyramid_with_numbers{
    public static void main(String[] args) {
        //12345
        //1234
        //123
        //12
        //1
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
