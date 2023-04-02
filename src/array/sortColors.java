package array;

public class sortColors {
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
        sort(array);
    }

    public static void sort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
