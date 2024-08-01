public class BuySell {
        public static int maxProfit(int[] prices) {
            int max = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < prices.length;i++){
                min = Math.min(prices[i],min);
                max = Math.max(max,prices[i]-min);

            }

            return max;
        }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    }

