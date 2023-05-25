import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestDoubleClick {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private int clickCount;
    private long lastClickTime;

    public TestDoubleClick() {
        frame = new JFrame("Double Click Example");
        panel = new JPanel();
        label = new JLabel("Double click me!");

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                long currentTime = System.currentTimeMillis();

                if (clickCount == 1 && (currentTime - lastClickTime) <= 200) {
                    // Xử lý sự kiện double click
                    System.out.println("Double clicked!");

                    // Reset lại số lần click và thời gian sau khi xử lý xong
                    clickCount = 0;
                    lastClickTime = 0;
                } else {
                    // Lưu số lần click và thời gian hiện tại
                    clickCount = 1;
                    lastClickTime = currentTime;
                }
            }
        });

        panel.add(label);
        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TestDoubleClick::new);
    }
}
