package GUI;

import javax.swing.*;
import java.awt.event.*;

public class DoubleClickExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Double Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Double click here");
        label.addMouseListener(new DoubleClickListener());

        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }

    static class DoubleClickListener extends MouseAdapter {
        private static final int DOUBLE_CLICK_DELAY = 300; // milliseconds
        private long lastClickTime = 0;

        @Override
        public void mouseClicked(MouseEvent e) {
            long clickTime = System.currentTimeMillis();

            if (clickTime - lastClickTime <= DOUBLE_CLICK_DELAY) {
                // Double click detected
                System.out.println("Double click!");
            }

            lastClickTime = clickTime;
        }
    }
}
