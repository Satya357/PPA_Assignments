import java.util.Arrays;

public class Remove_occurence_02 {
    public static int removeElementOccurence(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        int result = removeElementOccurence(nums, val);

        System.out.println(Arrays.toString(nums));

        System.out.print("Output: " + result + ", nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1)
                System.out.print(nums[i] + ",");
        }

        System.out.println("]");
    }
}
