Certainly! Here's how you can use code samples to explain each of the points you mentioned:

**1. Creating Optional Objects:**

- `Optional.of(value)` creates an `Optional` instance with the given non-null value:
```java
Optional<String> optionalWithValue = Optional.of("Hello");
```

- `Optional.ofNullable(value)` creates an `Optional` instance with the given value (which can be null):
```java
String nullableValue = null;
Optional<String> optionalWithNullableValue = Optional.ofNullable(nullableValue);
```

**2. Methods Available in Optional:**

- `isPresent()` returns true if a value is present, false otherwise:
```java
Optional<String> optionalName = Optional.of("Alice");
boolean isPresent = optionalName.isPresent(); // true
```

- `ifPresent(Consumer<T> consumer)` executes the given consumer if a value is present:
```java
optionalName.ifPresent(name -> System.out.println("Name: " + name));
```

- `orElse(T other)` returns the value if present, otherwise returns the provided default value:
```java
String name = optionalName.orElse("Unknown");
```

- `orElseGet(Supplier<? extends T> supplier)` returns the value if present, otherwise invokes the supplier to get a default value:
```java
String name = optionalName.orElseGet(() -> getDefaultValue());
```

- `orElseThrow(Supplier<? extends X> exceptionSupplier)` returns the value if present, otherwise throws the exception provided by the supplier:
```java
String name = optionalName.orElseThrow(() -> new NoSuchElementException("Name not found"));
```

- `map(Function<? super T, ? extends U> mapper)` applies the given mapper function to the value if present and returns an `Optional` with the result:
```java
Optional<Integer> optionalLength = optionalName.map(String::length);
```

- `flatMap(Function<? super T, Optional<U>> mapper)` applies the given mapper function to the value if present and returns the result as an `Optional`:
```java
Optional<Integer> optionalSquaredLength = optionalName.flatMap(name -> Optional.of(name.length() * name.length()));
```

- `filter(Predicate<? super T> predicate)` returns an `Optional` with the value if it satisfies the given predicate, otherwise returns an empty `Optional`:
```java
Optional<String> optionalFiltered = optionalName.filter(name -> name.length() > 5);
```

These examples demonstrate how to use each of the mentioned methods on the `Optional` class with code samples.





  
