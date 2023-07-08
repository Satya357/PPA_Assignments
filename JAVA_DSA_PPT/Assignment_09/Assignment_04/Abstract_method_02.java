abstract class Shape {
    // Abstract methods
    public abstract void draw();

    public abstract double calculateArea();

    // Concrete methods
    public void display() {
        System.out.println("Displaying shape");
    }

    public void setColor(String color) {
        System.out.println("Setting shape color to " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Abstract_method_02 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.draw();
        double area = circle.calculateArea();
        System.out.println("Area: " + area);
        circle.display();
        circle.setColor("Red");
    }
}
