Certainly! Here are a few more examples of how functional programming concepts are used with code implementations in Java:

1. **Lazy Evaluation and Infinite Streams:**
   Functional programming allows for lazy evaluation, where computations are postponed until they are actually needed. Java Streams support this concept, allowing you to work with infinite streams efficiently. Here's an example using an infinite stream of Fibonacci numbers:

   ```java
   Stream<Integer> fibonacci = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
       .map(arr -> arr[0]);

   List<Integer> firstTenFibonacci = fibonacci.limit(10).collect(Collectors.toList());
   System.out.println(firstTenFibonacci);
   ```

2. **Optional and Avoiding Null Checks:**
   Functional programming encourages the use of `Optional` to handle the absence of values, helping to avoid null pointer exceptions. Here's an example:

   ```java
   Optional<String> maybeName = Optional.ofNullable(getNameFromDatabase());

   String upperCaseName = maybeName.map(String::toUpperCase).orElse("Unknown");
   System.out.println(upperCaseName);
   ```

3. **Functional Interfaces and Custom Lambdas:**
   You can create custom functional interfaces and use them to define lambda expressions for specific use cases. Here's an example of defining and using a custom functional interface:

   ```java
   @FunctionalInterface
   interface MathOperation {
       int operate(int a, int b);
   }

   public static void main(String[] args) {
       MathOperation add = (a, b) -> a + b;
       MathOperation multiply = (a, b) -> a * b;

       int result1 = calculate(5, 3, add);
       int result2 = calculate(5, 3, multiply);

       System.out.println("Addition: " + result1);
       System.out.println("Multiplication: " + result2);
   }

   private static int calculate(int a, int b, MathOperation operation) {
       return operation.operate(a, b);
   }
   ```

4. **Currying and Partial Function Application:**
   Currying involves breaking down functions that take multiple arguments into a series of functions that each take a single argument. While Java doesn't directly support currying, you can achieve a similar effect using partial function application. Here's a basic example:

   ```java
   Function<Integer, Function<Integer, Integer>> curriedAdd = a -> b -> a + b;

   Function<Integer, Integer> addFive = curriedAdd.apply(5);
   int result = addFive.apply(3); // 5 + 3
   System.out.println("Curried addition result: " + result);
   ```

These examples illustrate various ways functional programming concepts can be applied in Java to enhance code readability, maintainability, and expressiveness. Functional programming helps you write code that is more focused on the "what" rather than the "how" of a computation.


