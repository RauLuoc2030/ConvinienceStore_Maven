package GUI;

import javax.swing.*;
import java.awt.*;

public class Five_Panel_1_Row {
    private JPanel mainPanel;

    public Five_Panel_1_Row() {
        mainPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        mainPanel.setPreferredSize(new Dimension(500, 200));

        for (int i = 0; i < 20; i++) {
            JPanel productPanel = createProductPanel("Product " + (i + 1));
            mainPanel.add(productPanel);
        }
    }

    private JPanel createProductPanel(String name) {
        JPanel productPanel = new JPanel(new BorderLayout());
        productPanel.setPreferredSize(new Dimension(80, 120));
        productPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel nameLabel = new JLabel(name);
        productPanel.add(nameLabel, BorderLayout.CENTER);

        return productPanel;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);

        Five_Panel_1_Row example = new Five_Panel_1_Row();
        frame.getContentPane().add(example.getMainPanel());

        frame.setVisible(true);
    }
}
