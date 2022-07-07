public class AddBinary_67 {

    public static void main(String[] args) {
        String a = "111";
        String b = "1";
        System.out.println(addBinary(a , b));
    }
    public static String addBinary(String a, String b) {
        String ret = "";
        int c;
        if (a.length() > b.length()) {
            int r = a.length()-b.length();
            for (int i = 0 ; i<r ; i++){
                b = 0+b;
            }
        } else {
            int r =b.length()-a.length();
            for (int i = 0 ; i<r ; i++){
                a = 0+a;
            }
        }
        c = 0;
        for(int i = 0 ; i<a.length() ; i++){
            int x = Integer.parseInt(String.valueOf(a.charAt(a.length()-1-i))) + Integer.parseInt(String.valueOf(b.charAt(a.length()-1-i))) + c;
            switch (x) {
                case 2:
                   ret = 0+ret;
                   c = 1;
                   break;

                case 3:
                    ret = 1+ret;
                    c = 1;
                    break;

                default:
                    ret = x+ret;
                    c = 0;
            }
        }
        if (c == 1)
            ret = 1+ret;
        return ret;
    }
}
