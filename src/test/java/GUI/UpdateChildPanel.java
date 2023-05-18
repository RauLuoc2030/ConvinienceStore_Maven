package GUI;

import javax.swing.*;
import java.awt.*;

public class UpdateChildPanel {
    public static void main(String[] args) {
        // Tạo panel cha
        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new FlowLayout());

        // Tạo các panel con
        JPanel childPanel1 = new JPanel();
        childPanel1.setBackground(Color.RED);
        JPanel childPanel2 = new JPanel();
        childPanel2.setBackground(Color.GREEN);
        JPanel childPanel3 = new JPanel();
        childPanel3.setBackground(Color.BLUE);

        // Thêm các panel con vào panel cha
        parentPanel.add(childPanel1);
        parentPanel.add(childPanel2);
        parentPanel.add(childPanel3);

        // Lấy danh sách các component con của panel cha
        Component[] components = parentPanel.getComponents();

        // Thay đổi background color của các panel con
        for (Component component : components) {
            if (component instanceof JPanel) {
                JPanel childPanel = (JPanel) component;
                childPanel.setBackground(Color.YELLOW);
            }
        }

        // Cập nhật panel cha
        parentPanel.revalidate();
        parentPanel.repaint();

        JFrame frame = new JFrame();
        frame.setSize(720, 480);
        frame.add(parentPanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
