public class Minimum_score_08 {
    public static int minimumScore(int[] nums, int k) {
        int minVal = nums[0];
        int maxVal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            minVal = Math.min(minVal, nums[i]);
            maxVal = Math.max(maxVal, nums[i]);
        }

        int initialScore = maxVal - minVal;
        if (initialScore == 0) {
            return 0;
        }

        for (int num : nums) {
            if (num >= minVal + k && num <= maxVal - k) {
                return initialScore;
            }
        }

        int scenario1 = maxVal - k;
        int scenario2 = minVal + k;
        int scenario3 = (maxVal - k) - (minVal + k);

        return Math.min(initialScore, Math.min(scenario1, Math.min(scenario2, scenario3)));
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 9 };
        int k = 2;

        int result = minimumScore(nums, k);
        System.out.println("Minimum Score : " + result);
    }
}
