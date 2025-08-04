package com.mycompany.oop;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Framing extends JFrame implements ActionListener {
    JButton button;
    JPanel centerPanel;

    public Framing() {
        // JFrame frame = new JFrame(); Generating another frame technically

        // Starting Layout
            this.setTitle("OOP");
            this.setSize(500, 500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);

            ImageIcon icon = new ImageIcon("C:\\Users\\tcabato\\Downloads\\Phrolova-icon.png");
            ImageIcon buttonIcon = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
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
                
        // Button
            button = new JButton("Click");
            button.setPreferredSize(new Dimension(200,50));
            button.setFocusable(false);
            button.addActionListener(e -> {
                if(centerPanel.isVisible()) { 
                    centerPanel.setVisible(false);
                } else { 
                    centerPanel.setVisible(true);
                }
            });
            button.setIcon(buttonIcon);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);
            // button.setIconTextGap(-5);

            centerPanel = new JPanel();
            centerPanel.setPreferredSize(new Dimension(300,300));
            centerPanel.setBackground(Color.RED);
            centerPanel.setVisible(false);

            // Other Buttons
                JButton button2 = new JButton("");
                    button2.setBackground(Color.PINK);
                    button2.addActionListener(e -> {
                        centerPanel.setBackground(Color.PINK);
                    });
                JButton button3 = new JButton("");
                    button3.setBackground(Color.BLUE);
                    button3.addActionListener(e -> {
                        centerPanel.setBackground(Color.BLUE);
                    });
                JButton button4 = new JButton("");
                    button4.setBackground(Color.GREEN);
                    button4.addActionListener(e -> {
                        centerPanel.setBackground(Color.GREEN); 
                    });
                JButton button5 = new JButton("");
                    button5.setBackground(Color.YELLOW);
                    button5.addActionListener(e -> {
                        centerPanel.setBackground(Color.YELLOW);
                    });
                JButton button6 = new JButton("");
                    button6.setBackground(Color.BLACK);
                    button6.addActionListener(e -> {
                        centerPanel.setBackground(Color.BLACK);
                    });
        
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

            JPanel panel12 = new JPanel();
            JPanel panel13 = new JPanel();
            JPanel panel14 = new JPanel();
            JPanel panel15 = new JPanel();
            JPanel panel16 = new JPanel();
            JPanel panel17 = new JPanel();

            JPanel panel18 = new JPanel();
            JPanel panel19 = new JPanel();
            JPanel panel20 = new JPanel();
            JPanel panel21 = new JPanel();
            JPanel panel22 = new JPanel();
            JPanel panel23 = new JPanel();
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

                panel12.setBackground(Color.RED);
                panel13.setBackground(Color.BLACK);
                panel14.setBackground(Color.BLUE);
                panel15.setBackground(Color.YELLOW);
                panel16.setBackground(Color.ORANGE);
                panel17.setBackground(Color.PINK);

                panel18.setBackground(Color.RED);
                panel19.setBackground(Color.BLACK);
                panel20.setBackground(Color.BLUE);
                panel21.setBackground(Color.YELLOW);
                panel22.setBackground(Color.ORANGE);
                panel23.setBackground(Color.PINK);
            // Preferred Size
                panel1.setPreferredSize(new Dimension(100,50));
                panel2.setPreferredSize(new Dimension(50,100));
                panel3.setPreferredSize(new Dimension(50,100));
                panel4.setPreferredSize(new Dimension(100,50));
                panel5.setPreferredSize(new Dimension(100,50));
                
                panel6.setLayout(new BorderLayout());
                panel7.setLayout(new BorderLayout());
                    panel7.setPreferredSize(new Dimension(100,50));
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
                    panel5.add(centerPanel);
            
                panel1.setLayout(new BorderLayout());
                panel1.add(panel7, BorderLayout.WEST);
                panel1.add(panel8, BorderLayout.CENTER);
                    panel8.add(button); 
                panel1.add(panel10, BorderLayout.EAST);

                panel4.setLayout(new BorderLayout());
                panel6.add(new JLabel(" "));
                panel9.add(new JLabel(" "));
                panel11.add(new JLabel(" "));
                panel4.add(panel6, BorderLayout.WEST);
                panel4.add(panel9, BorderLayout.CENTER);
                panel4.add(panel11, BorderLayout.EAST);

                panel12.setPreferredSize(new Dimension(30,30));
                panel13.setPreferredSize(new Dimension(30,30));
                panel14.setPreferredSize(new Dimension(30,30));
                panel15.setPreferredSize(new Dimension(30,30));
                panel16.setPreferredSize(new Dimension(30,30));

                // Layouts
                    panel12.setLayout(new BorderLayout());
                    panel13.setLayout(new BorderLayout());
                    panel14.setLayout(new BorderLayout());
                    panel15.setLayout(new BorderLayout());
                    panel16.setLayout(new BorderLayout());
                panel2.add(panel12);
                    panel12.add(button2);
                panel2.add(panel13);
                    panel13.add(button3);
                panel2.add(panel14);
                    panel14.add(button4);
                panel2.add(panel15);
                    panel15.add(button5);
                panel2.add(panel16);
                    panel16.add(button6);
                
                panel18.setPreferredSize(new Dimension(30,50));
                panel19.setPreferredSize(new Dimension(30,50));
                panel20.setPreferredSize(new Dimension(30,50));
                panel21.setPreferredSize(new Dimension(30,50));
                panel22.setPreferredSize(new Dimension(30,50));
                panel23.setPreferredSize(new Dimension(30,50));
                panel3.add(panel18, BorderLayout.WEST);
                panel3.add(panel19, BorderLayout.CENTER);
                panel3.add(panel20, BorderLayout.EAST);

                panel3.add(panel21, BorderLayout.WEST);
                panel3.add(panel22, BorderLayout.CENTER);
                panel3.add(panel23, BorderLayout.EAST);
                
                this.setVisible(true);
    }
    
/*    @Override
    public void actionPerformed(ActionEvent e) {
        if(centerPanel.isVisible()) { 
            centerPanel.setVisible(false);
        } else { 
            centerPanel.setVisible(true);
        }
    } Ignore this for now lol */
}