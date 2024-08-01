import java.util.Arrays;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,6,10,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort (int[] arr){
        for(int i = 0; i < arr.length;i++){
            int last = arr.length-i-1;
            int maxElement = getmaxElement(arr,0,last);
            swap(arr,maxElement,last);
        }
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getmaxElement(int[] arr, int start, int end) {
         int max = start;
        for(int i = start; i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
         return max;
     }
}
