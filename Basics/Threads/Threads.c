/*
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority
    			
    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died
    					
    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”
    						
    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection 
				JVM terminates itself when all user threads (non-daemon threads) finish their execution




---------------------------

In Java, threads are the smallest units of execution that run concurrently within a single process. They allow multiple tasks to be executed in parallel, which can lead to improved performance and responsiveness in multi-core processors. Java provides a rich set of tools and APIs for working with threads through the `java.lang.Thread` class and the `java.util.concurrent` package.

Here's an overview of working with threads in Java:

1. **Creating Threads:**
   You can create threads in Java by either extending the `Thread` class or implementing the `Runnable` interface.

   ```java
   // Extending Thread class
   class MyThread extends Thread {
       public void run() {
           // Code to be executed in the thread
       }
   }

   // Implementing Runnable interface
   class MyRunnable implements Runnable {
       public void run() {
           // Code to be executed in the thread
       }
   }
   ```

2. **Starting Threads:**
   To start a thread, you need to call the `start()` method on the `Thread` object.

   ```java
   Thread thread = new Thread(new MyRunnable());
   thread.start();
   ```

3. **Thread States:**
   Threads in Java have several states, including `NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING`, and `TERMINATED`. You can query a thread's state using the `getState()` method.

4. **Thread Synchronization:**
   When multiple threads access shared resources concurrently, synchronization mechanisms like `synchronized` blocks or methods, as well as locks, are used to ensure data consistency and avoid race conditions.

   ```java
   synchronized void synchronizedMethod() {
       // Critical section protected by synchronization
   }
   ```

5. **Thread Joining:**
   The `join()` method allows a thread to wait for another thread to complete before proceeding. This is useful for coordinating the execution order of threads.

   ```java
   Thread thread1 = new Thread(new MyRunnable());
   Thread thread2 = new Thread(new MyRunnable());

   thread1.start();
   thread1.join();  // Wait for thread1 to complete before starting thread2

   thread2.start();
   ```

6. **Thread Interruption:**
   The `interrupt()` method is used to interrupt a thread's execution. The interrupted thread can check its interrupted status using the `isInterrupted()` method.

   ```java
   Thread thread = new Thread(() -> {
       while (!Thread.currentThread().isInterrupted()) {
           // Code to be executed in the thread
       }
   });

   thread.start();
   thread.interrupt(); // Signal the thread to stop
   ```

7. **Thread Pools:**
   Java's `ExecutorService` and thread pool classes in the `java.util.concurrent` package provide a higher-level way to manage and reuse threads efficiently.

   ```java
   ExecutorService executor = Executors.newFixedThreadPool(5);
   executor.submit(new MyRunnable());
   // ...

   executor.shutdown(); // Shut down the executor
   ```

Java threads are a powerful tool for creating concurrent and parallel programs. However, multi-threaded programming can be complex and may introduce challenges such as race conditions and deadlocks. It's important to use synchronization mechanisms and thread-safe practices to ensure the correctness and reliability of your threaded code.








