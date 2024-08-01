;

public class ReverseOfDigits {
    public static void main(String[] args) {
        int ans = Reverse(902);
        System.out.println(ans);
    }
//    static int sum = 0;
//     static void Reverse(int n) {
//        if(n == 0){
//            return;
//        }
//        int rem = n%10;
//        sum = sum*10+rem;
//        Reverse(n/10);
//    }

    static int Reverse(int n ){
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;

//        Math.pow(10, 4 - 1) = Math.pow(10, 3) = 1000
        return (int) (rem * Math.pow(10,digits-1) + helper(n/10,digits-1));
    }
//  eg = 1234
//  4*Math.pow(10,3)+helper(123,3)
//  4*1000 + helper(123,3)
// 4000 + {3*Math.pow(10,2) + helper(12,2) }
// 4000 + 300 => 4300 + .....

}

// can find palindrome too with this
//static boolean palin(int n ){
//    return n == Reverse(n);
//}
