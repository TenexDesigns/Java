# Java Stream Methods

Streams in Java were introduced in Java 8. They are not data structures but wrappers around a data source, allowing operations on that data source. They do not change the original data structure but provide a result as per the pipelined methods[^0^][^3^].

## Stream Creation

You can create a Stream from a collection, an array, or I/O channels[^3^]. For instance, you can create a Stream of integers as follows:

```java
Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
stream.forEach(p -> System.out.println(p));
```

## Intermediate Operations

Intermediate operations in Java Streams return another Stream as a result. This allows operations to be chained or pipelined[^1^][^10^].

### map

The `map` operation applies a given function to each element in the Stream and returns a new Stream with the transformed elements[^23^].

```java
Stream<String> names = Stream.of("John", "Peter", "Susan");
Stream<String> upperCaseNames = names.map(String::toUpperCase);
upperCaseNames.forEach(System.out::println); // JOHN PETER SUSAN
```

### filter

The `filter` operation applies a predicate to each element in the Stream and returns a new Stream that includes only elements that satisfy the predicate[^23^].

```java
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
Stream<Integer> evenNumbers = numbers.filter(n -> n % 2 == 0);
evenNumbers.forEach(System.out::println); // 2 4
```

## Terminal Operations

Terminal operations in Java Streams produce a non-stream result such as a primitive value, a collection, or no value at all[^23^].

### collect

The `collect` operation is used to receive elements from a Stream and store them in a collection[^23^].

```java
Stream<String> names = Stream.of("John", "Peter", "Susan");
List<String> list = names.collect(Collectors.toList());
System.out.println(list); // [John, Peter, Susan]
```

### forEach

The `forEach` operation is used to iterate over each element of the Stream[^11^].

```java
Stream<String> names = Stream.of("John", "Peter", "Susan");
names.forEach(System.out::println);
```

## Method Chaining

In Java Streams, most operations return a Stream, allowing operations to be chained. This is known as method chaining or stream pipelining[^1^][^14^].

Here is an example of method chaining with Streams:

```java
Stream.of("John", "Peter", "Susan")
    .map(String::toUpperCase)
    .filter(s -> s.startsWith("J"))
    .forEach(System.out::println); // JOHN
```

The Java Stream API has many methods that can be used to perform operations on data. The methods can be classified into two main categories: intermediate operations and terminal operations. Intermediate operations return a new Stream, allowing operations to be chained, while terminal operations produce a non-stream result, marking the end of the stream[^1^][^2^][^9^].

Here are more methods in the Java Stream API:

## Intermediate Operations

### sorted

The `sorted` operation returns a Stream consisting of the elements of the original Stream, sorted according to natural order. If the elements of this stream are not Comparable, a `java.lang.ClassCastException` may be thrown when the terminal operation is executed.

```java
Stream<String> names = Stream.of("John", "Peter", "Susan");
Stream<String> sortedNames = names.sorted();
sortedNames.forEach(System.out::println); // John Peter Susan
```

### distinct

The `distinct` operation returns a Stream consisting of the distinct elements of the original Stream[^1^].

```java
Stream<Integer> numbers = Stream.of(1, 2, 2, 3, 3, 3);
Stream<Integer> distinctNumbers = numbers.distinct();
distinctNumbers.forEach(System.out::println); // 1 2 3
```

### limit

The `limit` operation returns a Stream consisting of the elements of the original Stream, truncated to be no longer than a specified length[^1^].

```java
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
Stream<Integer> limitedNumbers = numbers.limit(3);
limitedNumbers.forEach(System.out::println); // 1 2 3
```

## Terminal Operations

### reduce

The `reduce` operation combines the elements of a stream into a single result[^1^].

```java
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
Optional<Integer> sum = numbers.reduce(Integer::sum);
sum.ifPresent(System.out::println); // 15
```

### anyMatch, allMatch, noneMatch

These operations return a boolean indicating whether any elements, all elements, or no elements of the Stream match the given predicate, respectively[^1^].

```java
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
boolean anyMatch = numbers.anyMatch(n -> n > 4); // true
boolean allMatch = numbers.allMatch(n -> n > 0); // true
boolean noneMatch = numbers.noneMatch(n -> n < 0); // true
```

### count

The `count` operation returns the count of elements in the Stream[^1^].

```java
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
long count = numbers.count(); // 5
```

### min and max

These operations return the smallest and largest element of a Stream, respectively, according to a comparator[^1^].

```java
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
Optional<Integer> min = numbers.min(Integer::compare);
Optional<Integer> max = numbers.max(Integer::compare);
min.ifPresent(System.out::println); // 1
max.ifPresent(System.out::println); // 5
```

Sources: [^1^](https://howtodoinjava.com/java/stream/java-streams-by-examples/), [^2^](https://stackify.com/streams-guide-java-8/), [^9^](https://www.javatpoint.com/java-8-stream)

In the above example, we create a Stream of names, transform each name to upper case, filter names that start with "J", and finally print each remaining name.

Sources: [^0^](https://stackify.com/streams-guide-java-8/), [^1^](https://howtodoinjava.com/java/stream/java-streams-by-examples/), [^3^](https://www.geeksforgeeks.org/stream-in-java/), [^10^](https://www.geeksforgeeks.org/intermediate-methods-of-stream-in-java/), [^11^](https://www.educba.com/java-8-stream/), [^14^](https://www.geeksforgeeks.org/method-chaining-in-java-with-examples/), [^23^](https://www.tutorialspoint.com/intermediate-methods-of-stream-in-java/)





               
