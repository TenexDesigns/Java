Creating ten threads to run a print method of one class involves both parallelism and concurrency:

1. **Concurrency:** Each thread is performing its own independent task, which in this case is invoking the `print` method of the class. Concurrency refers to the ability of a system to manage multiple tasks and execute them in overlapping time periods, allowing the appearance of simultaneous execution even though only one task is executing at any given moment. In this scenario, the threads are likely to interleave their execution, taking turns to execute the `print` method.

2. **Parallelism:** If these threads are running on a multicore or multi-processor system and are truly executing simultaneously (each thread on its own core/processor), then this would also involve parallelism. Parallelism refers to the simultaneous execution of multiple tasks to improve throughput and performance.

In summary, creating ten threads to run a print method involves both concurrency (because the threads are interleaved in their execution) and potentially parallelism (if the system has the resources to run them on separate cores/processors simultaneously).




InterLeaved
-----------------------------------------------------------------

  When we say that threads are "interleaved in their execution," we mean that the execution of multiple threads alternates or mixes together in a way that gives the illusion of simultaneous execution, even though only one thread is executing at any given instant.

In a multithreaded environment, multiple threads are executing concurrently, but due to the time-sharing nature of the CPU and the way threads are scheduled, they take turns executing their instructions. This interleaving of execution means that different threads execute a sequence of their own instructions, pause, and then let other threads execute their instructions. This can happen very quickly, giving the impression that the threads are executing simultaneously.

For example, consider two threads, Thread A and Thread B, each with a simple task to print numbers:

Thread A: Print 1, Print 2, Print 3, ...
Thread B: Print A, Print B, Print C, ...

If the threads are interleaved in their execution, the output might look something like:

```
1 A 2 B 3 C 4 5 D 6 ...
```

In this interleaved pattern, each thread is executing a small portion of its work before the CPU switches to another thread. The interleaving can vary depending on factors like thread scheduling, thread priorities, and the system's architecture.

Interleaved execution is a fundamental aspect of concurrent programming, and understanding how threads interact and share resources during interleaved execution is important for designing correct and efficient multithreaded applications.
  
