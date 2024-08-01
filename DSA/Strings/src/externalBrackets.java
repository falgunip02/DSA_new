public class externalBrackets {
    public static void main(String[] args) {
            String s = "(()())(())(()(()))";
            String ans = removeOuterParentheses(s);
            System.out.println(ans);
        }

            public static String removeOuterParentheses(String s) {
            int count = 0;
            StringBuilder ans = new StringBuilder();
            for(int i = 0 ; i<s.length();i++){
                char c = s.charAt(i);
                if(c == '('){
                    if(count > 0) {
                        ans.append(c); // Append '(' if not the outermost pair
                    }
                    count++;
                }
                else if(c == ')') {
                    count--;
                    if(count > 0) {
                        ans.append(c); // Append ')' if not the outermost pair
                    }
                }
            }
            return ans.toString();
        }
    }


