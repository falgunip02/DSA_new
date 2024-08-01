public class RemoveElement {
//    public static int[] removeelement(int[] nums, int val) {
//        brute force => time complexity O(N) and space => O(N);


//        int n = nums.length;
//        int[] temp = new int[nums.length];
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                temp[k] = nums[i];
//                k++;
//
//            }
//
//        }
//        return temp;
//    }

    //    optimal
//    change in the same array



        public static int removeelement(int[] nums, int val) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }

        public static void main(String[] args) {
            int[] nums = {3, 2, 2, 3};
            int val = 3; // Number to be removed

            int actualLength = removeelement(nums, val); // Calls the method

            System.out.println("Array after removing " + val + ":");
            printArray(nums, actualLength); // Print modified array


        }


        // Overloaded method to print only the first 'length' elements of the array
        public static void printArray(int[] arr, int length) {
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

//    in this the nums array is shifting the index of non val elements forward and printing only coubt of index elements in final array
// use debug to understand
