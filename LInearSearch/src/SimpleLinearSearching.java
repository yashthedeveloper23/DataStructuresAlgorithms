public class SimpleLinearSearching {

    public static void main(String[] args) {
    //linear searching in arrays
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;

        int answer = linear(arr, target);
        System.out.println("The length of array "+ arr.length);
        System.out.println(answer);
    }

    static int linear(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
