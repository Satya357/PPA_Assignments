public class Move_zeroes_07 {
    public static void moveZeros(int[] nums) {
        int i = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };

        moveZeros(nums);
        System.out.print("Non duplicate array : ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
