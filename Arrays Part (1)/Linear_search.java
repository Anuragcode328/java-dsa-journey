public class Linear_search{
    public static int linear_search(int numbers[],int key){
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==key){
                    return i;
                }
            }
            return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,5,8,9,74,13,52,46,86,28,211};
        int key=96;
        int index=linear_search(numbers,key);
        if(index==-1){
            System.out.print("Not Found ");
        }
        else{
            System.out.println("Key is at Index "+index);
        }

    }
}
