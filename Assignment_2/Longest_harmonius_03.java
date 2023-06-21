import java.util.HashMap;
import java.util.Map;

public class Longest_harmonius_03 {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int longestSubsequenceLength = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (frequencyMap.containsKey(num + 1)) {
                int currentSubsequenceLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
                longestSubsequenceLength = Math.max(longestSubsequenceLength, currentSubsequenceLength);
            }
        }

        return longestSubsequenceLength;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
        int longestSubsequenceLength = findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence : " + longestSubsequenceLength);
    }
}
