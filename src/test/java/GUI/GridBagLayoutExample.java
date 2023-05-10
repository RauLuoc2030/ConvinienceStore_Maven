package GUI;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample {
    private JPanel mainPanel;
    private JPanel[][] panels;

    public GridBagLayoutExample() {
        mainPanel = new JPanel(new GridBagLayout());
        // mainPanel.setBackground(Color.BLUE);
        panels = new JPanel[4][5]; // Mảng 2 chiều lưu trữ các panel nhỏ

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        int count = 1;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                panels[row][col] = createProductPanel("Product " + (row * 5 + col + 1));
                gbc.gridx = col;
                gbc.gridy = row;
                mainPanel.add(panels[row][col], gbc);
                if (count == 14){
                    break;
                }
                count ++;
            }
        }
    }

    private JPanel createProductPanel(String name) {
        JPanel productPanel = new JPanel(new BorderLayout());
        productPanel.setPreferredSize(new Dimension(100, 100));
        productPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel nameLabel = new JLabel(name);
        productPanel.add(nameLabel, BorderLayout.CENTER);

        return productPanel;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        GridBagLayoutExample example = new GridBagLayoutExample();
        frame.getContentPane().add(example.getMainPanel());

        frame.setVisible(true);
    }
}
