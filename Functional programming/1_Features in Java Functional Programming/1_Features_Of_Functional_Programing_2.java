Certainly! Let's go through each of these concepts with code examples:

**1. Immutable Data:**
Immutable data means that once a data structure is created, its values cannot be changed. In functional programming, you create new instances when you need to modify data instead of changing existing ones. This avoids shared state and makes the program more predictable.

```java
public class ImmutableExample {
    public static void main(String[] args) {
        String original = "Hello";
        String modified = original.concat(", World"); // Creates a new string

        System.out.println(original);   // Prints "Hello"
        System.out.println(modified);   // Prints "Hello, World"
    }
}
```

**2. Higher-Order Functions:**
Higher-order functions are functions that can accept other functions as arguments or return functions as results. They enable you to abstract and compose behavior.

```java
import java.util.function.Function;

public class HigherOrderExample {
    public static void main(String[] args) {
        Function<Integer, Integer> add = x -> x + 2;
        Function<Integer, Integer> multiply = x -> x * 3;

        // Compose functions
        Function<Integer, Integer> combined = add.andThen(multiply);

        int result = combined.apply(5); // 5 + 2 = 7, 7 * 3 = 21
        System.out.println(result);
    }
}
```

**3. Lambda Expressions:**
Lambda expressions provide a concise way to create anonymous functions. They are used to pass behavior to methods, interfaces, or functional interfaces.

```java
public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();
    }
}
```

**4. Functional Interfaces:**
Functional interfaces are interfaces with a single abstract method. They can be implemented using lambda expressions or method references. Java provides built-in functional interfaces like `Function`, `Predicate`, and `Consumer`.

```java
import java.util.function.Predicate;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        boolean result = isEven.test(4); // Returns true
        System.out.println(result);
    }
}
```

**5. Streams:**
Streams API allows you to perform functional-style operations on collections and other data structures. You can use operations like `map`, `filter`, and `reduce` to process data in a declarative manner.

```java
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> doubledNumbers = numbers.stream()
            .map(n -> n * 2)
            .collect(Collectors.toList());

        System.out.println(doubledNumbers); // [2, 4, 6, 8, 10]
    }
}
```

**6. Method References:**
Method references allow you to reference methods as if they were lambda expressions. They enhance code readability by providing a way to directly reference existing methods.

```java
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry");

        // Using method reference
        fruits.forEach(System.out::println);
    }
}
```

These concepts collectively contribute to the functional programming paradigm, which encourages code that is more concise, modular, and easier to maintain.

