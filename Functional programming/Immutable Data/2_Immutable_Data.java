1. Immutable Data:
Immutable data means that once a data structure is created, its values cannot be changed. In functional programming, you create new instances when you need to modify data instead of changing existing ones. This avoids shared state and makes the program more predictable.

java
Copy code
public class ImmutableExample {
    public static void main(String[] args) {
        String original = "Hello";
        String modified = original.concat(", World"); // Creates a new string

        System.out.println(original);   // Prints "Hello"
        System.out.println(modified);   // Prints "Hello, World"
    }
}
