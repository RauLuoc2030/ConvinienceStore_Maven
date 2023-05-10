package GUI;

import javax.swing.*;
import java.awt.*;

public class CustomGridLayoutExample {
    private JPanel mainPanel;
    private int rowCount;
    private int columnCount;

    public CustomGridLayoutExample() {
        mainPanel = new JPanel(new GridBagLayout());
        rowCount = 0;
        columnCount = 0;
    }

    public void addProductPanel(JPanel productPanel) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = columnCount;
        gbc.gridy = rowCount;
        gbc.fill = GridBagConstraints.BOTH; // Đảm bảo panel nhỏ điền hết không gian cung cấp

        mainPanel.add(productPanel, gbc);
        incrementPosition();
    }

    private void incrementPosition() {
        columnCount++;
        if (columnCount == 5) {
            rowCount++;
            columnCount = 0;
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        CustomGridLayoutExample example = new CustomGridLayoutExample();

        // Thêm 3 panel nhỏ
        JPanel productPanel1 = createProductPanel("Product 1");
        example.addProductPanel(productPanel1);

        JPanel productPanel2 = createProductPanel("Product 2");
        example.addProductPanel(productPanel2);

        JPanel productPanel3 = createProductPanel("Product 3");
        example.addProductPanel(productPanel3);

        frame.getContentPane().add(example.getMainPanel());
        frame.setVisible(true);
    }

    private static JPanel createProductPanel(String name) {
        JPanel productPanel = new JPanel(new BorderLayout());
        productPanel.setPreferredSize(new Dimension(100, 100)); // Kích thước cố định của panel nhỏ
        productPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel nameLabel = new JLabel(name);
        productPanel.add(nameLabel, BorderLayout.CENTER);

        return productPanel;
    }
}
