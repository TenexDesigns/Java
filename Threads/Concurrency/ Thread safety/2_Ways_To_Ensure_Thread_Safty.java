There are several ways to ensure thread safety in Java by preventing data corruption and race conditions when multiple threads access shared resources. Here are some common techniques, along with code samples:

1. **Synchronized Methods:**
   By using the `synchronized` keyword, you can ensure that only one thread can execute the synchronized method at a time.

```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
```

2. **Synchronized Blocks:**
   You can use synchronized blocks to control access to specific sections of code rather than entire methods.

```java
class Counter {
    private int count = 0;
    private final Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}
```

3. **ReentrantLock:**
   The `ReentrantLock` class provides a more flexible alternative to synchronized methods and blocks.

```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }
}
```

4. **Atomic Classes:**
   Java provides atomic classes like `AtomicInteger` that allow for thread-safe updates without explicit synchronization.

```java
import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
```

5. **ThreadLocal:**
   If each thread requires its own instance of a variable, you can use `ThreadLocal` to ensure thread safety.

```java
class ThreadLocalExample {
    private ThreadLocal<Integer> threadLocalCount = ThreadLocal.withInitial(() -> 0);

    public void increment() {
        int currentCount = threadLocalCount.get();
        threadLocalCount.set(currentCount + 1);
    }

    public int getCount() {
        return threadLocalCount.get();
    }
}
```

6. **Immutable Data:**
   Using immutable data structures ensures that data can't be modified after creation, eliminating the need for synchronization.

```java
class ImmutableCounter {
    private final int count;

    public ImmutableCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
```

7. **Concurrent Collections:**
   Java provides thread-safe collections like `ConcurrentHashMap` and `CopyOnWriteArrayList` that can be used to avoid synchronization in certain scenarios.

It's important to choose the appropriate synchronization method based on your specific use case. Over-synchronizing can lead to performance issues, and choosing the wrong synchronization method can result in deadlocks or other concurrency problems. Always thoroughly test your code to ensure thread safety and correctness.


