class Parent {
    public void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child's display method");
    }
}

public class Overridden {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Output: "Child's display method"

        Parent parent = new Parent();
        parent.display(); // Output: "Parent's display method"
    }
}
