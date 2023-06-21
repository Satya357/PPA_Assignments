public class Monotonic_07 {
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }

            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3 };
        boolean isMonotonic = isMonotonic(nums);
        System.out.println("Is the given array monotonic : " + isMonotonic);
    }
}
