public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,3, 2, 3, 4, 5};
        boolean ans = check(arr, 0, 1); // Need to specify the data type of 'ans' as boolean
        System.out.println(ans); // Print the result
    }

    public static boolean check(int[] arr, int i, int j) {
        if (i == arr.length - 1) {
            return true; // Base case: if we've reached the end of the array, it's sorted
        }
        if (arr[i] > arr[j]) {
            return false; // If the current element is greater than the next element, array is not sorted
        }
        // Increment both indices for next comparison
        return check(arr, i + 1, j + 1);
    }
}
