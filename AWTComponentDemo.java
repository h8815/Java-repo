import java.awt.*;
import java.awt.event.*;

public class AWTComponentDemo extends Frame {
    AWTComponentDemo() {
        setLayout(null);
        setTitle("AWTComponent");
        setSize(300, 200);

        Label name = new Label("Name:");
        name.setBounds(30, 50, 50, 20);
        add(name);

        TextField field = new TextField();
        field.setBounds(90, 50, 120, 20);
        add(field);

        Checkbox cb = new Checkbox("I Agree");
        cb.setBounds(90, 80, 100, 20);
        add(cb);

        Button btn = new Button("Submit");
        btn.setBounds(90, 110, 80, 25);
        add(btn);

        Label msg = new Label();
        msg.setBounds(30, 150, 220, 20);
        add(msg);

        btn.addActionListener(e -> msg.setText(cb.getState() ? "Hello, " + field.getText() : "Please agree."));

        addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) { dispose(); } });
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTComponentDemo();
    }
}
