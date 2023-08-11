Method overriding is a concept in Java (and object-oriented programming in general) where a subclass provides a specific implementation for a method that is already defined in its superclass. The overriding method in the subclass must have the same method signature (name, parameters, and return type) as the method in the superclass.

Key points about method overriding in Java:

1. **Inheritance**: Method overriding is closely tied to the concept of inheritance, where a subclass inherits the methods and fields of its superclass.

2. **Superclass and Subclass Relationship**: Overriding occurs when a subclass provides its own implementation for a method that is declared in its superclass.

3. **Method Signature**: The overriding method in the subclass must have the same method signature as the method in the superclass. This includes the method name, parameter types, and return type.

4. **Access Modifiers**: The access modifier of the overriding method in the subclass cannot be more restrictive than the access modifier of the overridden method in the superclass. It can be the same or more permissive (i.e., less restrictive).

5. **Exception Handling**: The overriding method can throw the same exception or a subclass of the exception thrown by the overridden method. However, it cannot throw a broader exception.

Here's an example demonstrating method overriding:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Outputs: "Dog barks"
        animal2.makeSound(); // Outputs: "Cat meows"
    }
}
```

In this example, the `Animal` class defines a method called `makeSound()`. The `Dog` and `Cat` classes override this method to provide their own implementations. When you call `makeSound()` on instances of `Dog` and `Cat`, the overridden methods in the respective subclasses are invoked.

Method overriding is an essential part of achieving polymorphism in Java, where objects of different classes can be treated as objects of a common superclass, and their methods can be called interchangeably.
