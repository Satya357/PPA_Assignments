public class Complete_rows_05 {
    public static int arrangeCoins(int n) {
        int rowCount = 0;
        int coinsRequired = 1;

        while (n >= coinsRequired) {
            rowCount++;
            n -= coinsRequired;
            coinsRequired++;
        }

        return rowCount;
    }

    public static void main(String[] args) {
        int n = 8;
        int completeRows = arrangeCoins(n);
        System.out.println(completeRows);
    }
}
