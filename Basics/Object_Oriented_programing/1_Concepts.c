In Java, Object-Oriented Programming (OOP) is a programming paradigm that revolves around the concept of objects. Objects are instances of classes, which are templates or blueprints defining the structure and behavior of objects. OOP emphasizes the organization of code into modular, reusable, and encapsulated units.

Here's an overview of key OOP concepts in Java:

1. **Class:**
   A class is a blueprint that defines the structure (fields or attributes) and behavior (methods) that objects of that class will have.

2. **Object:**
   An object is an instance of a class. It's a runtime entity with its own state (values of attributes) and behavior (methods).

CLASS AND OBJECTS:Example

class Car {
    String make;
    String model;

    void start() {
        System.out.println("Starting the car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.start(); // Calling a method on the object
    }
}


3. **Encapsulation:**
   Encapsulation is the practice of bundling data (attributes) and methods that operate on that data within a single unit (class). It helps protect the integrity of data and restricts direct access to it.

Example

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
    }
}

4. **Inheritance:**
   Inheritance allows a class (subclass or derived class) to inherit the attributes and methods of another class (superclass or base class). It promotes code reuse and establishes an "is-a" relationship.

EXAMPLE

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Dog's own method
    }
}




5. **Polymorphism:**
   Polymorphism allows objects of different classes to be treated as objects of a common superclass. It enables you to write code that can work with objects of various types through a common interface.

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        
        shape1.draw(); // Dynamic method dispatch
        shape2.draw(); // Dynamic method dispatch
    }
}






6. **Abstraction:**
   Abstraction involves simplifying complex reality by modeling classes based on their essential properties and behaviors. It allows you to focus on the high-level functionality without getting into the implementation details.

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        
        shape1.draw();
        shape2.draw();
    }
}

7. **Constructor:**
   A constructor is a special method that is used to initialize an object when it's created. It's called when an object is instantiated from a class.

8. **Method Overloading:**
   Method overloading allows a class to have multiple methods with the same name but different parameter lists. They can have different numbers or types of parameters.

9. **Method Overriding:**
   Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
class Vehicle {
    String type;

    // Constructor
    public Vehicle(String type) {
        this.type = type;
    }

    // Method Overloading
    void displayInfo() {
        System.out.println("This is a " + type + " vehicle.");
    }

    void displayInfo(int year) {
        System.out.println("This is a " + type + " vehicle manufactured in " + year + ".");
    }

    // Method to be Overridden
    void startEngine() {
        System.out.println("Starting the engine of the vehicle.");
    }
}

class Car extends Vehicle {
    String brand;

    // Constructor
    public Car(String type, String brand) {
        super(type);
        this.brand = brand;
    }

    // Method Overriding
    @Override
    void startEngine() {
        System.out.println("Starting the engine of the " + brand + " car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle("generic");
        genericVehicle.displayInfo();
        genericVehicle.displayInfo(2023);
        genericVehicle.startEngine();

        System.out.println("----------------");

        Car myCar = new Car("car", "Toyota");
        myCar.displayInfo();
        myCar.startEngine();
    }
}


Here's a simple example of a Java class to illustrate these concepts:

```java
public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25); // Creating an object
        Person person2 = new Person("Bob", 30);

        person1.introduce(); // Calling a method on the object
        person2.introduce();
    }
}
```

In this example, `Person` is a class with attributes (`name` and `age`), a constructor to initialize objects, and a method (`introduce()`) to provide behavior. The `main` method demonstrates how to create objects and use their methods.

Object-oriented programming in Java promotes code organization, reusability, and the ability to model real-world entities as objects. It allows you to create complex systems in a more manageable and maintainable way.

