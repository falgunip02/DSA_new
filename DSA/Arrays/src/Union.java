import java.util.ArrayList;

public class Union {
    public static ArrayList<Integer> uni(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> temp = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]) {
                    temp.add(arr1[i]);
                }
                i++;
            } else {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr2[j]) {
                    temp.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (temp.get(temp.size() - 1) != arr1[i]) {
                temp.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (temp.get(temp.size() - 1) != arr2[j]) {
                temp.add(arr2[j]);
            }
            j++;
        }

        return temp;
    }

    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> temp = uni(arr1, arr2);

        System.out.println("Union of arr1 and arr2 is ");
        for (int val : temp)
            System.out.print(val + " ");
    }
}
