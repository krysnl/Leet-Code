public class ReverseInteger_7 {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        double a = 0 ;
        boolean minus = false;
        String str = String.valueOf(x);

        if (str.charAt(0) == '-') {
            str = str.substring(1);
            minus = true;
        }

        for (int i = str.length(); i > 0 ; i-- ){

            double s = Math.pow(10,i-1) * Character.getNumericValue(str.charAt(i-1));
            a += s;
        }

        if (minus)
            a = a*-1;
        if ( a > Integer.MAX_VALUE )
            a = 0;
        else if (a < Integer.MIN_VALUE)
            a = 0;
        return (int)a ;
    }
}
