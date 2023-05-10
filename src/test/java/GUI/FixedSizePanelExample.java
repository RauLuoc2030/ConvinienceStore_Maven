package GUI;

import javax.swing.*;
import java.awt.*;

public class FixedSizePanelExample {
    private JPanel mainPanel;
    private int panelCount;

    public FixedSizePanelExample() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 5, 10, 10)); // Lưới 4 hàng x 5 cột, khoảng cách 10 đơn vị
        panelCount = 0;
    }

    public void addProductPanel(JPanel productPanel) {
        if (panelCount < 20) {
            mainPanel.add(productPanel);
            mainPanel.revalidate();
            mainPanel.repaint();
            panelCount++;
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fixed Size Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        FixedSizePanelExample example = new FixedSizePanelExample();

        // Thêm 21 panel nhỏ (sẽ chỉ hiển thị 20 panel)
        for (int i = 1; i <= 2; i++) {
            JPanel productPanel = createProductPanel("Product " + i);
            example.addProductPanel(productPanel);
        }

        frame.getContentPane().add(example.getMainPanel());
        frame.setVisible(true);
    }

    private static JPanel createProductPanel(String name) {
        JPanel productPanel = new JPanel(new BorderLayout());
        productPanel.setPreferredSize(new Dimension(50, 50)); // Kích thước panel nhỏ
        productPanel.setBackground(Color.WHITE);
        productPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel nameLabel = new JLabel(name);
        productPanel.add(nameLabel, BorderLayout.CENTER);

        return productPanel;
    }
}
