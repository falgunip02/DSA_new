import java.util.Arrays;

public class subsetSum {

    static void subsetSumsHelper(int ind, int sum, int[] arr, int N, int[] sumSubset) {
        if (ind == N) {
            sumSubset[sum] = 1;
            return;
        }

        // pick the element
        subsetSumsHelper(ind + 1, sum + arr[ind], arr, N, sumSubset);

        // Do-not pick the element
        subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
    }

    static void subsetSums(int[] arr) {
        int N = arr.length;
        int[] sumSubset = new int[1000]; // assuming the maximum possible sum of subsets
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        System.out.println("The sum of each subset is:");
        for (int i = 0; i < sumSubset.length; i++) {
            if (sumSubset[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = {3, 1, 2, 8};
        subsetSums(arr);
    }
}
