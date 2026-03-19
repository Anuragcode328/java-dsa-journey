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
       int arr[]={5,6,9,12,20,15,4,25,18,3,14};
       int largest=largest(arr);
       System.out.println("Largest number in this array : "+largest);

    }
    
}
