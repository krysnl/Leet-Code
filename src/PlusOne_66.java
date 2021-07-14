import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] x = {9};
        System.out.println(Arrays.toString(plusOne(x)));
        int[]as = plusOne(x);
    }

    public static int[] plusOne(int[] digits) {
        if (digits[0] < 0) {
            digits[0] = digits[0] * -1;
            for (int i = 0; i < digits.length; i++) {
                if (digits[digits.length - 1 - i] == 0) {
                    digits[digits.length - 1 - i] = 9;
                    continue;
                } else
                    digits[digits.length - 1 - i] = digits[digits.length - 1 - i] - 1;
                break;
            }
            if (digits[0] == 0) {
                int[] arr = new int[digits.length - 1];
                for (int i = 0; i < arr.length; i++) {
                    arr[arr.length - 1 - i] = digits[digits.length - 1 - i];
                }
                arr[0] = arr[0] * -1;
                return arr;
            }
            digits[0] = digits[0] * -1;
        } else {
            for (int i = 0; i < digits.length; i++) {
                if (digits[digits.length - 1 - i] == 9) {
                    digits[digits.length - 1 - i] = 0;
                    continue;
                } else
                    digits[digits.length - 1 - i] = digits[digits.length - 1 - i] + 1;
                break;
            }
            if (digits[0] == 0) {
                int[] arr = new int[digits.length + 1];
                for (int i = 0; i < digits.length; i++) {
                    arr[arr.length - 1 - i] = digits[digits.length - 1 - i];
                }
                arr[0] = 1;
                return arr;
            }

        }
        return digits;
    }
}
