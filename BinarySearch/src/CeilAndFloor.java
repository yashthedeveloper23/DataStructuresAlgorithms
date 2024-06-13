public class CeilAndFloor {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 5;

        int ans1 = ceil(arr, target);
        int ans2 = floor(arr, target);

        System.out.println(ans1);
        System.out.println(ans2);

    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(end >= start) {
            int mid = start + (end-start)/2;

            if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }

        return start;
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(end >= start) {
            int mid = start + (end-start)/2;

            if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }

        return end;
    }

}
