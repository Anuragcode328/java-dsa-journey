import java.util.*;
public class Reverse_an_array {
    public static int[] reverse(int arr[]){
            int a[]=new int[arr.length];
            for(int i=0;i<arr.length;i++){
                 a[i]=arr[arr.length-1-i]; 
            }
           return a;
        }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        
        System.out.print("Enter the numbers one by one : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }      
        int b[]= reverse(arr);  
        System.out.print("Reverse list of these numbers is : ");
        for(int i=0;i<b.length;i++){
               System.out.print(" "+b[i]);
        }
        

    }

    
}
