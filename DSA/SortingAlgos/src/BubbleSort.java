import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 2, 3,1, 4, 15, 16, 18, 22, 45, 89};
         bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0 ; i< arr.length;i++){
            swapped = false;
            for(int j = 1 ;j< arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
                }
            if(!swapped){
                break;

            }
        }
    }
}
