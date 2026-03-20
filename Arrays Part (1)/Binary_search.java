// Here we Doing for Increasing data
import java.util.*;
public class Binary_search {
    public static int binary_search(int numbers[],int key){
             int start=0,end=numbers.length-1;
             while(start<=end){
                int mid=(start+end)/2;
                //Comparision
                if(key==numbers[mid]){
                    return mid;
                }
                else if(key>numbers[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
             }
            return -1;
    }
    
    public static void main(String args[]){
         // Binary search Always applied on sorted arrays - Increasing or Decreasing 
         Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter the entries in accesing order : ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
         System.out.print("Enter key: ");
         int key = sc.nextInt();
         int a=binary_search(arr,key);
         if(a==-1){
              System.out.println("Your key is not exist in your data");
         }
         else{
            System.out.println("Your key index is : "+a);
         }

    }
    
}
