package KK;
import java.util.Scanner;
//  some basic operations on arrays
public class Array {

//    this is main function
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please Insert Array length");
        int l = s.nextInt();
        int[] arr = new int[l];
        Input(arr);
        linearSearch(arr);

    }
//    function for taking input
    public static void Input(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Elements");
            for(int z=0 ; z<arr.length ; z++){
                arr[z] = s.nextInt();
            }
    }
//    function for print array
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

//    function for search an element in array
    public static void linearSearch(int[] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element");
        int e = s.nextInt();
        for (int j : arr) {
            if (j == e) {
                System.out.println("element found at" + " " + j + "th"+ " "+"index");
                return;
            }
        }
        System.out.println("element not found");
    }
}
