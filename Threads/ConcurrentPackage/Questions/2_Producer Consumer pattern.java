The Producer-Consumer pattern is a classic concurrency pattern where multiple threads, known as producers, generate data and add it to a shared buffer, while other threads, known as consumers, remove and process the data from the buffer. The pattern ensures that producers and consumers work together efficiently without causing deadlocks or resource contention.

Here's how you can implement the Producer-Consumer pattern using the `wait()` and `notify()` methods for synchronization in Java:

```java
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    private static final int CAPACITY = 5;
    private static final Queue<Integer> buffer = new LinkedList<>();
    
    public static void main(String[] args) {
        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                produce(i);
            }
        });
        
        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                consume();
            }
        });
        
        producerThread.start();
        consumerThread.start();
        
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    private static void produce(int item) {
        synchronized (buffer) {
            while (buffer.size() >= CAPACITY) {
                try {
                    buffer.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            
            buffer.add(item);
            System.out.println("Produced: " + item);
            buffer.notifyAll();
        }
    }
    
    private static void consume() {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                try {
                    buffer.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            
            int item = buffer.poll();
            System.out.println("Consumed: " + item);
            buffer.notifyAll();
        }
    }
}
```

In this example:
- The `buffer` represents the shared data structure.
- The `produce()` method adds items to the buffer and notifies waiting consumers.
- The `consume()` method removes items from the buffer and notifies waiting producers.
- The `wait()` method is called within a loop to handle spurious wake-ups.
- The `notifyAll()` method is used to wake up all waiting threads when a change occurs.

Keep in mind that while `wait()` and `notify()` can be used to implement synchronization, modern Java provides more advanced concurrency mechanisms like `Lock` and `Condition` from the `java.util.concurrent` package, which are generally preferred due to their enhanced features and better manageability.




