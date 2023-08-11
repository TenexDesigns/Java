Method Overloading:

Java supports method overloading, where you can define multiple methods with the same name but different parameter lists. They are differentiated by the number or type of parameters.

java
Copy code
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int intSum = add(5, 7);
        double doubleSum = add(3.5, 2.5);
        System.out.println("Int sum: " + intSum);
        System.out.println("Double sum: " + doubleSum);
    }
}
