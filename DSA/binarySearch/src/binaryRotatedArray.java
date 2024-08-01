public class binaryRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 1;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0, nums.length-1);
        }
// pivot found , found two asc arrays in one arr
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>end && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(mid > start && arr[start]>= arr[mid] ){
                end = mid - 1 ;
            }
            else {
                start = mid +1;
            }
        }
        return  -1;

    }
}
