package GUI;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import oracle.net.aso.j;
import oracle.net.aso.l;

public class FocusExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focus Example");
        JTextField textField = new JTextField();
        JLabel label = new JLabel("null");
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Text field gained focus");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("Text field lost focus");
            }
        });

        frame.add(textField);
        frame.add(label);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
