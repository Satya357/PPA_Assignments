public class Que_02 {
    public static boolean isValidString(String s) {
        int openCount = 0;
        int starCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == '*') {
                starCount++;
            } else {
                if (openCount > 0) {
                    openCount--;
                } else if (starCount > 0) {
                    starCount--;
                } else {
                    return false;
                }
            }
        }

        while (openCount > 0 && starCount > 0) {
            openCount--;
            starCount--;
        }

        return openCount == 0;
    }

    public static void main(String[] args) {
        String s = "()";

        boolean isValid = isValidString(s);

        System.out.println(isValid);
    }
}
