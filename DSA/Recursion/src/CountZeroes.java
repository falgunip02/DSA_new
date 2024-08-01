public class CountZeroes {
    public static void main(String[] args) {
        int ans = CountZ(92,0);
        System.out.println(ans);
    }

    private static int CountZ(int n, int count) {
        if(n%10==0){
            count++;
        }
        if(n/10==0){
            return count;
        }

        return CountZ(n/10,count);
    }
}
