public class ReverseWords_04 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String reversed = reverseWords(s);

        System.out.println(reversed);
    }
}
