public class ArraySorted {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 7, 8};
        boolean ans = sorted(arr, 0);
        System.out.println(ans);
    }

    public static boolean sorted(int[] arr, int index) {
        // Base case: if we reach the second last element, check if it's less than the last element
        if (index == arr.length - 1) {
            return true;
        }

        // Check if the current element is less than the next element and
        // recursively call the function for the next index
        if (arr[index] < arr[index + 1] && sorted(arr, index + 1)) {
            return true;
        }

        // If any element is not less than the next one, return false
        return false;
    }
}
