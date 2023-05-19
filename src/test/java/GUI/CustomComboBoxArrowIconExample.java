package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.plaf.basic.BasicArrowButton;

public class CustomComboBoxArrowIconExample extends JFrame {
    public CustomComboBoxArrowIconExample() {
        // Tạo combobox
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        
        // Lấy nút arrow button từ combobox
        Component arrowButton = getArrowButton(comboBox);
        
// Đổi biểu tượng của arrow button thành biểu tượng tùy chỉnh
if (arrowButton instanceof BasicArrowButton) {
    String imagePath = "GUI/Sort_down.png"; // sử dụng dấu gạch chéo "/"
    URL imageURL = getClass().getResource(imagePath);
    if (imageURL != null) {
        ImageIcon customIcon = new ImageIcon(imageURL);
        BasicArrowButton basicArrowButton = (BasicArrowButton) arrowButton;
        basicArrowButton.setIcon(customIcon);
    }
}

        
        // Thêm combobox và nút button vào frame
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(comboBox);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    // Hàm lấy nút arrow button từ combobox
    private Component getArrowButton(JComboBox<?> comboBox) {
        for (Component comp : comboBox.getComponents()) {
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                Icon icon = button.getIcon();
                if (icon != null && icon instanceof BasicArrowButton) {
                    return button;
                }
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomComboBoxArrowIconExample());
    }
}
