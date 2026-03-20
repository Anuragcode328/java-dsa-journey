import java.util.*;
public class Pairs_in_array{
    public static void print_pair() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of distinct elements for pairing :");
        int a=sc.nextInt();
        int arr[]=new int[a];
        int tp=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Pairs are : ");
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+tp);
        //if numer of element in array is n then total number of pairs are : (n*(n-1))/2


    }
    public static void main(String args[]){
      print_pair();
    }
}