public class sumOfDigits {
    public static void main(String[] args) {
    int n = 327;
    int ans = sum(n);
        System.out.println(ans);
    }

    static public int sum(int N){
        if(N%10 == N){
            return N;
        }

        return (N%10)+sum(N/10);
    }
}
