import java.awt.*;
import java.awt.event.*;

public class CitySelectorAWT extends Frame {

    Label selectedCityLabel;
    List cityList;

    CitySelectorAWT() {
        setTitle("City Selector");
        setSize(300, 250);
        setLayout(null);
        setVisible(true);

        // Create and add the city list
        cityList = new List();
        cityList.setBounds(50, 50, 200, 100);
        cityList.add("Indore");
        cityList.add("Mumbai");
        cityList.add("Delhi");
        add(cityList);

        // Label to show selected city
        selectedCityLabel = new Label("Selected City: ");
        selectedCityLabel.setBounds(50, 170, 200, 20);
        add(selectedCityLabel);

        // Add item listener to list
        cityList.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String selectedCity = cityList.getSelectedItem();
                selectedCityLabel.setText( selectedCity + " is a good city to live in.");
            }
        });

        // Close button functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new CitySelectorAWT();
    }
}
