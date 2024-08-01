public class ContainerMostWater {
    public static void main(String[] args) {
    int[] arr = {1,8,6,2,5,4,8,3,7};
    int ans = Container(arr);
        System.out.println(ans);
    }

    static int Container(int[] height){
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            int rht = height[right];
            int lht = height[left];
            int min = Math.min(lht,rht);
//            int len = right-left;
            max = Math.max(max,min*(right-left));
            if(lht<rht){
                left++;
            }
            else if(lht>rht){
                right--;
            }
            else{
                left++;
                right--;
            }

        }
        return max;
    }
}
