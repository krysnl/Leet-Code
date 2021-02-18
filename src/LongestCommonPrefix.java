public class LongestCommonPrefix {


    public static void main(String[] args) {
        String [] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));

    }


    public static String longestCommonPrefix(String[] strs) {

        String c = "";
        if(strs.length == 0) {
            return c;
        }
        String first = strs[0];
        for (String str : strs) {
            c = "";
            for (int x = 0; x < str.length(); x++) {
                if (first.length() > x)
                    if (first.charAt(x) == str.charAt(x))
                        c += first.charAt(x);
                    else break;
            }
            first = c;
        }
        return c;
    }
}
