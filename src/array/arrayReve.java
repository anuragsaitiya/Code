package KK;

public class arrayReve {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14,16,18,20};
        rev(array);
    }
    public static void rev(int[] array){
        int length = array.length;
        int temp = 0;
        int x= 1;
        for(int i = 0; i < length/2 ; i++){
            temp = array[i];
            array[i] = array[length-x];
            array[length-x] = temp;
            x++;

        }
        for(int i = 0; i < length ; i++){
            System.out.println(array[i]);
        }
    }
}
