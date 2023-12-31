import java.util.Arrays;

public class Missing_num_08 {
    public static int[] findMissingDuplicate(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i;
                break;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                result[1] = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3 };

        int[] result = findMissingDuplicate(nums);
        System.out.println("Result : " + Arrays.toString(result));
    }
}
