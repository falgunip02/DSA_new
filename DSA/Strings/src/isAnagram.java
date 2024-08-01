class isAnagram {
    public static void main(String[] args) {
        String s = "falguni";
        String t = "inugla6";
        String ans = String.valueOf(isAnagraam(s,t));
        System.out.println(ans);
    }
    public static boolean isAnagraam(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0 ; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;

        }

        for(int i = 0;i<t.length();i++){
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}