public class MountainArray {
    public static void main(String[] args) {



    }

    static int peakElement(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(end > start) {

            int mid = start + (end-start)/2;

            if (arr[mid] > arr[mid+1]) {
                //you are in the decending part of the array
                end = mid;
            } else {
                start = mid+1;
            }


        }
        return start;
    }
}
