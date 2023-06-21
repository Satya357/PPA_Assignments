import java.util.HashSet;

public class Maximum_candy_02 {
    public static int maximumCandy(int[] candyType) {
        int maxEat = candyType.length / 2;
        HashSet<Integer> uniqueCandies = new HashSet<>();

        for (int candy : candyType) {
            uniqueCandies.add(candy);

            if (uniqueCandies.size() == maxEat) {
                break;
            }
        }

        return uniqueCandies.size();
    }

    public static void main(String[] args) {
        int[] candyType = { 1, 1, 2, 2, 3, 3 };
        int maxUniqueCandies = maximumCandy(candyType);
        System.out.println("Maximum number of candies : " + maxUniqueCandies);
    }
}
