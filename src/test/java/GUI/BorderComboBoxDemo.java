package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class BorderComboBoxDemo extends JFrame {

    private JComboBox<String> comboBox;

    public BorderComboBoxDemo() {
        setTitle("Border ComboBox Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Tạo một mảng các phần tử cho ComboBox
        String[] items = { "Option 1", "Option 2", "Option 3", "Option 4" };

        // Khởi tạo JComboBox
        comboBox = new JComboBox<>(items);

        // Thiết lập Renderer tùy chỉnh cho ComboBox
        comboBox.setRenderer(new BorderComboBoxRenderer());

        // Thêm ComboBox vào JFrame
        add(comboBox);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Renderer tùy chỉnh để tạo đường viền ngăn cách
    class BorderComboBoxRenderer extends DefaultListCellRenderer {

        private static final int BORDER_THICKNESS = 2; // Độ dày của đường viền
        private static final Color BORDER_COLOR = Color.GRAY; // Màu của đường viền

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                boolean cellHasFocus) {
            // Gọi phương thức gốc để lấy thành phần hiển thị mặc định
            JLabel component = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected,
                    cellHasFocus);

            // Tạo đường viền cho thành phần
            Border border = BorderFactory.createMatteBorder(BORDER_THICKNESS, 0, 0, 0, BORDER_COLOR);
            component.setBorder(border);

            return component;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BorderComboBoxDemo();
        });
    }
}
