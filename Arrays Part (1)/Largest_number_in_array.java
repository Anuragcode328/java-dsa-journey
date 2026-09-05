import java.util.*;
public class Largest_number_in_array {
    public static int largest(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
             if(largest<=arr[i]){
                largest=arr[i];
             }
        }
        return largest;
    }
public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   int arr[]=new int[10];
   for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
   }
   int a=largest(arr);
   System.out.println("Largest Number in this array : "+a);
}
    
}
