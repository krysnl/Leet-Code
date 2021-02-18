public class RomanToInteger {

    public static void main(String[] args) {
        String x = "MCMXCIV";
        System.out.println(romanToInt(x));
    }


    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    ans += 1;
                    break;
                case 'V':
                    if (i - 1 >= 0 && s.charAt(i - 1) == 'I')
                        ans += 3;
                    else
                        ans += 5;
                    break;
                case 'X':
                    if (i - 1 >= 0 && s.charAt(i - 1) == 'I')
                        ans += 8;
                    else
                        ans += 10;
                    break;
                case 'L':
                    if (i - 1 >= 0 && s.charAt(i - 1) == 'X')
                        ans += 30;
                    else
                        ans += 50;
                    break;
                case 'C':
                    if (i - 1 >= 0 && s.charAt(i - 1) == 'X')
                        ans += 80;
                    else
                        ans += 100;
                    break;
                case 'D':
                    if (i - 1 >= 0 && s.charAt(i - 1) == 'C')
                        ans += 300;
                    else
                        ans += 500;
                    break;
                case 'M':
                    if (i - 1 >= 0 && s.charAt(i - 1) == 'C')
                        ans += 800;
                    else
                        ans += 1000;
                    break;
            }
        }
        return ans;
    }
}
