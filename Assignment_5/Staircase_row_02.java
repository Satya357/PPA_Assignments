public class Staircase_row_02 {
    public static int calculateCompleteRows(int n) {
        int rowCoins = 1;
        int completeRows = 0;

        while (n >= rowCoins) {
            n = n - rowCoins;
            completeRows++;
            rowCoins++;
        }
        return completeRows;
    }

    public static void main(String[] args) {
        int n = 50; // Number of coins
        int completeRows = calculateCompleteRows(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
