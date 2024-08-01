public class Oddsubstring {
    public String largestOddNumber(String num) {
        int n = num.length();

        if (num.charAt(n - 1) % 2 != 0) {
            return num; // If the last digit is odd, return the number itself
        } else {
            for (int i = n - 2; i >= 0; i--) {
                if (num.charAt(i) % 2 != 0) {
                    return num.substring(0, i + 1); // Return largest odd number substring
                }
            }
        }

        return ""; // Return empty string if no odd digits are found
    }
}
