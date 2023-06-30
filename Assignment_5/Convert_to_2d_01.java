import java.security.PublicKey;
import java.util.Arrays;

class Convert_to_2d_01 {
    public static int[][] convert_to_2d(int[] arr, int m, int n) {
        int[][] matrix = new int[m][n];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = arr[count];
                count++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int m = 2;
        int n = 2;
        int result[][] = convert_to_2d(arr, m, n);
        System.out.println(Arrays.deepToString(result));
    }
}