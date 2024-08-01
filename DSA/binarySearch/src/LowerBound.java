public class LowerBound {
    public static int lowerBound(int []arr, int n, int x) {
        int start = 0;
            int end = n-1;

        int ans = n;
        while(start<=end){
           int mid = (start+end)/2;
           if(arr[mid]>=x){
            ans = mid;
            end = mid - 1;
           }
           else{
               start = mid +1;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}

