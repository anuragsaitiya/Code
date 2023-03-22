package KK;
import java.util.Arrays;
import java.util.Scanner;

public class getMinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please Insert Array length");
        int l = s.nextInt();
        int[] arr = new int[l];
        Input(arr);
        minMax(arr);
    }
    public static void Input(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Elements");
        Arrays.setAll(arr, z -> s.nextInt());
    }
    public static void minMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(arr.length == 1){
            return ;
        }
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Max value is " + max +" "+"Min value is "+min );
    }
}
