import java.util.Arrays;

public class Squared_sorted_arr_03 {
    public static void numSquareSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        numSquareSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
