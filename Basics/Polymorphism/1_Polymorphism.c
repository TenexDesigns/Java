Polymorphism is a core concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass.
   It enables you to write code that can work with objects of various classes in a consistent way, promoting flexibility and code reuse.
   Polymorphism is one of the key features of inheritance and interfaces.

There are two main types of polymorphism in Java: compile-time (method overloading) and runtime (method overriding). Here's a breakdown of each type:

1. **Compile-Time Polymorphism (Method Overloading):**
   - Method overloading allows a class to have multiple methods with the same name but different parameter lists (different number or types of parameters).
   - The appropriate method is chosen based on the method call at compile time.
   - This type of polymorphism is also known as "static polymorphism."

Example of method overloading:

```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```

2. **Runtime Polymorphism (Method Overriding):**
   - Method overriding allows a subclass to provide a specific implementation for a method that is already defined in its superclass.
   - The appropriate method is chosen based on the objects actual type at runtime.
   - This type of polymorphism is also known as "dynamic polymorphism."

Example of method overriding:

```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
```

Polymorphism is often used in scenarios where you want to work with objects of different subclasses using a common interface, such as when managing collections or arrays of objects. This promotes code flexibility and reusability, making your codebase more maintainable and adaptable to changes.

Heres an example demonstrating runtime polymorphism:

```java
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Shape(); // This would be an error as Shape is abstract

        for (Shape shape : shapes) {
            shape.draw(); // Calls the appropriate draw method based on the object's type
        }
    }
}
```

In this example, the `draw()` method is overridden in both the `Circle` and `Rectangle` subclasses. When looping through an array of `Shape` objects, the appropriate version of `draw()` is called based on the actual object type.
