package KK;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class peekElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please Insert Array length");
        int l = s.nextInt();
        int[] arr = new int[l];
        Input(arr);
        PeekElement(arr);
    }
    //    function for taking input
    public static void Input(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Elements");
        for(int z=0 ; z<arr.length ; z++){
            arr[z] = s.nextInt();
        }
    }
//    Function for finding peek elements
    public static void PeekElement(int @NotNull [] arr){
        if (arr.length == 1)
            return ;
        for (int i = 0; i < (arr.length-2); i++) {
            if(arr[i] < arr[i+1] && arr[i+2] < arr[i+1]){
                System.out.println(arr[i+1]+" ");
            }
        }
    }
}
