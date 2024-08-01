public class singleNonDupElement {
        public int singleNonDuplicate(int[] nums) {
            int n = nums.length;
            int i = 0;
            int low = i;
            int mid = i+1;
            int high = mid+1;
            while(i<0){
                if (mid == low || mid == high) {
                    i++;
                } else {
                    return mid;
                }
                return i; // Returning i in case mid == low or mid == high
            }


            return -1;
        }
    }

