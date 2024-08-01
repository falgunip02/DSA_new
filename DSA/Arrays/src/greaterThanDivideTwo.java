import java.util.Arrays;

public class greaterThanDivideTwo {

//Brute force

//    public static int majorityElement(int[] nums) {
//        int n = nums.length;
//        int times = n / 2;
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (nums[j] == nums[i]) {
//                    count++;
//                }
//            }
//            if (count > times) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {10, 7,7,3, 3, 3, 3, 5};
//        System.out.println(majorityElement(arr));
//    }

//time complexity is O(n^2)
// space complexity is O(1)


// better approach use hashmap.//

    //optimal solution:
    public static int majorityElement(int[] nums) {
        int el = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                el = nums[i];
            } else if (el == nums[i])
                count++;
            else count--;
        }
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                count1++;
            }

        }
        if (count1 > (nums.length / 2))
            return el;

        return -1;

    }

    public static void main(String args[]) {
        int[] arr = {1,2,3,1,1,1,4,4,4};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);


    }
}



