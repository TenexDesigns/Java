Functional programming in Java is a programming paradigm that emphasizes the use of pure functions, immutability, and the treatment of functions as first-class citizens. This paradigm contrasts with traditional imperative and object-oriented programming styles by focusing on the evaluation of functions and their composition rather than changing state and mutable data. Introduced in Java 8, functional programming elements such as lambda expressions, functional interfaces, and streams have been integrated into the language, making it more amenable to functional programming practices.

### Core Concepts of Functional Programming in Java

- **First-Class Citizens**: Functions in functional programming are treated as first-class citizens, meaning they can be passed as arguments to other functions, returned as values from other functions, and assigned to variables. This is facilitated in Java by the introduction of functional interfaces and lambda expressions.

- **Pure Functions**: Pure functions are functions that given the same input, will always return the same output and do not have any observable side effects. This property makes pure functions predictable and easier to reason about.

- **Immutability**: Immutability is a principle where once a value is created, it cannot be changed. This leads to safer code as there's no risk of unexpected modifications to data.

- **Function Composition**: Function composition is the process of combining two or more functions to produce a new function. This is a powerful concept that allows for the creation of complex behaviors from simpler ones.

- **Recursion**: Recursion is a technique where a function calls itself to solve a problem. It's a fundamental concept in functional programming and is often used in place of loops for iterative processes.

- **Currying**: Currying is a technique where a function with multiple arguments is transformed into a sequence of functions, each with a single argument. This can simplify the use of complex functions and make them more reusable.

### Practical Application in Java

Java 8 introduced several functional programming constructs, including:

- **Lambda Expressions**: A concise way to represent instances of single-method interfaces, such as `Consumer`, `Supplier`, `Function`, etc.

- **Functional Interfaces**: Interfaces with a single abstract method, designed to represent operations that can be applied to a single input and produce a result.

- **Streams**: A sequence of elements supporting sequential and parallel aggregate operations. Streams can be processed in parallel, making them efficient for processing large datasets.

- **Optional**: A container object that may or may not contain a non-null value, used to represent nullable object references.

### Example: Using `Consumer` Interface with Lambda Expressions

```java
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    
    Consumer<Integer> printNumber = n -> System.out.println(n);
    numbers.forEach(printNumber);
  }
}
```

In this example, a lambda expression is used to define a `Consumer` that prints a number. This `Consumer` is then applied to each element in an `ArrayList` using the `forEach` method, demonstrating the use of functional programming concepts in Java.

Functional programming in Java offers a different approach to solving problems, emphasizing immutability, pure functions, and the composition of functions. By adopting these principles, developers can write more concise, readable, and maintainable code.

Citations:
[1] https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/
[2] https://www.baeldung.com/java-functional-programming
[3] https://www.tutorialspoint.com/functional_programming_with_java/index.htm
[4] https://www.freecodecamp.org/news/functional-programming-in-java/
[5] https://www.scaler.com/topics/java/functional-programming-in-java/
[6] https://jenkov.com/tutorials/java-functional-programming/index.html
[7] https://medium.com/@astontechnologies/functional-programming-in-java-114cc4eb2f4
[8] https://www.amazon.com/Functional-Programming-Java-functional-techniques/dp/1617292737
