import java.util.*;
public class Subarrays {
    public static void subarray(){
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int a=cs.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=cs.nextInt();
        }
        System.out.println();
        System.out.println("Subarray Pairs are : ");
        for(int i=0;i<a;i++){
            int start=i;
            for(int j=i;j<a;j++){
                int end=j;
                 System.out.print("[ ");
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                 System.out.println("]");
                
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        subarray();
    }
    
}
