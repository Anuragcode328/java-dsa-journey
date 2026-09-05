package Sorting;

public class counting_sort {
    public static void sort(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
          }
          int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
    while(count[i]>0){
        System.out.print(i+" ");
        count[i]--;
    }
}
    }

    public static void main(String[] args){
        int arr[]={1,4,1,3,2,4,3,7};
        sort(arr);
       
    }
    
}
