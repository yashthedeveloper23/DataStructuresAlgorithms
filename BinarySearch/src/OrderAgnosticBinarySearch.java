public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] ascendingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] descendingArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int target = 8;

        int ans1 = orderAgnostic(ascendingArray, target);
        int ans2 = orderAgnostic(descendingArray, target);

        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(end >= start) {

            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }

        }

        return -1;

    }
}
