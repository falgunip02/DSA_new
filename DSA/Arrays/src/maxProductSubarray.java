import java.lang.reflect.Array;

public class maxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-3, -2, 6};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }

    public static int maxProduct(int[] nums) {


        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int product = nums[0];
            for (int j = i+1; j < nums.length; j++) {
                product = product * nums[j];
                result = Integer.max(result, product);
            }

        }
        return result;
    }
}


//        int prefix = 1;
//        int sufix = 1;
//        int ans = Integer.MIN_VALUE;
//        for(int i = 0; i<nums.length;i++){
//            if(prefix==0)prefix = 1;
//            if(sufix== 0)sufix = 1;
//            prefix = prefix*nums[i];
//            sufix = sufix*nums[nums.length-i-1];
//            ans = Math.max(ans,Math.max(prefix,sufix));
//
//        }
//
//        return ans;
//    }
//}










