import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSorting {
    public static void main(String[] args) {

        int[] array = {23, 14, 54, 63, 13, 63, 84, 123};

        bubble(array);
        System.out.println(Arrays.toString(array));



    }

    static void bubble(int[] arr) {

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {

            swapped = false;

            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]){
                    swappingFunc(arr, j, j-1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

        }
    }

    static void swappingFunc(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
