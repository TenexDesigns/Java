Task rejections occur when a thread pool's queue and maximum pool size are both full, and the thread pool cannot accept any more tasks. In such cases, the thread pool must decide how to handle these rejected tasks. This is where the `RejectedExecutionHandler` comes into play.

Here's a breakdown of the components involved and how to use them:

1. **RejectedExecutionHandler:**
   A `RejectedExecutionHandler` is an interface that provides a strategy for handling rejected tasks. It defines a single method `rejectedExecution(Runnable r, ThreadPoolExecutor executor)` that gets called when a task is rejected. The handler can choose to throw an exception, run the task in the caller's thread, discard the task, or take any custom action.

2. **Common Rejection Policies:**
   There are several predefined policies you can choose from:
   - `AbortPolicy`: The default policy. Throws a `RejectedExecutionException` when a task is rejected.
   - `CallerRunsPolicy`: Runs the rejected task in the caller's thread.
   - `DiscardPolicy`: Silently discards the rejected task without any notification.
   - `DiscardOldestPolicy`: Removes the oldest task in the queue and tries to execute the new task.
   
Here's an example that demonstrates how to use a `RejectedExecutionHandler`:

```java
import java.util.concurrent.*;

public class RejectedExecutionExample {
    public static void main(String[] args) {
        int corePoolSize = 2;
        int maxPoolSize = 3;
        long keepAliveTime = 10;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(5); // Bounded queue

        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize, maxPoolSize, keepAliveTime, unit,
                workQueue, handler);

        for (int i = 0; i < 10; i++) {
            Runnable task = () -> {
                System.out.println("Task executed by " + Thread.currentThread().getName());
            };
            executor.submit(task);
        }

        executor.shutdown();
    }
}
```

In this example, a `ThreadPoolExecutor` is created with a bounded queue that can hold up to 5 tasks. The `AbortPolicy` is used as the rejection policy, which means that when the queue is full and the maximum pool size is reached, any further tasks will be rejected with a `RejectedExecutionException`.

You can experiment with different rejection policies and queue types to observe how they affect the behavior of the thread pool when it reaches its capacity. The choice of rejection policy should align with your application's requirements and how you want to handle rejected tasks.




  
