//import java.util.Arrays;
//
//public class FirstnLastPos {
//    public static void main(String[] args) {
//        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
//        int target = 7;
//        int[] ans = firstlast(arr, target);
//        System.out.println(Arrays.toString(ans));
//    }
//
//    public static int[] firstlast(int[] arr, int target) {
//        int[] result = {-1, -1};
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]==target && result[0]==-1){
//                result[0] = i;
//            }
//        }
//        for(int j = arr.length-1; j>=0;j--){
//            if(arr[j]== target && result[1]==-1){
//                result[1]=j;
//            }
//
//        }
//
//        return result;
//    }
//}


import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
            FirstAndLastPosition solution = new FirstAndLastPosition();
            int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
            int target = 7;
            int[] result = solution.searchRange(nums, target);
            System.out.println(Arrays.toString(result));
        }


    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
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
