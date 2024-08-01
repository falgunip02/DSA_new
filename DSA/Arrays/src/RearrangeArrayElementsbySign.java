import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    //    brute force
//    time complexity => O(N)
    public static int[] rearrangeArray(int[] nums) {
//        ArrayList<Integer> pos = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//        for(int i = 0; i < nums.length;i++) {
//            if (nums[i] > 0) {
//                pos.add(nums[i]);
//            } else {
//                neg.add(nums[i]);
//            }
//        }
//            for(int i = 0;i< nums.length/2;i++){
//              nums[2*i] = pos.get(i);
//              nums[2*i+1] = neg.get(i);
//            }
//
//        return nums;
//    }
//

//
//    optimal solution:

        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;


    }

    public static void main(String args[]) {
        int[] arr = {-2, -3, 1, 1, -1, -4, 4, 4};
        int[] ans = rearrangeArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}


