package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

public class CuteComboBoxDemo extends JFrame {

    private JComboBox<String> comboBox;

    public CuteComboBoxDemo() {
        setTitle("Cute ComboBox Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Tạo một mảng các phần tử cho ComboBox
        String[] items = { "😻 Meow", "🐶 Woof", "🐼 Cute" };

        // Khởi tạo JComboBox
        comboBox = new JComboBox<>(items);

        // Thiết lập UI tùy chỉnh cho JComboBox
        comboBox.setUI(new CuteComboBoxUI());

        // Thêm ComboBox vào JFrame
        add(comboBox);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Lớp UI tùy chỉnh cho JComboBox
    class CuteComboBoxUI extends BasicComboBoxUI {

        @Override
        protected JButton createArrowButton() {
            JButton button = new JButton("\uD83D\uDE0A"); // Mặt cười dễ thương
            button.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
            button.setMargin(new Insets(0, 5, 0, 5));
            button.setBorder(new EmptyBorder(0, 5, 0, 5));
            button.setBackground(Color.WHITE);
            button.setFocusPainted(false);
            return button;
        }

        @Override
        protected ComboPopup createPopup() {
            return new CuteComboPopup(comboBox);
        }
    }

    // Lớp Popup tùy chỉnh cho JComboBox
    class CuteComboPopup extends BasicComboPopup {

        public CuteComboPopup(JComboBox<Object> comboBox) {
            super(comboBox);
            setBorder(new LineBorder(Color.PINK, 2)); // Đường viền hồng dễ thương
            setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CuteComboBoxDemo();
        });
    }
}
