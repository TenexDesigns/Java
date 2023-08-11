   //Serialization = 	The process of converting an object into a byte stream.
	   //					Persists (saves the state) the object after program exits
	   //					This byte stream can be saved as a file or sent over a network
	   //					Byte stream can be saved as a file (.ser) which is platform independent
	   //					(Think of this as if you're saving a file with the object's information)
	   
	   //					Steps to Serialize
	   //					---------------------------------------------------------------
	   //					1. Your class should implement Serializable interface
	   //					2. add import java.io.Serializable;
	   //					3. FileOutputStream fileOut = new FileOutputStream(file path)
	   //					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
	   //					5. out.writeObject(objectName)
	   //					6. out.close(); fileOut.close();
	   //					---------------------------------------------------------------
	   
	   //Deserialization = 	The reverse process of converting a byte stream into an object.
	   //					(Think of this as if you're loading a saved file)
	   
	   //					Steps to Deserialize
	   //					---------------------------------------------------------------
	   //					1. Your class should implement Serializable interface
	   //					2. add import java.io.Serializable;
	   //					3. FileInputStream fileIn = new FileInputStream(file path);
	   //					4. ObjectInputStream in = new ObjectInputStream(fileIn);
	   //					5. objectNam = (Class) in.readObject();
	   //					6. in.close(); fileIn.close();
	   //					---------------------------------------------------------------
	   
	   // important notes	1. children classes of a parent class that implements Serializable will do so as well
	   //					2. static fields are not serialized (they belong to the class, not an individual object)
	   //					3. Fields declared as "transient" aren't serialized, they're ignored
	   //					4. the class's definition ("class file") itself is not recorded, cast it as the object type
	   //					5. serialVersionUID is a unique version ID 
	   
	   //SerialVersionUID =	serialVersionUID is a unique ID that functions like a version #
	   //					verifies that the sender and receiver of a serialized object,
	   //					have loaded classes for that object that are compatible
	   //					Ensures object will be compatible between machines
	   //					Number must match. otherwise this will cause a InvalidClassException
	   //					A SerialVersionUID will be calculated based on class properties, members, etc.
	   //					A serializable class can declare its own serialVersionUID explicitly (recommended)














-------------------------------------------------------------------------------

Serialization in Java refers to the process of converting objects into a format that can be easily stored, transmitted, or reconstructed. It's a mechanism that allows you to convert objects into a stream of bytes, which can then be saved to a file, sent over a network, or stored in a database. Conversely, deserialization is the process of reconstructing objects from the serialized byte stream.

Java provides built-in support for serialization through the `Serializable` interface and the `ObjectOutputStream` and `ObjectInputStream` classes. Here's how it works:

1. **Implementing `Serializable` Interface:**
   To make a class serializable, it needs to implement the `Serializable` interface, which is a marker interface with no methods. This interface indicates that the objects of the class can be serialized.

   ```java
   import java.io.Serializable;

   public class Person implements Serializable {
       private String name;
       private int age;

       // Constructors, getters, setters, etc.
   }
   ```

2. **Serializing Objects:**
   To serialize an object, you need to create an `ObjectOutputStream` and write the object to it.

   ```java
   Person person = new Person("Alice", 30);
   try (FileOutputStream fileOut = new FileOutputStream("person.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
       out.writeObject(person);
   } catch (IOException e) {
       e.printStackTrace();
   }
   ```

3. **Deserializing Objects:**
   To deserialize an object, you need to create an `ObjectInputStream` and read the object from it.

   ```java
   try (FileInputStream fileIn = new FileInputStream("person.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn)) {
       Person deserializedPerson = (Person) in.readObject();
       System.out.println("Name: " + deserializedPerson.getName());
       System.out.println("Age: " + deserializedPerson.getAge());
   } catch (IOException | ClassNotFoundException e) {
       e.printStackTrace();
   }
   ```

Keep in mind the following considerations:

- Both the class you're serializing and any classes it references need to be serializable.
- If a class contains non-serializable fields, you need to handle their serialization manually by implementing custom methods (`writeObject` and `readObject`).
- Serialization and deserialization can be used for data storage, communication between Java applications, and more. However, be cautious when deserializing data from untrusted sources to avoid security vulnerabilities.

Remember that serialization is not always the best approach for data storage or communication, especially when dealing with complex or frequently changing object structures. In such cases, other formats like JSON or XML might be more appropriate.

















