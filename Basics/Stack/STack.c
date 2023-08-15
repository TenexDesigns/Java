In Java, a `Stack` is a data structure that follows the Last-In-First-Out (LIFO) principle, which means that the last element added to the stack will be the first one to be removed. The `Stack` class is part of the Java Collections Framework and provides methods for pushing (adding) and popping (removing) elements from the stack. However, it's recommended to use the `Deque` interface and its implementing class `ArrayDeque` for stack operations since `Deque` provides more flexibility.

Here's how you can use a `Deque` (or `Stack`) in Java:

**Using Deque (Recommended):**

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1); // Pushing elements onto the stack
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); // Peek at the top element (3)
        
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Popping elements from the stack (3, 2, 1)
        }
    }
}
```

**Using Stack (Deprecated, not recommended):**

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
```

Please note that while the `Stack` class can still be used, it's marked as "legacy" and "deprecated" in favor of using the `Deque` interface and its implementing classes (`ArrayDeque`) for stack-like operations. The `Deque` interface allows you to use the stack behavior while also offering more general queue-like behavior when needed. Using `ArrayDeque` as a stack provides better performance in most cases.

In both examples, the `push()` method is used to add elements to the top of the stack, the `peek()` method retrieves the top element without removing it, and the `pop()` method removes and returns the top element from the stack. The `isEmpty()` method checks if the stack is empty.



