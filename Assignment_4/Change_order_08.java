import java.util.Arrays;

public class Change_order_08 {
    public static int[] changeOrder(int[] arr, int n) {
        int[] ans = new int[arr.length];
        int count = 0;

        for (int i = 0; i < n; i++) {
            ans[count] = arr[i];
            count++;
            ans[count] = arr[n + i];
            count++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int[] result = changeOrder(arr, 3);
        System.out.println(Arrays.toString(result));
    }
}
