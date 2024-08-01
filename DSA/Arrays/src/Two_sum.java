//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//You can return the answer in any order.


//Input Format: N = 5,
// arr[] = {2,6,5,8,11},
// target = 14
//Result: YES (for 1st variant)
//       [1, 3] (for 2nd variant)


//brute force: use i and j and traverse whole array.
// i.e. (arr[i] + arr[j] = target).
//[1, 2, 4, 6, 6, 5]
// i  j => ...


import java.util.Arrays;

public class Two_sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for(int i = 0; i< nums.length;i++){
            for(int j = i+1;j< nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    temp[0] = i;
                    temp[1] = j;

                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10,2,3,10,3,5};
        System.out.println(Arrays.toString(twoSum(arr,12)));

    }
}
