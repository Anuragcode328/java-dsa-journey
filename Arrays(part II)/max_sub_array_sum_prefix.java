import java.util.*;
public class max_sub_array_sum_prefix {
    public static void max_sub_arr_sum_prefix(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of elements : ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<a;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }  
         int sum=0;
        for(int i=0;i<a;i++){
            int start=i;
            for(int j=i;j<a;j++){
                int end=j;
             
              
                     sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
              
                if(max<=sum){
                    max=sum;
                }
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        max_sub_arr_sum_prefix();
    }
    
}
