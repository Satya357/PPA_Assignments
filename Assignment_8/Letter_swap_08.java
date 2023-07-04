public class Letter_swap_08 {
    public static boolean canSwapLetters(String s, String goal) {
        int sLength = s.length();
        int goalLength = goal.length();

        if (sLength != goalLength) {
            return false;
        }

        int firstMismatchIndex = -1;
        int secondMismatchIndex = -1;

        for (int i = 0; i < sLength; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstMismatchIndex == -1) {
                    firstMismatchIndex = i;
                } else if (secondMismatchIndex == -1) {
                    secondMismatchIndex = i;
                } else {
                    return false;
                }
            }
        }

        if (firstMismatchIndex == -1 && secondMismatchIndex == -1) {
            return true;
        }

        if (firstMismatchIndex == -1 || secondMismatchIndex == -1) {
            return false;
        }

        return s.charAt(firstMismatchIndex) == goal.charAt(secondMismatchIndex) &&
                s.charAt(secondMismatchIndex) == goal.charAt(firstMismatchIndex);
    }

    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        boolean canSwap = canSwapLetters(s, goal);
        System.out.println("Can swap letters: " + canSwap);
    }
}
