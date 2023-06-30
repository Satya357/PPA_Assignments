import java.util.ArrayList;
import java.util.List;

public class Find_duplicates_06 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index] < 0) {
                result.add(index);
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 0, 4, 1, 2, 3, 3, 6, 6 };
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicate elements: " + duplicates);
    }
}
