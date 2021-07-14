public class PalindromeNumber_9 {
    public static void main(String[] args) {
        int x = 316413;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int j = str.length();
        for (int i = 0 ; i< str.length(); i++,j--) {
            if(j < i+1)
                break;
            if (str.charAt(i) == str.charAt(j - 1))
                continue;
            else return false;
        }
        return true;
    }
}
