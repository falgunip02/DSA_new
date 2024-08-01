public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int single = search(arr);
        System.out.println("Single element is: " + single);
    }

//    public static int search(int[] arr){
//        int n = arr.length;
//        if(n == 1){
//            return arr[0];
//        }
//        if(arr[0] != arr[1]){
//            return arr[0];
//        }
//        if(arr[n-1] != arr[n-2]){
//            return arr[n-1];
//        }
//        for(int i = 1; i < n - 1; i++){
//            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
//                return arr[i];
//            }
//        }
//        // If no single element is found, return -1 or any other appropriate value
//        return -1;
//    }


//optimal solution using binary search

    public static int search(int[] arr){
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[n-1] != arr[n-2]) {
        return arr[n - 1];
    }
        int low = 1;
        int high = n-2;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];
            }
            if ((mid % 2 == 1 && arr[mid]==(arr[mid - 1]))
                    || (mid % 2 == 0 && arr[mid]==(arr[mid + 1]))) {
                // Eliminate the left half:
                low = mid + 1;
            } else {
                // Eliminate the right half:
                high = mid - 1;
            }


        }
return -1;
        }

}
