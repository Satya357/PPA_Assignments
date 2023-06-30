import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Changed_array_08 {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) > 0 && countMap.getOrDefault(num * 2, 0) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1);
                countMap.put(num * 2, countMap.get(num * 2) - 1);
            }
        }

        if (result.size() != changed.length / 2) {
            return new int[0];
        }

        int[] original = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            original[i] = result.get(i);
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = { 1, 3, 4, 2, 6, 8 };
        int[] original = findOriginalArray(changed);

        if (original.length == 0) {
            System.out.println("No original array found.");
        } else {
            System.out.print("Original array: ");
            for (int num : original) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
