import java.util.Scanner;

public class Average_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;

        do {
            System.out.print("Enter a number (enter 0 to exit): ");
            number = scanner.nextInt();

            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        double average = (double) sum / count;

        System.out.println("Average: " + average);
        scanner.close();
    }
}
