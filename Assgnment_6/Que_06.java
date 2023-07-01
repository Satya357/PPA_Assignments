import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Que_06 {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;

        if (n % 2 != 0 || changed.length == 0) {
            return new int[0];
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);

        int[] original = new int[n / 2];
        int index = 0;

        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) > 0) {
                int doubleNum = num * 2;
                if (countMap.getOrDefault(doubleNum, 0) > 0) {
                    original[index++] = num;
                    countMap.put(num, countMap.get(num) - 1);
                    countMap.put(doubleNum, countMap.get(doubleNum) - 1);
                } else {
                    return new int[0];
                }
            }
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = { 1, 3, 4, 2, 6, 8 };
        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }
}
