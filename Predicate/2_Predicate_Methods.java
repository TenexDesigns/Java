The `Predicate` interface in Java defines several methods for working with boolean conditions. Here are the key methods available in the `Predicate` interface:

1. **`test(T t)`:**
   This method takes an argument of type `T` and returns a boolean value indicating whether the condition defined by the predicate holds true for the given input.

2. **`and(Predicate<? super T> other)`:**
   Returns a composed predicate that represents the logical AND operation of the original predicate and another predicate. The resulting predicate will be true only if both predicates are true.

3. **`or(Predicate<? super T> other)`:**
   Returns a composed predicate that represents the logical OR operation of the original predicate and another predicate. The resulting predicate will be true if at least one of the predicates is true.

4. **`negate()`:**
   Returns a predicate that represents the logical negation of the original predicate. In other words, it inverts the condition.

5. **`isEqual(Object targetRef)`:**
   Returns a predicate that tests if the input is equal to the specified object using the `equals` method.

These methods provide various ways to combine, manipulate, and use predicates to create complex boolean conditions for filtering, testing, and more.

Here's an example demonstrating the usage of some of these methods:

```java
import java.util.function.Predicate;

public class PredicateMethodsExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isGreaterThanFive = number -> number > 5;

        // Test the individual predicates
        System.out.println("Is 6 even? " + isEven.test(6));
        System.out.println("Is 6 greater than 5? " + isGreaterThanFive.test(6));

        // Combine predicates using 'and'
        Predicate<Integer> isEvenAndGreaterThanFive = isEven.and(isGreaterThanFive);
        System.out.println("Is 6 even and greater than 5? " + isEvenAndGreaterThanFive.test(6));

        // Combine predicates using 'or'
        Predicate<Integer> isEvenOrGreaterThanFive = isEven.or(isGreaterThanFive);
        System.out.println("Is 3 even or greater than 5? " + isEvenOrGreaterThanFive.test(3));

        // Negate the predicate using 'negate'
        Predicate<Integer> isNotEven = isEven.negate();
        System.out.println("Is 7 not even? " + isNotEven.test(7));
    }
}
```

In this example, you can see how the `and`, `or`, and `negate` methods are used to create composite predicates and modify their behavior.

