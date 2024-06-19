import java.util.Arrays;

public class MyVersionFirstLast {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 7, 7, 8, 9, 90};

        int[] answerArray = lastFirst(arr, 7);

        System.out.println(Arrays.toString(answerArray));

    }

    static int[] lastFirst(int[] arr, int target) {

        int[] answerArray = {-1, -1};

        answerArray[0] = search(arr, target, true);

        if (answerArray[0] != 0) {
            answerArray[1] = search(arr, target, false);

        }
        return answerArray;
    }

    static int search(int[] arr, int target, boolean index) {
        int answer = -2;

        int start = 0;
        int end = arr.length-1;

        while(end>=start) {

            int mid = (end + start)/2;

            if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                answer = mid;

                if (index) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }

        return answer;

    }

}
