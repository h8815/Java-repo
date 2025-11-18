import java.awt.*;
import java.awt.event.*;

public class EventHandlingDemo extends Frame {

    Label messageLabel;
    Button clickButton;

    EventHandlingDemo() {
        setTitle("Event Handling Demo");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);

        // Create label and button
        messageLabel = new Label("Click the button!");
        messageLabel.setBounds(90, 50, 150, 30);
        add(messageLabel);

        clickButton = new Button("Click Me");
        clickButton.setBounds(100, 100, 100, 30);
        add(clickButton);

        // Event handling: add action listener to button
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Button Clicked!");
            }
        });

        // Handle window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new EventHandlingDemo();
    }
}
