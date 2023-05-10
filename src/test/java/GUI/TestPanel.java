package GUI;

import javax.swing.*;
import java.awt.*;

public class TestPanel {
    private JPanel mainPanel;
    private int row;
    private int column;

    public TestPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(0, 3, 10, 10)); // Lưới 3 cột, khoảng cách 10 đơn vị
        row = 0;
        column = 0;
    }

    public void addProductPanel(JPanel productPanel) {
        mainPanel.add(productPanel);
        mainPanel.revalidate();
        mainPanel.repaint();
        incrementPosition();
    }

    private void incrementPosition() {
        column++;
        if (column == 3) {
            row++;
            column = 0;
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Product Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        TestPanel example = new TestPanel();

        // Tạo panel nhỏ 1
        JPanel productPanel1 = createProductPanel("Product 1", "$10", "image1.jpg");
        example.addProductPanel(productPanel1);

        // Tạo panel nhỏ 2
        JPanel productPanel2 = createProductPanel("Product 2", "$20", "image2.jpg");
        example.addProductPanel(productPanel2);

        // Tạo panel nhỏ 3
        JPanel productPanel3 = createProductPanel("Product 3", "$30", "image3.jpg");
        example.addProductPanel(productPanel3);

        // Tạo panel nhỏ 4
        JPanel productPanel4 = createProductPanel("Product 1", "$10", "image1.jpg");
        example.addProductPanel(productPanel4);

        // Tạo panel nhỏ 5
        JPanel productPanel5 = createProductPanel("Product 2", "$20", "image2.jpg");
        example.addProductPanel(productPanel5);

        // Tạo panel nhỏ 6
        JPanel productPanel6 = createProductPanel("Product 3", "$30", "image3.jpg");
        example.addProductPanel(productPanel6);

        frame.getContentPane().add(example.getMainPanel());
        frame.setVisible(true);
    }

    private static JPanel createProductPanel(String name, String price, String imageFileName) {
        JPanel productPanel = new JPanel(new BorderLayout());
        productPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel nameLabel = new JLabel(name);
        JLabel priceLabel = new JLabel(price);
        JLabel imageLabel = new JLabel(new ImageIcon(imageFileName));

        productPanel.add(imageLabel, BorderLayout.CENTER);
        productPanel.add(nameLabel, BorderLayout.NORTH);
        productPanel.add(priceLabel, BorderLayout.SOUTH);

        return productPanel;
    }
}
