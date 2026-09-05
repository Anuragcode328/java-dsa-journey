import java.util.*;
public class max_sub_array_sum{
    public static void max_sub_arr_sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of elements : ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a;i++){
            int start=i;
            for(int j=i;j<a;j++){
                int end=j;
                   int sum=0;
                for(int k=start;k<=end;k++){
                    sum=sum+arr[k];
                }
                if(sum>=max){
                  max=sum;
                }
               }
        }
        System.out.println("maximum sum of subarray : "+max);

    }
    public static void main(String args[]){
      max_sub_arr_sum();
    }
}