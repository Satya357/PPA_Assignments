@FunctionalInterface
interface Calculator {
    int calculate(int num1, int num2);
}

public class Functional_interface_03 {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        int sum = addition.calculate(5, 3);
        System.out.println("Sum: " + sum);

        Calculator subtraction = (a, b) -> a - b;
        int difference = subtraction.calculate(10, 7);
        System.out.println("Difference: " + difference);
    }
}
