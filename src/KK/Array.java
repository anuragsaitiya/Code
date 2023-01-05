package KK;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int[] arr = new int[l];
        Input(arr);
        print(arr);
    }
    public static void Input(int[] arr) {
        Scanner s = new Scanner(System.in);
            for(int z=0 ; z<arr.length ; z++){
                arr[z] = s.nextInt();
            }
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
