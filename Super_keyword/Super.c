In Java, the `super` keyword is used to refer to the superclass, i.e., the class from which the current class is extended (inherits). It allows you to access the members (fields and methods) of the superclass from within the subclass. The `super` keyword has several use cases:

1. **Accessing Superclass Members:**
You can use `super` to access overridden or hidden members (methods or fields) of the superclass. This is especially useful when the subclass has its own implementation of a method, but you want to invoke the superclass's implementation.

```java
class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Call Parent's display method
        System.out.println("Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
```

2. **Invoking Parent Class Constructors:**
When you create an instance of a subclass, the superclass's constructor is called automatically. If the superclass has parameterized constructors, you can use `super()` to call a specific constructor of the superclass.

```java
class Parent {
    Parent(String message) {
        System.out.println("Parent: " + message);
    }
}

class Child extends Parent {
    Child() {
        super("Hello from Parent");
        System.out.println("Child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
```

3. **Accessing Superclass Variables:**
If the subclass and superclass have variables with the same name, you can use `super` to access the superclass's variable.

```java
class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void displayName() {
        System.out.println(super.name); // Access Parent's name
        System.out.println(this.name);   // Access Child's name
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayName();
    }
}
```

Remember that the `super` keyword can only be used within a subclass to refer to its immediate superclass. It helps in maintaining the hierarchy and relationships between classes in an inheritance chain.




