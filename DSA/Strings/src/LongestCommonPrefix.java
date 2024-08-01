public class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {
            String prefix = strs[0];

            for(int index=1;index<strs.length;index++){

                while(strs[index].indexOf(prefix) != 0){
                    prefix=prefix.substring(0,prefix.length()-1);
                }
            }
            return prefix;
        }

    public static void main(String[] args) {
        String[] strs = {"carl","cart","caring"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
//
        String text = "cart";
        int index = text.indexOf("car"); // index will be 6
        System.out.println(index);
//        int notFound = text.indexOf( "ello"); // notFound will be -1
//        System.out.println(notFound);

    }
    }

