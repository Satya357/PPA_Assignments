class Calculator {
    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public void add(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 10); // Output: Sum: 15
        calculator.add(3.14, 2.71); // Output: Sum: 5.85
    }
}
