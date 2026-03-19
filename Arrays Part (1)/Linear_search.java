import java.util.*;
public class Linear_search {
    public static int linear_search(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if(key==numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
         int numbers[]={56,78,10,20,85};
         int key=20;
         int index=linear_search(numbers,key);
         if(index==-1){
            System.out.println("Not Found");
         }
         else{
            System.out.println("Index of this number is : "+index);
         }
    }
    
}
