import java.awt.*;
import java.awt.event.*;

public class LayoutManagerDemo extends Frame {
    CardLayout cardLayout = new CardLayout();
    Panel cardPanel = new Panel(cardLayout);

    LayoutManagerDemo() {
        setTitle("Layout Demo");
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Buttons to switch layouts
        Panel top = new Panel();
        String[] layouts = {"Flow", "Border", "Grid", "Card"};
        for (String name : layouts) {
            Button btn = new Button(name);
            btn.addActionListener(e -> cardLayout.show(cardPanel, name));
            top.add(btn);
        }
        add(top, BorderLayout.NORTH);

        // FlowLayout Panel
        Panel flow = new Panel(new FlowLayout());
        flow.add(new Button("A")); flow.add(new Button("B")); 

        // BorderLayout Panel
        Panel border = new Panel(new BorderLayout());
        border.add(new Button("North"), BorderLayout.NORTH);
        border.add(new Button("South"), BorderLayout.SOUTH);
        border.add(new Button("East"), BorderLayout.EAST);
        border.add(new Button("West"), BorderLayout.WEST);
        border.add(new Button("Center"), BorderLayout.CENTER);

        // GridLayout Panel
        Panel grid = new Panel(new GridLayout(2, 2));
        for (int i = 1; i <= 4; i++) grid.add(new Button("" + i));

        // CardLayout Panel
        Panel card = new Panel(new CardLayout());
        card.add(new Button("Card 1"), "1");
        card.add(new Button("Card 2"), "2");

        // Add all panels to card layout
        cardPanel.add(flow, "Flow");
        cardPanel.add(border, "Border");
        cardPanel.add(grid, "Grid");
        cardPanel.add(card, "Card");

        add(cardPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutManagerDemo();
    }
}
