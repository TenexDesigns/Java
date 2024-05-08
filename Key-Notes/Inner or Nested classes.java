Sure, let's go through the different types of inner classes in Java with examples:

1. **Regular Inner Class**:
   
   Regular inner classes are declared within another class without using the `static` keyword. They have access to all members of the outer class, including private members.

   ```java
   class OuterClass {
       int x = 10;

       class InnerClass {
           int y = 5;
       }
   }

   public class Main {
       public static void main(String[] args) {
           OuterClass myOuter = new OuterClass();
           OuterClass.InnerClass myInner = myOuter.new InnerClass();
           System.out.println(myInner.y + myOuter.x); // Outputs 15 (5 + 10)
       }
   }
   ```

2. **Private Inner Class**:
   
   Inner classes can be declared as private, restricting access to them from outside the outer class. They can still access members of the outer class.

   ```java
   class OuterClass {
       int x = 10;

       private class InnerClass {
           int y = 5;
       }
   }

   public class Main {
       public static void main(String[] args) {
           OuterClass myOuter = new OuterClass();
           // This line would cause an error because InnerClass is private
           // OuterClass.InnerClass myInner = myOuter.new InnerClass();
       }
   }
   ```

3. **Static Inner Class**:
   
   Static inner classes are declared with the `static` keyword. They can be instantiated without an instance of the outer class and cannot access non-static members of the outer class directly.

   ```java
   class OuterClass {
       int x = 10;

       static class InnerClass {
           int y = 5;
       }
   }

   public class Main {
       public static void main(String[] args) {
           OuterClass.InnerClass myInner = new OuterClass.InnerClass();
           System.out.println(myInner.y); // Outputs 5
       }
   }
   ```

4. **Access Outer Class From Inner Class**:
   
   Inner classes can access members of the outer class, even private members.

   ```java
   class OuterClass {
       int x = 10;

       class InnerClass {
           public int myInnerMethod() {
               return x; // Accessing outer class member
           }
       }
   }

   public class Main {
       public static void main(String[] args) {
           OuterClass myOuter = new OuterClass();
           OuterClass.InnerClass myInner = myOuter.new InnerClass();
           System.out.println(myInner.myInnerMethod()); // Outputs 10
       }
   }
   ```

These examples illustrate the usage and behavior of different types of inner classes in Java. Each type of inner class serves a specific purpose and has its own set of rules regarding access and instantiation.
