public class Matrix_operation_07 {
    public static int maxCount(int m, int n, int[][] ops) {
        int maxRow = m;
        int maxCol = n;

        for (int[] op : ops) {
            maxRow = Math.min(maxRow, op[0]);
            maxCol = Math.min(maxCol, op[1]);
        }

        return maxRow * maxCol;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = { { 2, 2 }, { 3, 3 } };
        int maxIntegers = maxCount(m, n, ops);
        System.out.println(maxIntegers);
    }
}
