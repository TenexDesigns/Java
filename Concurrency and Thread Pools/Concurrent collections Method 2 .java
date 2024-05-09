Concurrent collections in Java, such as `ConcurrentHashMap`, `CopyOnWriteArrayList`, and `BlockingQueue`, are designed to handle concurrent access by multiple threads, simplifying concurrent programming by automatically managing synchronization. These collections are particularly useful in scenarios where multiple threads need to read and write to a shared data structure simultaneously.

### Using ConcurrentHashMap

`ConcurrentHashMap` is a thread-safe implementation of the `Map` interface. It allows concurrent reads and writes without the need for explicit synchronization.

```java
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding elements
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Reading elements
        System.out.println(map.get("One")); // Output: 1

        // Updating elements
        map.put("One", 11); // No need for synchronization

        // Iterating over elements
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
```

### Using CopyOnWriteArrayList

`CopyOnWriteArrayList` is a thread-safe variant of `ArrayList` in which all mutative operations (`add`, `set`, and so on) are implemented by making a fresh copy of the underlying array. This is very useful when you have a read-heavy workload.

```java
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("Element1");
        list.add("Element2");

        // Reading elements
        System.out.println(list.get(0)); // Output: Element1

        // Updating elements
        list.set(0, "UpdatedElement1"); // No need for synchronization

        // Iterating over elements
        for (String element : list) {
            System.out.println(element);
        }
    }
}
```

### Using BlockingQueue

`BlockingQueue` is a queue that supports operations that wait for the queue to become non-empty when retrieving and removing an element, and wait for space to become available in the queue when storing an element.

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);

        // Producing elements
        new Thread(() -> {
            try {
                queue.put(1);
                queue.put(2);
                queue.put(3); // This will block until there is space available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Consuming elements
        new Thread(() -> {
            try {
                System.out.println(queue.take()); // Output: 1
                System.out.println(queue.take()); // Output: 2
                System.out.println(queue.take()); // Output: 3
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
```

These examples demonstrate how to use concurrent collections in Java to handle concurrent access safely and efficiently.

Citations:
[1] https://github.com/eh3rrera/ocpj8-notes/blob/master/10-Java-Concurrency/4-Use-java.util.concurrent-collections-and-classes-including-CyclicBarrier-and-CopyOnWriteArrayList.md
[2] https://webdisk.codejava.net/java-core/concurrency/java-concurrent-collection-copyonwritearraylist-examples
[3] https://stackoverflow.com/questions/8203864/choosing-the-best-concurrency-list-in-java
[4] https://medium.com/coding-corpus/concurrent-collections-in-java-9b131e41b3ad
[5] https://www.linkedin.com/pulse/overview-concurrent-collections-diego-cardoso-de-melo-6uq6e
[6] https://stackoverflow.com/questions/20945984/is-there-blockingmap-as-blockingqueue-in-java
[7] https://www.geeksforgeeks.org/blockingqueue-interface-in-java/
[8] https://javarevisited.blogspot.com/2013/02/concurrent-collections-from-jdk-56-java-example-tutorial.html
[9] https://users.cs.jmu.edu/bernstdh/web/common/lectures/summary_collections_concurrent.php
[10] https://blog.devgenius.io/copyonwritearraylist-concurrenthashmap-in-java-ac52bdcdc433
