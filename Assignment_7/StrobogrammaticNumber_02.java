public class StrobogrammaticNumber {
    public static boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if (leftChar == '0' && rightChar == '0' ||
                    leftChar == '1' && rightChar == '1' ||
                    leftChar == '6' && rightChar == '9' ||
                    leftChar == '8' && rightChar == '8' ||
                    leftChar == '9' && rightChar == '6') {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String num = "69";

        boolean isStrobogrammatic = isStrobogrammatic(num);

        System.out.println(isStrobogrammatic);
    }
}
