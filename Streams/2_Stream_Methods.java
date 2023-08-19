Sure, here are some commonly used methods available in the Java Stream API, along with brief explanations and examples of how they can be used:

**Intermediate Operations:**

1. **`filter(Predicate<T> predicate)`:**
   Returns a new stream containing elements that satisfy the given predicate.

   ```java
   List<Integer> evenNumbers = numbers.stream()
       .filter(n -> n % 2 == 0)
       .collect(Collectors.toList());
   ```

2. **`map(Function<T, R> mapper)`:**
   Transforms each element of the stream using the given mapper function.

   ```java
   List<String> upperCaseNames = names.stream()
       .map(String::toUpperCase)
       .collect(Collectors.toList());
   ```

3. **`flatMap(Function<T, Stream<R>> mapper)`:**
   Flattens nested streams into a single stream.

   ```java
   List<String> words = List.of("Hello", "World");
   List<String> letters = words.stream()
       .flatMap(word -> Stream.of(word.split("")))
       .collect(Collectors.toList());
   ```

4. **`distinct()`:**
   Returns a stream of distinct elements based on their `equals` method.

   ```java
   List<Integer> distinctNumbers = numbers.stream()
       .distinct()
       .collect(Collectors.toList());
   ```

5. **`sorted()`:**
   Returns a stream of elements sorted in natural order.

   ```java
   List<Integer> sortedNumbers = numbers.stream()
       .sorted()
       .collect(Collectors.toList());
   ```

**Terminal Operations:**

1. **`forEach(Consumer<T> action)`:**
   Performs an action on each element of the stream.

   ```java
   names.stream()
       .forEach(System.out::println);
   ```

2. **`collect(Collector<T, A, R> collector)`:**
   Performs a mutable reduction operation and collects elements into a collection.

   ```java
   List<Integer> evenNumbers = numbers.stream()
       .filter(n -> n % 2 == 0)
       .collect(Collectors.toList());
   ```

3. **`count()`:**
   Returns the count of elements in the stream.

   ```java
   long count = numbers.stream()
       .count();
   ```

4. **`anyMatch(Predicate<T> predicate)`:**
   Returns `true` if at least one element matches the given predicate.

   ```java
   boolean hasEven = numbers.stream()
       .anyMatch(n -> n % 2 == 0);
   ```

5. **`allMatch(Predicate<T> predicate)`:**
   Returns `true` if all elements match the given predicate.

   ```java
   boolean allPositive = numbers.stream()
       .allMatch(n -> n > 0);
   ```

6. **`noneMatch(Predicate<T> predicate)`:**
   Returns `true` if no elements match the given predicate.

   ```java
   boolean noneNegative = numbers.stream()
       .noneMatch(n -> n < 0);
   ```

These are just a few examples of the many methods available in the Stream API. They provide powerful tools for working with data in a functional and concise way.


  
