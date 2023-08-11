In Java, the `super` keyword is used to refer to the immediate parent class of a derived class (subclass). It's often used in situations where a subclass wants to access or call members (fields or methods) defined in its superclass. The `super` keyword allows you to differentiate between members of the subclass and members of the superclass with the same name.

Here are some common uses of the `super` keyword:

1. **Accessing Superclass Members**:
   - When a subclass overrides a method of its superclass, you can use the `super` keyword to call the overridden method in the superclass.

2. **Accessing Superclass Constructors**:
   - In a subclass constructor, you can use `super()` to call a constructor of the superclass. This is often used to initialize common fields defined in the superclass.

3. **Preventing Field Ambiguity**:
   - If a subclass has a field with the same name as a field in the superclass, you can use `super` to access the superclass field.

Here's an example demonstrating the use of the `super` keyword:

```java
class Animal {
    String type = "Animal";

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String type = "Dog";

    @Override
    void makeSound() {
        super.makeSound(); // Calls the makeSound() method of the superclass
        System.out.println("Dog barks");
    }

    void printType() {
        System.out.println("Subclass type: " + type);        // Accesses the Dog class's type
        System.out.println("Superclass type: " + super.type); // Accesses the Animal class's type
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.printType();
    }
}
```

In this example, the `Dog` class extends the `Animal` class. The `makeSound()` method in the `Dog` class uses the `super` keyword to call the `makeSound()` method in the `Animal` class. The `printType()` method demonstrates accessing fields with the same name from both the subclass and the superclass.

The `super` keyword helps maintain proper inheritance and prevents ambiguity when dealing with overridden methods and field names in subclasses.


  
