import java.util.Arrays;

class Shift_0s_01 {
    public static void moveZeroes(int[] nums) {
        int temp;
        int zeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[zeroIndex];
                nums[zeroIndex] = temp;
                zeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}