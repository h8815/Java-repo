import java.awt.*;
import java.awt.event.*;

public class AWTFormValidation extends Frame {

    TextField nameField, ageField;
    Label messageLabel;
    Button submitButton;

    AWTFormValidation() {
        // Set frame properties
        setTitle("AWT Form");
        setSize(400, 250);
        setLayout(null); // We'll use absolute positioning
        setVisible(true);

        // Name label and text field
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 100, 20);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(160, 50, 150, 20);
        add(nameField);

        // Age label and text field
        Label ageLabel = new Label("Age:");
        ageLabel.setBounds(50, 90, 100, 20);
        add(ageLabel);

        ageField = new TextField();
        ageField.setBounds(160, 90, 150, 20);
        add(ageField);

        // Submit button
        Button submitButton = new Button("Submit");
        submitButton.setBounds(160, 130, 80, 30);
        add(submitButton);

        // Message label
        messageLabel = new Label("");
        messageLabel.setBounds(50, 180, 300, 20);
        add(messageLabel);

        // Button click handler using anonymous inner class
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String ageText = ageField.getText();

                try {
                    int age = Integer.parseInt(ageText);
                    if(age >= 18){
                        messageLabel.setText("Hello " + name + "! You are eligible to vote Your age: " + age);
                    }
                    else{
                        messageLabel.setText("Hello " + name + "! You are not eligible to vote Your age: " + age);
                    }
                } catch (NumberFormatException ex) {
                    messageLabel.setText("Invalid age! Please enter a numeric value.");
                }
            }
        });

        // Close window handler
        // addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent we) {
        //         dispose();
        //     }
        // });
    }

    public static void main(String[] args) {
        AWTFormValidation form = new AWTFormValidation();
    }
}
