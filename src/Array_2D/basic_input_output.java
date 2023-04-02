package Array_2D;
import java.util.Scanner;
public class basic_input_output {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row ");
        int row = s.nextInt();
        System.out.println("Enter col");
        int col = s.nextInt();

        int[][] array = new int[row][col];
        int rlength =array.length;
        int clength = array[0].length;

        System.out.println("Now enter elements");
        for(int r = 0 ; r < rlength; r++){
            for (int c = 0; c < clength ;  c++){
                array[r][c] = s.nextInt();
            }
        }

        for(int r = 0 ; r < rlength; r++){
            for (int c = 0; c < clength ;  c++){
                System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }


    }
}
