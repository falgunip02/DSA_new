import java.util.Arrays;
public class CommonInTwoArrays {
    public static void main(String[] args) {
        CommonInTwoArrays solution = new CommonInTwoArrays();
        int[] nums1 = {1, 2};
        int[] nums2 = {2, 4};
        System.out.println(solution.getCommon(nums1, nums2)); // Output: 2
    }

    public int getCommon(int[] nums1, int[] nums2) {
            // Sort nums1
            Arrays.sort(nums1);
            int common = -1;
            for (int i = 0; i < nums2.length; i++) {
            if (binarySearch(nums1, nums2[i])) {
                common = nums2[i];
                break;  // If found, no need to continue
            }
        }

        return common;
            }



        private boolean binarySearch(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return true;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return false;
        }

    }



//   another way
//    public int getCommon(int[] nums1, int[] nums2) {
//        Set<Integer> set = new HashSet<>();
//
//        for(int i = 0 ; i<nums1.length;i++){
//            set.add(nums1[i]);
//        }
//
//        for(int j = 0; j<nums2.length;j++){
//            if(set.contains(nums2[j])){
//                return nums2[j];
//            }
//
//        }
//        return -1;
//    }
//}



