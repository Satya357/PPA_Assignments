import java.util.ArrayList;
import java.util.List;

public class Ranges_07 {
    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        long next = lower;

        for (int num : nums) {
            if (num == next) {
                next++;
            } else if (num > next) {
                result.add(getRange(next, num - 1));
                next = (long) num + 1;
            }
        }

        if (next <= upper) {
            result.add(getRange(next, upper));
        }

        return result;
    }

    private static List<Integer> getRange(long start, long end) {
        List<Integer> range = new ArrayList<>();
        range.add((int) start);
        range.add((int) end);
        return range;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 3, 50, 75 };
        int lower = 0;
        int upper = 99;

        List<List<Integer>> missingRanges = findMissingRanges(nums, lower, upper);

        System.out.println("Missing Ranges : ");
        for (List<Integer> range : missingRanges) {
            System.out.println(range);
        }
    }
}
