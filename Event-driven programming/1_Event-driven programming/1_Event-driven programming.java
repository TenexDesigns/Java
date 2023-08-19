Event-driven programming is a programming paradigm in which the flow of a program is determined by events such as user actions, sensor outputs, or messages from other programs. It's commonly used for building graphical user interfaces (GUIs), real-time systems, and applications that need to respond to various asynchronous events. In event-driven programming, the program listens for events and triggers appropriate handlers when events occur.

In Java, event-driven programming is often used for building GUI applications using libraries like Swing or JavaFX. Here's an explanation of its features along with code samples:

**Features of Event-Driven Programming:**

1. **Event Sources:** These are entities that generate events, such as buttons, text fields, timers, etc.

2. **Event Listeners/Handlers:** These are responsible for responding to events. They are registered with event sources and execute when an event occurs.

3. **Event Loop:** An event loop continuously checks for events and dispatches them to the appropriate event handlers.

4. **Asynchronicity:** Events can occur at any time, and the program must be able to handle multiple events concurrently.

**Example of Event-Driven Programming in Java (Swing):**

```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDrivenExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event-Driven Example");
        JButton button = new JButton("Click Me");

        // Register an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

In this example, a simple Swing GUI application is created. When the "Click Me" button is clicked, an `ActionEvent` is generated, and the registered `ActionListener` responds by displaying a message dialog.

**JavaFX Example:**

JavaFX is another GUI library in Java that uses event-driven programming. Here's a simple JavaFX example:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EventDrivenJavaFXExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click Me");

        button.setOnAction(event -> {
            System.out.println("Button clicked!");
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Event-Driven JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
```

In this JavaFX example, a button is created and an event handler using a lambda expression is registered to respond to the button's click event.

Overall, event-driven programming in Java allows you to create interactive and responsive applications by handling events and user interactions asynchronously. It's essential for building user interfaces and applications that involve real-time interactions.

  
