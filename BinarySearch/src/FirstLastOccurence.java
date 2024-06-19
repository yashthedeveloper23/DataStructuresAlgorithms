import java.util.Arrays;

public class FirstLastOccurence {
    public static void main(String[] args) {

        int[] array = {5, 7, 7, 7, 7, 8, 8, 10};

        int target = 7;

        int[] asnwer = firstLast(array, target);

        System.out.println(Arrays.toString(asnwer));



    }

    static int[] firstLast(int[] arr, int target) {

        int[] ans = {-1, -1};

        ans[0] = search(arr, target, true);

        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = arr.length-1;

        while(end >= start) {
            int mid = start + (end-start)/2;

            if (arr[mid] > target) {
                end = mid-1;
            }else if (arr[mid] < target) {
                start = mid+1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;

    }




}
