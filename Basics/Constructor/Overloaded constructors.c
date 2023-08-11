In Java, overloaded constructors are multiple constructors within a class that have different parameter lists. Overloading allows you to create multiple ways of constructing objects by providing varying sets of input parameters. Each overloaded constructor can have different numbers or types of parameters, providing flexibility when creating objects.

Here's how overloaded constructors work and how to use them:

```java
class Person {
    String name;
    int age;

    // Parameterized constructor with two parameters
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Overloaded constructor with one parameter
    Person(String n) {
        name = n;
        age = 0; // Default age
    }

    // Default constructor (no parameters)
    Person() {
        name = "Unknown";
        age = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30); // Calls the first constructor
        Person person2 = new Person("Bob");       // Calls the second constructor
        Person person3 = new Person();            // Calls the third constructor

        System.out.println(person1.name + " is " + person1.age + " years old.");
        System.out.println(person2.name + " is " + person2.age + " years old.");
        System.out.println(person3.name + " is " + person3.age + " years old.");
    }
}
```

In this example, the `Person` class has three constructors, each with a different number of parameters. When you create objects, Java determines which constructor to call based on the arguments you provide. Overloaded constructors provide a way to create objects with varying levels of initialization based on the parameters passed.

Overloaded constructors are useful when you want to offer different ways of creating objects without needing to know all the details up front. They provide a convenient mechanism for handling different initialization scenarios.



