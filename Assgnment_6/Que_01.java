import java.util.*;

public class Que_01 {
    public static int[] findPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        int low = 0;
        int high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = low++;
            } else {
                perm[i] = high--;
            }
        }

        perm[n] = low;

        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = findPermutation(s);
        System.out.println(Arrays.toString(perm));
    }
}
