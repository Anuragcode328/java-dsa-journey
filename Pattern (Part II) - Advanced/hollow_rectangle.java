import java.util.*;
public class hollow_rectangle{
    public static void main(String args[]){
        //**** 
        //*  * 
        //*  * 
        //**** 

         Scanner sc=new Scanner(System.in);
         System.out.print("Enter Number of rows : ");
         int a=sc.nextInt();
         System.out.print("Enter Number Of Columns : ");
         int b=sc.nextInt();
        //  for(int i=1;i<=a;i++){
        //     for(int j=1;j<=b;j++){
        //         if(i==1){
        //             System.out.print("*");
        //         }
        //         else if(i==a){
        //             System.out.print("*");
        //         }
        //         else if(j==1 || j==b){
        //             System.out.print("*");
        //         } 
        //         else if(j!=1 || j!=b){
        //             System.out.print(" ");
        //         }
        //         }
        //         System.out.print("\n");
        //     }
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
         }
    }
