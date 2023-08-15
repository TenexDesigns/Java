Functional programming (FP) is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing-state and mutable data. It is a declarative type of programming style that focuses on what to solve rather than how to solve (procedural). The main target of functional programming is to make the code more efficient, concise, predictable, and easier to test and debug [Source 0](https://www.baeldung.com/java-functional-programming), [Source 1](https://www.freecodecamp.org/news/functional-programming-in-java/), [Source 2](https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/).

Java started supporting functional programming from Java 8 onwards. It introduced new packages (java.util.function), new syntax (Lambda Expressions and Method References), and new libraries (Streams API) that made Java capable of doing functional programming [Source 0](https://www.baeldung.com/java-functional-programming), [Source 1](https://www.freecodecamp.org/news/functional-programming-in-java/).

Key features of functional programming in Java include:

1. **Pure Functions**: A function is called pure function if it always returns the same result for same argument values and it has no side effects like modifying an argument (or global variable) or outputting something. The output of a function depends only on its input.

```java
// Pure function
public int add(int a, int b) {
    return a + b;
}
```

2. **Immutability**: Immutable data or state cannot be changed once it is created. This leads to safer and more predictable code.

```java
final String greeting = "Hello, World!";
```

3. **Higher-Order Functions**: Higher-order functions either accept functions as parameters or return a function, or both. They are a fundamental part of functional programming.

```java
// Higher-order function
public Function<String, String> greet(String greeting) {
    return (name) -> greeting + " " + name;
}

Function<String, String> greeter = greet("Hello");
System.out.println(greeter.apply("World")); // prints "Hello World"
```

4. **Lambda Expressions**: Lambda expressions are anonymous functions which you can use to create delegates or expression tree types. It simplifies the creation of functions.

```java
// Lambda expression
BinaryOperator<Integer> add = (a, b) -> a + b;
```

Java functional programming can be used in various scenarios where you need to process data, manipulate collections, handle events, etc. It is especially useful when you need to perform complex operations on collections such as filtering, mapping, or reducing. The Stream API in Java 8 provides a set of higher-order functions (like `filter`, `map`, `reduce`) that work well with lambda expressions and enable you to process data in a declarative way [Source 0](https://www.baeldung.com/java-functional-programming), [Source 1](https://www.freecodecamp.org/news/functional-programming-in-java/), [Source 2](https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/).

For instance, you can use the Stream API to filter a list of numbers and find the maximum value:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Optional<Integer> max = numbers.stream()
    .filter(n -> n % 2 == 0)
    .max(Integer::compareTo);
System.out.println(max.get()); // prints 10
```

In this example, the `filter` method is used to filter out odd numbers, and the `max` method is used to find the maximum value. Both these methods are higher-order functions that take a function as an argument (`n -> n % 2 == 0` and `Integer::compareTo` are lambda expressions).


