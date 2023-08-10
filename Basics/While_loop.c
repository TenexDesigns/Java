In Java, the `while` loop is a control structure that allows you to repeatedly execute a block of code as long as a specified condition is `true`. The syntax of a `while` loop is as follows:

```java
while (condition) {
    // Code to be executed while the condition is true
}
```

Here's an example of using a `while` loop to print numbers from 1 to 5:

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

In this example, the loop will continue to execute as long as the condition `i <= 5` is `true`. The value of `i` is initially set to 1, and with each iteration, it is incremented by 1 using `i++`.

It's important to ensure that the condition inside the `while` loop will eventually become `false` to prevent an infinite loop. If the condition is always `true` and doesn't change within the loop, the loop will continue running indefinitely.

Here's another example that uses a `while` loop to calculate the sum of numbers from 1 to 10:

```java
int sum = 0;
int number = 1;

while (number <= 10) {
    sum += number;
    number++;
}

System.out.println("Sum of numbers from 1 to 10: " + sum);
```

In this example, the loop iterates through the numbers from 1 to 10, adding each number to the `sum` variable. The loop continues until `number` exceeds 10.

`while` loops are useful when you don't know the exact number of iterations beforehand and need to repeatedly execute code based on a changing condition. Just be careful to ensure that the condition eventually becomes `false` to avoid infinite loops.
