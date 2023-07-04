import java.util.ArrayList;
import java.util.List;

public class Anagram_indices_06 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        int[] targetCount = new int[26];
        int[] windowCount = new int[26];
        int pLength = p.length();
        int sLength = s.length();

        for (char c : p.toCharArray()) {
            targetCount[c - 'a']++;
        }

        int left = 0;
        int right = 0;

        while (right < sLength) {
            windowCount[s.charAt(right) - 'a']++;

            if (right - left + 1 > pLength) {
                windowCount[s.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == pLength && matches(targetCount, windowCount)) {
                indices.add(left);
            }

            right++;
        }

        return indices;
    }

    private static boolean matches(int[] targetCount, int[] windowCount) {
        for (int i = 0; i < 26; i++) {
            if (targetCount[i] != windowCount[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = findAnagrams(s, p);

        System.out.println("Anagram Start Indices: " + indices);
    }
}
