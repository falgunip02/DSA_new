public class productOfdigits {
    public static void main(String[] args) {
        int n = 909;
        int ans = product(n);
        System.out.println(ans);
    }

    static public int product(int N){
        if(N%10 == N){
            return N;
        }

        return (N%10)*product(N/10);
    }
}
