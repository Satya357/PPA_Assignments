public class Increment_one_05 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] < 10) {
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };

        int[] result = plusOne(digits);

        System.out.println("Result:");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
