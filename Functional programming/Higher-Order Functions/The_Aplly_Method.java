Apologies for any confusion. I'll clarify the source of the `apply` method in the context you provided.

In the code snippet you provided:

```java
static Function<Double, Double> powerFunction(double exponent) {
    return base -> Math.pow(base, exponent);
}
```

Here's how it works:

1. The method `powerFunction` is defined as a higher-order function that takes a `double` exponent as an argument.
2. Inside the `powerFunction`, a lambda expression is returned. This lambda expression represents a function that takes a `double` value (`base`) and calculates the power using the given `exponent`.

In this specific case, `apply` is a method defined by the `Function` interface. When you return the lambda expression from `powerFunction`, you are effectively returning an instance of the `Function` interface. This returned function can then be used to apply the power calculation to different `base` values.

In the code snippets:

```java
Function<Double, Double> squareFunction = powerFunction(2);
Function<Double, Double> cubeFunction = powerFunction(3);

System.out.println(squareFunction.apply(3.0)); // 9.0
System.out.println(cubeFunction.apply(2.0));   // 8.0
```

- `squareFunction` and `cubeFunction` are instances of the `Function` interface that were created by calling `powerFunction` with different exponents.
- The `apply` method is called on these instances to apply the power calculation to the provided `base` values (`3.0` and `2.0` respectively).

In summary, the `apply` method is part of the `Function` interface, and you use it to apply the function to specific input values. In the context of your example, the `apply` method is used to perform the power calculation using the provided `base` value and the fixed `exponent`.
