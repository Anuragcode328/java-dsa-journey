import java.util.*;
public class Floyd_triangle{
    public static void main(String[] args) {
        //1
        //23
        //456
        //78910
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.print("\n");
        }
    }
}
