

public class countSubarraySum {
    public static void main(String[] args) {

    }


    public int countSubarraySumbyk(int[] arr, int k) {
        int n = arr.length; // Length of the array
        int count = 0; // Initialize count for subarrays with sum k

        // Loop through all possible subarrays
        for (int start = 0; start < n; start++) { // Start index of the subarray
            for (int end = start; end < n; end++) { // End index of the subarray

                // Calculate the sum of the current subarray [start...end]
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i]; // Add each element to the sum
                }

                // Increase the count if sum equals k
                if (sum == k) {
                    count++;
                }
            }
        }

        return count; // Return the total count of subarrays with sum k
    }
}