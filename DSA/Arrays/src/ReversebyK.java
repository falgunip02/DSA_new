import java.util.Arrays;

public class ReversebyK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2; // Number of rotations

        System.out.println("Original Array: " + Arrays.toString(nums));

        int n = nums.length;
        rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
//                    int[] rotated = new int[n];
//
//                    // Calculate the effective number of rotations
//                    k = k % n;
//
//                    // Copy elements to the rotated array
//                    for (int i = 0; i < n; i++) {
//                        rotated[(i + k) % n] = nums[i];
//                    }
//
//                    // Copy rotated array back to original array
//                    System.arraycopy(rotated, 0, nums, 0, n);
//
//                    // Print the rotated array
//                    for (int num : nums) {
//                        System.out.print(num + " ");
//                    }


            // time and space complexity of above solution is : O(n)
            // => as for space additional array ds is required.

// Optimal solution.
// Reversal algorithm

            public static void Reverse(int[] arr, int start, int end) {
                while (start < end) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }
public static int[] rotate(int[] nums, int k){
            int n = nums.length;
            Reverse(nums,0,n-1);                        //reverse whole array
            Reverse(nums,0,k-1);                        //reverse kth elements
            Reverse(nums,k,n-1);
    return nums;
}

}





