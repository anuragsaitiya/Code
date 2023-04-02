package Array_2D;

public class Search_2D_Matrix {
    public static void main(String[] args){
     int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12} };
     int target = 92;
     boolean ans = searchMatrix(matrix,target);
        System.out.println(ans);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix[0].length;
        int c = matrix.length;

        for(int row = 0 ; row < c ; row++ ){
            for (int col =0 ; col < r; col++){
             if(target == matrix[row][col]){
                 return true;
             }
            }
        }
        return false;
    }
}
