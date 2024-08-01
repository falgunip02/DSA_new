import java.util.Arrays;

public class missingNumber {
    public static int missArr(int[] nums, int n) {
//--------------------------------Brute force method ------------------------------------------------------//


        for(int i = 1; i<=n;i++){
            int flag = 0;
            for(int j = 0; j<n;j++){
                if(nums[j] == i) {
                    flag++;
                    break;
                }
            }
        if(flag==0){
            return i;
            }
        }
        return -1;

//        => time complexity :O(n^2) space complexity : O(1)

// -------------------------------Better approach---------------------------------------------//
//use hashing


    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5,6};
        System.out.println(missArr(arr,6));
    }
}
