import java.util.Arrays;

public class SelectinoSort {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        selection(arr);

        System.out.println(Arrays.toString(arr));



    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length i++) {

            int last = arr.length-i;

            int getMaxInt = getMaxIndex(arr, 0, last);



        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {

        int max = start;

        for (int i = start; i < end; i++) {

            if (arr[max] < arr[i]) {
                max = i;
            }

        }

        return max;


    }
}
