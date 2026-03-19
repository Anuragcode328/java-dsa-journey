import java.util.*;
public class zero_one_triangle_pattern{
    public static void main(String[] args) {
        //1
        //01
        //101
        //0101
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.print("\n");
        }
    }
}
