public class BinarySearch {
    public static void main(String[] args) {

//        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] array = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int target = 3;

        int answer = binary(array, target);

        System.out.println(answer);
        System.out.println(array.length);

    }

    static int binary(int[] arr, int target) {
        //return the middle element
        // return -1 if not found in the array

        int start = 0;
        int end = arr.length-1;

        while(end>=start) {

            int mid = (end + start)/2;

            if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
