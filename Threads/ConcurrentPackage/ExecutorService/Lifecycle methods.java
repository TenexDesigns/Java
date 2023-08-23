Lifecycle methods, such as `shutdown()` and `shutdownNow()`, are used to manage the state of an `ExecutorService` or a thread pool. These methods allow you to gracefully shut down the thread pool, ensuring that running tasks are allowed to complete, and threads are terminated properly.

Here's an explanation of these methods and how they are used:

1. **shutdown():**
   - The `shutdown()` method initiates an orderly shutdown of the `ExecutorService`.
   - It stops accepting new tasks, but allows already submitted tasks to complete their execution.
   - After all tasks have completed, the underlying threads in the thread pool are terminated, and the resources associated with the thread pool are released.

Example usage:

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            Runnable task = () -> {
                // Task logic
            };
            executor.submit(task);
        }

        executor.shutdown(); // Initiates orderly shutdown

        // Wait for termination (optional)
        while (!executor.isTerminated()) {
            // Wait until all tasks are completed
        }

        System.out.println("All tasks have completed. Executor shutdown.");
    }
}
```

In this example, the `shutdown()` method is called on the `ExecutorService`. The loop waits for all tasks to complete before printing the final message.

2. **shutdownNow():**
   - The `shutdownNow()` method attempts to stop all actively executing tasks, halts the processing of waiting tasks, and returns a list of tasks that were waiting to be executed.
   - It provides a way to quickly shut down the thread pool, but it may not guarantee that all tasks will be terminated immediately.

Example usage:

```java
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownNowExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            Runnable task = () -> {
                // Task logic
            };
            executor.submit(task);
        }

        List<Runnable> remainingTasks = executor.shutdownNow(); // Attempts to stop tasks

        // Handle remaining tasks if needed

        System.out.println("Executor shutdown. Remaining tasks: " + remainingTasks.size());
    }
}
```

In this example, the `shutdownNow()` method is called on the `ExecutorService`, attempting to stop tasks. The list of remaining tasks is obtained, and you can decide how to handle them.

Remember that using these lifecycle methods is important to ensure proper cleanup of resources and threads associated with the thread pool. Choose the appropriate method based on your requirements and how you want to handle ongoing tasks.




