public class removingDupsElements {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);

        printArray(nums1, len1);

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Array after removing duplicates:");
        printArray(nums2, len2);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Empty array has no duplicates
        }

        int index = 0; // Index to place non-duplicate elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++; // Move to the next position
                nums[index] = nums[i]; // Place non-duplicate element
            }
        }

        return index + 1; // Length of the modified array
    }

    public static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
