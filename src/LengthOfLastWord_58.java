public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String haystack = " x  asdf    ";
        System.out.println(lengthOfLastWord(haystack));
    }

    public static int lengthOfLastWord(String s) {
        int k = 0;
    for (int i = 0 ; i<s.length() ; i++){
        if(s.charAt(s.length()-(i+1)) == ' '){
            if(k!=0)
            return k ;
            else
                continue;
        }
        k++;
    }
        return k;
    }

}
