In Java, a method is a block of code that performs a specific task or set of tasks. Methods are used to organize code into reusable and manageable units, making the code more modular and easier to understand. Methods can take input parameters, perform operations, and return results.

-------------------------------------------------------------------------------------------
Things to note first about STATIC KEYWORD AND ITS IMPORTNCE

The static keyword in Java is used to define a member (method or field) that belongs to the class itself rather than to instances of the class. It has different implications depending on whether it's used with methods or fields.

Static Methods:-When you declare a method as static, it means the method belongs to the class itself, not to instances of the class. This has several implications:

1.Class-Level Access:
Static methods can access only other static members of the class. They cant access instance (non-static) variables or methods directly.


2.Accessing Without Object Creation:
You can call a static method directly on the class without creating an instance of the class.
---------------------------------------------------------------------------------------------

  Heres an overview of Java methods:


**Method Syntax:**
```java
accessModifier returnType methodName(parameters) {
    // Method body
    // Code to perform the task
    return returnValue; // Optional
}
```

- `accessModifier`: Specifies the visibility of the method (e.g., `public`, `private`, etc.).
- `returnType`: The data type of the value the method returns (`void` if no value is returned).
- `methodName`: The name of the method.
- `parameters`: The input data that the method uses to perform its tasks.
- `return`: The value that the method returns (if `returnType` is not `void`).

**Method Declaration and Usage:**

```java
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 7); // Calling the method
        System.out.println("Result: " + result);
    }
}
```

**Method Overloading:**

Java supports method overloading, where you can define multiple methods with the same name but different parameter lists. They are differentiated by the number or type of parameters.

```java
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int intSum = add(5, 7);
        double doubleSum = add(3.5, 2.5);
        System.out.println("Int sum: " + intSum);
        System.out.println("Double sum: " + doubleSum);
    }
}
```

**Method Parameters and Arguments:**

Parameters are variables declared in the method signature, while arguments are values passed to the method when calling it.

```java
public class Greeting {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Alice"); // "Alice" is the argument
    }
}
```

**Method Return Value:**

A method can return a value using the `return` statement. The return type should match the declared return type in the method signature.

```java
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 7);
        System.out.println("Result: " + result);
    }
}
```

Java methods play a crucial role in structuring code, enabling code reuse, and making complex tasks more manageable by breaking them into smaller pieces of logic.
