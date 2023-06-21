import java.util.Arrays;

public class Maximum_product_05 {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        return product1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int maxProduct = maximumProduct(nums);
        System.out.println("Maximum Product is : " + maxProduct);
    }
}
