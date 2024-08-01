public class rotateN {
    public static void rotate(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        int j = 0;
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
    }

    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotate(arr, n, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
