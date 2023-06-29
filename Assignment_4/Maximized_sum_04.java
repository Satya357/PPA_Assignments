import java.util.Arrays;

public class Maximized_sum_04 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 2 };
        int maxSum = arrayPairSum(nums);
        System.out.println(maxSum);
    }
}
