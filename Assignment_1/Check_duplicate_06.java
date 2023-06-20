import java.util.HashSet;
import java.util.Set;

public class Check_duplicate_06 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };

        boolean result = containsDuplicate(nums);
        System.out.println("Duplicate found: " + result);
    }
}
