import java.awt.*;
import java.awt.event.*;

public class ColorSelectorAWT extends Frame {
    CheckboxGroup colorGroup;

    ColorSelectorAWT() {
        setTitle("Color Selector");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        colorGroup = new CheckboxGroup();

        Checkbox red = new Checkbox("Red", colorGroup, false);
        red.setBounds(50, 220, 60, 20);
        add(red);

        Checkbox green = new Checkbox("Green", colorGroup, false);
        green.setBounds(130, 220, 60, 20);
        add(green);

        Checkbox blue = new Checkbox("Blue", colorGroup, false);
        blue.setBounds(210, 220, 60, 20);
        add(blue);

        Choice colorChoice = new Choice();
        colorChoice.setBounds(50, 50, 100, 20);
        colorChoice.add("Red");
        colorChoice.add("Green");
        colorChoice.add("Blue");
        add(colorChoice);

        MenuBar mb = new MenuBar();
        Menu m = new Menu("File");
        m.add(new MenuItem("Open"));
        mb.add(m);
        setMenuBar(mb);

        // Listener to change full background color on selection
        ItemListener listener = e -> {
            Checkbox selected = colorGroup.getSelectedCheckbox();
            if (selected != null) {
                switch (selected.getLabel()) {
                    case "Red" -> setBackground(Color.RED);
                    case "Green" -> setBackground(Color.GREEN);
                    case "Blue" -> setBackground(Color.BLUE);
                }
            }
        };

        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        ColorSelectorAWT colorSelector = new ColorSelectorAWT();
    }
}