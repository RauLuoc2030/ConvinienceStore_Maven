package GUI;

import javax.swing.*;
import java.awt.*;

public class POSPanel {
    public static void main(String[] args) {
        // Create main window frame
        JFrame frame = new JFrame("Product Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a JPanel to hold the product information
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertical layout

        // Create demo product data (only 20 products)
        Product_icon[] products = new Product_icon[14];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product_icon(
                    new ImageIcon("product" + i + ".png"), // Icon file name
                    "Product " + (i + 1), // Name
                    "$" + ((i + 1) * 10), // Price
                    String.valueOf(i * 2) // Number
            );
        }

        // Add a panel for each product to the main panel
        for (int i = 0; i < products.length; i++) {
            if (i % 5 == 0) {
                JPanel rowPanel = new JPanel();
                rowPanel.setLayout(new GridLayout(1, 5));
                rowPanel.setBackground(Color.LIGHT_GRAY);

                for (int j = i; j < i + 5 && j < products.length; j++) {
                    Product_icon product = products[j];

                    JPanel productPanel = new JPanel();
                    productPanel.setLayout(new BorderLayout());
                    productPanel.setPreferredSize(new Dimension(140, 180)); // Set a preferred size
                    productPanel.setBackground(Color.LIGHT_GRAY);

                    JLabel iconLabel = new JLabel(product.getIcon());
                    JLabel nameLabel = new JLabel(product.getName());
                    JLabel priceLabel = new JLabel(product.getPrice());
                    JLabel numberLabel = new JLabel(product.getNumber());

                    productPanel.add(iconLabel, BorderLayout.CENTER);
                    JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
                    labelsPanel.add(nameLabel);
                    labelsPanel.add(priceLabel);
                    labelsPanel.add(numberLabel);
                    productPanel.add(labelsPanel, BorderLayout.SOUTH);

                    // Add an empty border of 10 pixels to the product panel
                    productPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                    rowPanel.add(productPanel);
                }

                panel.add(Box.createVerticalGlue()); // Add glue component before each row panel
                panel.add(rowPanel);
            }
        }

        // Add the main panel to the main window
        frame.add(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}

class Product_icon {
    private ImageIcon icon;
    private String name;
    private String price;
    private String number;

    public Product_icon(ImageIcon icon, String name, String price, String number) {
        this.icon = icon;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }
}
