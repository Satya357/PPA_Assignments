import java.util.Arrays;

public class Arr_add_one_04 {
    public static int[] addOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 9 };

        int[] result = addOne(digits);
        System.out.println("Resultant array : " + Arrays.toString(result));
    }
}
