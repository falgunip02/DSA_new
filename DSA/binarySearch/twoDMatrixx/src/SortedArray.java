import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 15;
        System.out.println(Arrays.toString(search(arr, target)));
    }

//search in the row provided btwn the cols provided
    static int[] binarySearch(int[][] matrix, int row , int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;    // be cautious, matrix may be empty

        if(cols==0){
        return new int[]{-1,-1};
        }

        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);

        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
        // run the loop till two rows remaining
        while(rStart<(rEnd-1)){//while this true it will have more than two rows i
            int mid = rStart + (rEnd - rStart) /2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] > target){
                rEnd = mid;
            }
            else{
                rStart = mid;
            }
        }

        //now we have two rows
        //check whether the target is in the col of 2 rows

        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        //search in 1st half
        if(target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart,0,cMid-1, target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix, rStart,cMid+1,cols-1, target);
        }
        //search in 3rd half
        if(target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1 ,0,cMid-1, target);
        }
        //search in 4th half
        else {
            return binarySearch(matrix, rStart+1,cMid+1,cols-1, target);
        }

    }
}





//public class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        if (rows == 0 || cols == 0) {
//            return false;
//        }
//
//        int start = 0;
//        int end = rows * cols - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            int midElement = matrix[mid / cols][mid % cols];
//
//            if (midElement == target) {
//                return true;
//            } else if (midElement < target) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//
//        return false;
//    }
//
//}
//leetcode solution