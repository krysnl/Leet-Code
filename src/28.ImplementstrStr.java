public class ImplementstrStr_28 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack , needle));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;
        for(int i = 0 ; i < haystack.length() ; i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                if((needle.length()+i) <= haystack.length() ){
                    if (haystack.substring(i,i+needle.length()).equals(needle))
                        return i;
                }
                else return -1;
            }
        }
        return -1;
    }
}
