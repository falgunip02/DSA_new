import java.util.Arrays;

public class DutchNationalFlag {
    public static int[] sortColors(int[] nums) {
//        brute force : simple sorting algorithm =>
//        time and space complexity: O(n^2) , O(1)


//        for(int i = 0; i<nums.length;i++){
//            for(int j = i+1; j<nums.length;j++){
//                if(nums[i]>nums[j]){
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//
//            }
//        }


//      better approach:

//        int count_0 = 0, count_1 = 0, count_2 = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0)
//                count_0++;
//            else if (nums[i] == 1) {
//                count_1++;
//            } else count_2++;
//        }
//
//        int index = 0;
//        for (int i = 0; i < count_0; i++) {
//            nums[index++] = 0;
//        }
//        for (int i = 0; i < count_1; i++) {
//            nums[index++] = 1;
//        }
//        for (int i = 0; i < count_2; i++) {
//            nums[index++] = 2;
//        }


        int n = nums.length;
        int low=0 , mid=0, high = n-1;
        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }


        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,0,1,2};
        System.out.println(Arrays.toString(sortColors(arr)));
    }
}
