import java.util.Arrays;

public class moveZerosEnd {
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 5, 0, 7, 0, 8};
        int[] ans = moveZerosToEnd(arr);
        System.out.println(Arrays.toString(ans));
    }
//    static int[] move(int[] nums){
//        int n = nums.length;
//        int nz = 0;
//        int z = 0;
//        while(nz<n){
//            if(nums[nz]!=0){
//                int temp = nums[nz];
//                nums[nz] = nums[z];
//                nums[z] = temp;
//                z++;
//            }
//
//                nz++;
//                    }
//        return nums;
//    }
//}


        static int[] moveZerosToEnd(int[] nums) {
            int n = nums.length;
            int zeroCount = 0;

            // Move non-zero elements to the front
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[zeroCount] = nums[i];
                    zeroCount++;
                }
            }

            // Fill the remaining positions with zeros
            while (zeroCount < n) {
                nums[zeroCount] = 0;
                zeroCount++;
            }
            return nums;
        }
    }