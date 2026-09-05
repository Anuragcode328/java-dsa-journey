public class brute_force {
    public static void brute(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.print("That key is at position : ("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String[] args){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        brute(matrix,13);
    }
}
