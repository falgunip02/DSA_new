public class binarySearchR {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8};
        int ans = bSearch(arr,8,0, arr.length-1);
        System.out.println(ans);
    }

    static int bSearch(int[] arr, int target, int s, int e){
        int mid = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return bSearch(arr,target,s,mid-1);
        }
        return bSearch(arr,target,mid+1,e);
    }
}
