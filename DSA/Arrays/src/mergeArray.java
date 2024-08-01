import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0}; // Example nums1 array with space for merging
        int m = 3; // Number of elements in nums1

        int[] nums2 = {2, 4, 6}; // Example nums2 array
        int n = 3; // Number of elements in nums2

        merge(nums1, m, nums2, n); // Call the merge function

        // Print the merged array nums1
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        brute force // time complexity =>O(m+n) space => O(n){extra space used}

//        int[] temp = new int[m + n];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < m && j < n) {
//            if (nums1[i] < nums2[j]) {
//                temp[k] = nums1[i];
//                i++;
//                k++;
//            } else {
//                temp[k] = nums2[j];
//                j++;
//                k++;
//            }
//        }
//        while (i < m) {
//            temp[k] = nums1[i];
//                i++;
//                k++;
//        }
//
//        while(j < n){
//            temp[k] = nums2[j];
//            j++;
//            k++;
//        }
//        System.arraycopy(temp,0,nums1,0,m+n);



//        optimal solution => O(m+n) and O(1) sapce;
int i = m-1;
int j = n-1;
int k = m+n-1;

while(i <= 0 && j<=0){
    if(nums1[i]>nums2[j]){
        nums1[k] = nums1[i];
        k--;
        i--;
    }
    else{
        nums1[k] = nums2[j];
        k--;
        j--;
    }
}
while(j>=0){
    nums1[k] = nums2[j];
    k--;
    j--;
}

    }
}



