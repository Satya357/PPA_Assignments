import java.util.Arrays;

class Two_num_sum_01 {
    public static int[] twoNumSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < nums.length;) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoNumSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}