Yes, Java has a `switch` statement that allows you to execute different blocks of code based on the value of an expression. The `switch` statement is useful when you have a single expression with multiple possible values and you want to take different actions for each value. Here's the basic syntax of the `switch` statement:

```java
switch (expression) {
    case value1:
        // Code to execute if expression matches value1
        break;
    case value2:
        // Code to execute if expression matches value2
        break;
    // More case statements...
    default:
        // Code to execute if none of the cases match
}
```

Here are a few examples of how you can use the `switch` statement in Java:

1. **Basic `switch` Statement**:

```java
int dayOfWeek = 3;

switch (dayOfWeek) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    // More case statements...
    default:
        System.out.println("Invalid day");
}
```

2. **Switch with String Values (Java 7+)**:

```java
String fruit = "apple";

switch (fruit) {
    case "apple":
        System.out.println("It's an apple.");
        break;
    case "banana":
        System.out.println("It's a banana.");
        break;
    // More case statements...
    default:
        System.out.println("Unknown fruit.");
}
```

3. **Multiple Cases without `break` (Falling Through)**:

```java
int number = 2;

switch (number) {
    case 1:
    case 3:
    case 5:
        System.out.println("Odd number");
        break;
    case 2:
    case 4:
        System.out.println("Even number");
        break;
    default:
        System.out.println("Unknown number");
}
```

The `switch` statement evaluates the expression and compares it to the values specified in the `case` labels. If a match is found, the corresponding block of code is executed. The `break` statement is used to exit the `switch` statement after a case is executed. If `break` is omitted, the execution will "fall through" to subsequent cases until a `break` is encountered or the end of the `switch` statement is reached.

Javas `switch` statement is a concise way to handle multiple conditions and is especially useful when you have a limited set of possible values for the expression.

