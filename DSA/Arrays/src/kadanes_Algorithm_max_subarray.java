public class kadanes_Algorithm_max_subarray {

//    brute force method => iterating through all sub-arrays
    public static int maximum_subarray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += nums[k];
//
//                }
//                maxi = Math.max(maxi, sum);
//            }
//        }
//        return maxi;

//      better approach:=> O(n^2)
//        for(int i = 0; i < nums.length;i++){
//            int sum = 0;
//            for(int j = i; j< nums.length;j++){
//
//                 sum += nums[j];
//                 maxi = Math.max(maxi,sum);
//            }
//        }
//        return  maxi;

//    optimal solution:

                int sum = 0;
                for(int i = 0 ; i<nums.length;i++){
                    sum += nums[i];
                    if(sum>maxi){
                        maxi = sum;
                    }
                    if(sum<0){
                        sum = 0;
                    }
                }
                return maxi;
            }

    public static void main(String args[]) {
        int[] arr = {1, 2, -3, 1, 1, -1, -4, 4, 4};
        int ans = maximum_subarray(arr);
        System.out.println("The maximum subarray is: " + ans);
    }
}
