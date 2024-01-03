abstract class Shape {
    abstract void draw();  // Abstract method without a method body

    void commonMethod() {
        System.out.println("This is a common method in the abstract class.");
    }
}

// Concrete class extending the abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Interface with abstract methods
interface Sound {
    void makeSound();  // Abstract method without a method body

    default void commonMethod() {
        System.out.println("This is a common method in the interface.");
    }
}

// Concrete class implementing the interface
class Dog implements Sound {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Abstraction using abstract class
        Shape circle = new Circle();
        circle.draw();
        circle.commonMethod();

        // Abstraction using interface
        Sound dog = new Dog();
        dog.makeSound();
        dog.commonMethod();
    }
}
