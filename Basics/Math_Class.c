The `java.lang.Math` class in Java is a built-in class that provides a set of mathematical operations and functions. It contains various static methods that allow you to perform common mathematical calculations without the need to write the algorithms yourself. The methods provided by the `Math` class are designed to work with primitive numeric data types (`double` and `float`), and they cover a wide range of mathematical operations. Here are some examples of commonly used methods from the `Math` class:

1. **Basic Arithmetic Functions**:

- `int add(int a, int b)`: Returns the sum of two integers.
- `double sqrt(double a)`: Returns the square root of a double value.
- `double pow(double base, double exponent)`: Returns the value of the first argument raised to the power of the second argument.

```java
double result = Math.sqrt(25.0); // Returns 5.0
double squared = Math.pow(2.0, 3.0); // Returns 8.0
```

2. **Trigonometric Functions**:

- `double sin(double a)`: Returns the sine of an angle (in radians).
- `double cos(double a)`: Returns the cosine of an angle (in radians).
- `double tan(double a)`: Returns the tangent of an angle (in radians).

```java
double angle = Math.PI / 6.0; // 30 degrees in radians
double sine = Math.sin(angle); // Returns 0.5
```

3. **Rounding Functions**:

- `double ceil(double a)`: Returns the smallest double value that is greater than or equal to the argument and is equal to a mathematical integer.
- `double floor(double a)`: Returns the largest double value that is less than or equal to the argument and is equal to a mathematical integer.
- `long round(double a)`: Returns the closest long integer to the argument.

```java
double ceilValue = Math.ceil(3.2); // Returns 4.0
double floorValue = Math.floor(3.7); // Returns 3.0
long roundedValue = Math.round(3.5); // Returns 4
```

4. **Constants**:

- `double E`: Euler's number (approximately 2.71828).
- `double PI`: The mathematical constant π (pi, approximately 3.14159).

```java
double circumference = 2 * Math.PI * radius;
```

These are just a few examples of the many methods provided by the `Math` class. The class offers a wide range of mathematical utilities, making it a valuable resource for performing common calculations in your Java programs. To use the methods from the `Math` class, you simply call them using the class name, followed by the method name and its arguments.
