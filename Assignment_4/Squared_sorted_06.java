import java.util.Arrays;

public class Squared_sorted_06 {
    public static void sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
    }
}
