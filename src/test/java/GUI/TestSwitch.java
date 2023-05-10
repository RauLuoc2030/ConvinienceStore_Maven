package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSwitch {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel(new CardLayout());

        JButton button1 = new JButton("Panel 1");
        panel.add(button1, "panel1");

        JButton button2 = new JButton("Panel 2");
        panel.add(button2, "panel2");

        JButton switchButton = new JButton("Switch");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) panel.getLayout();
                cardLayout.show(panel, "panel2"); // Hiển thị Panel 2
            }
        });

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(switchButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
