public class Can_flower_plot_04 {
    public static boolean canFlowerPlot(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;

        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;

                if (count == n) {
                    return true;
                }
            }
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        int n = 1;

        boolean canPlace = canFlowerPlot(flowerbed, n);
        System.out.println("Can place flowers: " + canPlace);
    }
}
