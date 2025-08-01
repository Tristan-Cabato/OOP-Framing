package com.mycompany.oop;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Framing extends JFrame {
    public Framing() {
        // JFrame frame = new JFrame(); Generating another frame technically

        // Starting Layout
            this.setTitle("OOP");
            this.setSize(500, 500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);

            ImageIcon icon = new ImageIcon("C:\\Users\\tcabato\\Downloads\\Phrolova-icon.png");
            this.setIconImage(icon.getImage());

            this.getContentPane().setBackground(new Color(108, 124, 147));

            // Label
            JLabel label = new JLabel();
            JLabel label2 = new JLabel();   


            label.setText("Skiblidi");
                label.setForeground(Color.BLACK); 
                label.setBackground(Color.BLACK); 
                label.setOpaque(false);
                label.setFont(new Font("MV Boli", Font.BOLD, 30));
                label.setVerticalAlignment(JLabel.BOTTOM);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setPreferredSize(new Dimension(250,50));
            
            label2.setText("This is another label!");
                ImageIcon icon2 = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
                label2.setIcon(icon2);
                label2.setForeground(Color.BLACK); 
                label2.setBackground(Color.BLACK); 
                label2.setOpaque(false);
                label2.setFont(new Font("MV Boli", Font.BOLD, 30));
                label2.setVerticalAlignment(JLabel.TOP);
                label2.setHorizontalAlignment(JLabel.CENTER);
                label2.setPreferredSize(new Dimension(250,50));
                
        // Border
            Border border = BorderFactory.createLineBorder(Color.BLUE, 6, true);
            // Border frameborder = BorderFactory.createSoftBevelBorder(5);
            label.setBorder(border);
            label2.setBorder(border);
            
        // Panels
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();
            JPanel panel5 = new JPanel();

            JPanel panel6 = new JPanel();
            JPanel panel7 = new JPanel();
            JPanel panel8 = new JPanel();
            JPanel panel9 = new JPanel();
            JPanel panel10 = new JPanel();
            JPanel panel11 = new JPanel();
            // Backgrounds
                panel1.setBackground(Color.RED);
                panel2.setBackground(Color.GREEN);
                panel3.setBackground(Color.BLUE);
                panel4.setBackground(Color.YELLOW);
                panel5.setBackground(Color.WHITE);
                
                panel6.setBackground(Color.RED);
                panel7.setBackground(Color.GREEN);
                panel8.setBackground(Color.BLUE);
                panel9.setBackground(Color.YELLOW);
                panel10.setBackground(Color.ORANGE);
                panel11.setBackground(Color.PINK);
            // Preferred Size
                panel1.setPreferredSize(new Dimension(100,50));
                panel2.setPreferredSize(new Dimension(50,100));
                panel3.setPreferredSize(new Dimension(50,100));
                panel4.setPreferredSize(new Dimension(100,50));
                
                panel6.setLayout(new BorderLayout());
                panel7.setLayout(new BorderLayout());
                    panel7.setPreferredSize(new Dimension(100,50));
                panel8.setLayout(new BorderLayout());
                    panel8.setPreferredSize(new Dimension(100,50));
                panel9.setLayout(new BorderLayout());
                panel10.setLayout(new BorderLayout());
                    panel10.setPreferredSize(new Dimension(100,50));
                panel11.setLayout(new BorderLayout());
            // Creation
                add(panel1, BorderLayout.NORTH);
                add(panel2, BorderLayout.EAST);
                add(panel3, BorderLayout.WEST);
                add(panel4, BorderLayout.SOUTH);
                add(panel5, BorderLayout.CENTER);
            
                panel1.setLayout(new BorderLayout());
                panel1.add(panel7, BorderLayout.WEST);
                panel1.add(panel8, BorderLayout.CENTER);
                panel1.add(panel10, BorderLayout.EAST);

                panel4.setLayout(new BorderLayout());
                panel6.add(new JLabel(" "));
                panel9.add(new JLabel(" "));
                panel11.add(new JLabel(" "));
                panel4.add(panel6, BorderLayout.WEST);
                panel4.add(panel9, BorderLayout.CENTER);
                panel4.add(panel11, BorderLayout.EAST);
                
                this.setVisible(true);
    }
}