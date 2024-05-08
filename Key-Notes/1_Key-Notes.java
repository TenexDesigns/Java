

1-------> IF YOU DONT WANT A CLASS TO BE INHERITED
-------------------------------------------------------------------------------------------------------------------------------------------------------------
  The final Keyword
If you don't want other classes to inherit from a class, use the final keyword:

If you try to access a final class, Java will generate an error:

final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
The output will be something like this:
IF YOU DONT WANT A CLASS TO BE INHERITED

-------------------------------------------------------------------------------------------------------------------------------------------------------------










2-POLYMORPHIS - OVERIDING AND OVERLOADING
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Polymorphism and overriding are related concepts in Java, but they are not exactly the same.

1. **Polymorphism**:
   - Polymorphism refers to the ability of an object to take on multiple forms.
   - In Java, polymorphism can be achieved through method overriding and method overloading.
   - Method overriding, which involves redefining a method in a subclass that is already defined in its superclass, enables polymorphic behavior.

2. **Method Overriding**:
   - Method overriding occurs when a subclass provides a specific implementation of a method that is already provided by its superclass.
   - In method overriding, the signature of the method remains the same in both the superclass and the subclass, but the implementation in the subclass overrides the implementation in the superclass.

In the provided code example:

- The `animalSound()` method is defined in the `Animal` class.
- Both the `Pig` and `Dog` classes override the `animalSound()` method from the `Animal` class with their specific implementations.
- When objects of type `Animal`, `Pig`, and `Dog` are created and their `animalSound()` methods are called, the specific implementations of the `animalSound()` method in the respective subclass are invoked, demonstrating polymorphic behavior.

So, in summary, while method overriding is a way to achieve polymorphism in Java, they are not the same concept. Polymorphism is the broader concept, and method overriding is one way to achieve it.




Overloading and overriding are two important concepts in object-oriented programming, especially in Java. They involve defining methods with the same name but different signatures and behaviors. Let's delve into each concept:

1. **Method Overloading**:
   - Method overloading refers to the ability to define multiple methods in a class with the same name but different parameter lists.
   - In Java, method overloading allows you to create methods with the same name but different numbers or types of parameters.
   - Method overloading is resolved at compile time based on the method signature.
   - There's no specific keyword required to implement method overloading. It's achieved by defining multiple methods with the same name but different parameters.

Here's a simple example of method overloading:

```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

In this example, the `add` method is overloaded with two versions, one for integer addition and another for double addition.

2. **Method Overriding**:
   - Method overriding occurs when a subclass provides a specific implementation of a method that is already provided by its superclass.
   - In method overriding, the method signature remains the same in both the superclass and the subclass, but the implementation in the subclass overrides the implementation in the superclass.
   - Method overriding is used for achieving runtime polymorphism or dynamic method dispatch.
   - To explicitly indicate that a method is intended to override a superclass method, you use the `@Override` annotation in Java. While it's not strictly required, it helps in making your code more readable and understandable.

Here's an example of method overriding:

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
```

In this example, the `makeSound` method is overridden in the `Dog` class to provide a specific sound for dogs.

In summary, method overloading involves defining multiple methods with the same name but different parameters, while method overriding involves providing a new implementation of a method in a subclass that is already defined in its superclass. Overriding is typically indicated using the `@Override` annotation, although it's not strictly necessary.
  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------








3- @OVERIDE ANNOTATIION
  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  

The `@Override` annotation is a marker annotation in Java used to indicate that a method in a subclass is intended to override a method with the same signature in its superclass. Here's some information about it:

1. **Usage**:
   - It's placed before a method declaration in a subclass that overrides a method in its superclass.
   - It helps in improving code readability and ensuring that the method is indeed overriding a method from the superclass.

2. **Purpose**:
   - It ensures compile-time safety by checking if the annotated method does indeed override a method in its superclass. If there's no method with a matching signature in the superclass, a compile-time error occurs.

3. **Origin**:
   - The `@Override` annotation was introduced in Java 5 (JDK 1.5) as part of the annotations feature.

4. **Example**:
   ```java
   class Animal {
       public void makeSound() {
           System.out.println("Animal makes a sound");
       }
   }

   class Dog extends Animal {
       @Override
       public void makeSound() {
           System.out.println("Dog barks");
       }
   }
   ```

5. **Other Annotations**:
   - Java provides several built-in annotations for various purposes, such as:
     - `@Deprecated`: Indicates that a method, class, or field is deprecated and should no longer be used.
     - `@SuppressWarnings`: Suppresses specific compiler warnings.
     - `@FunctionalInterface`: Indicates that an interface is a functional interface and can be used with lambda expressions.
     - `@Override` and others are part of the Java language and standard library.

6. **Custom Annotations**:
   - Yes, you can define your own custom annotations in Java using the `@interface` keyword.
   - Custom annotations can be used to provide metadata about classes, methods, fields, etc., and can be processed at compile-time or runtime using reflection.

7. **Scope**:
   - Annotations can be used at various levels in Java, including package-level, class-level, method-level, and field-level.
   - Their usage depends on the intended purpose and context.

Annotations in Java provide metadata about the code and can be used for documentation, code analysis, runtime processing, and more. While some annotations are provided by Java itself, you can also create your own custom annotations to suit your specific requirements.

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------









4-ANNOTATONS IN JAVA
  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  Certainly! Here are a few more commonly used annotations in Java, along with their purposes:

1. **@Deprecated**:
   - Indicates that a method, class, or field is deprecated and should no longer be used.
   - It helps in providing a warning to developers about outdated or obsolete code.
   - Example:
     ```java
     @Deprecated
     public void oldMethod() {
         // Deprecated method implementation
     }
     ```

2. **@SuppressWarnings**:
   - Suppresses specific compiler warnings for a given element or scope.
   - It's useful when you know about certain warnings and want to suppress them to avoid clutter in the output.
   - Example:
     ```java
     @SuppressWarnings("unchecked")
     List<String> list = new ArrayList();
     ```

3. **@FunctionalInterface**:
   - Indicates that an interface is a functional interface, i.e., it has only one abstract method (SAM - Single Abstract Method).
   - It's used to enable lambda expressions and method references for functional programming in Java.
   - Example:
     ```java
     @FunctionalInterface
     public interface MyFunctionalInterface {
         void doSomething();
     }
     ```

4. **@Override** (Already discussed):
   - Indicates that a method in a subclass is intended to override a method with the same signature in its superclass.

5. **@SuppressWarnings**:
   - Suppresses specific compiler warnings for a given element or scope.
   - It's useful when you know about certain warnings and want to suppress them to avoid clutter in the output.
   - Example:
     ```java
     @SuppressWarnings("unchecked")
     List<String> list = new ArrayList();
     ```

6. **@SafeVarargs**:
   - Indicates that a method with a variable number of arguments (varargs) is safe to use with generics without generating unchecked warnings.
   - It's typically used on methods that do not perform unsafe operations with varargs.
   - Example:
     ```java
     @SafeVarargs
     public final <T> List<T> asList(T... elements) {
         return Arrays.asList(elements);
     }
     ```

7. **@Retention**:
   - Specifies how long annotations with this type should be retained.
   - Annotations can be retained at compile-time, class-file time, or runtime.
   - Example:
     ```java
     @Retention(RetentionPolicy.RUNTIME)
     public @interface MyAnnotation {
         // Annotation elements
     }
     ```

These are just a few examples of commonly used annotations in Java. Annotations play a significant role in providing metadata and enabling various functionalities within Java applications.










