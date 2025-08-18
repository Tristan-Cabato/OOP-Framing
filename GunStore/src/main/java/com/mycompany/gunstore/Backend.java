package com.mycompany.gunstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Backend {
    private JFrame frame;
    private JPanel animalPanel;  // West panel for players
    private JPanel gunPanel;     // West of center panel
    private JPanel centerPanel;  // Main center panel
    private JPanel eastPanel;    // East panel
    private JPanel northPanel;   // North border
    private JPanel southPanel;   // South border

    public Backend() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Valogant");
        frame.setFont(new Font("Tungsten", Font.BOLD, 24));
        frame.setSize(2000, 1400);
        frame.setBackground(Color.BLACK);
        frame.setLayout(new BorderLayout(35, 0));

        // North border (spacing)
        northPanel = new JPanel();
        northPanel.setPreferredSize(new Dimension(frame.getWidth(), 20));
        northPanel.setBackground(Color.BLACK);
        frame.add(northPanel, BorderLayout.NORTH);

        // South border (spacing)
        southPanel = new JPanel();
        southPanel.setPreferredSize(new Dimension(frame.getWidth(), 20));
        southPanel.setBackground(Color.BLACK);
        frame.add(southPanel, BorderLayout.SOUTH);

        // Animal panel (LEFT) - Player list
        animalPanel = new JPanel(new GridLayout(0, 1, 0, 5));  // Single column, 5px vertical gap
        animalPanel.setBackground(new Color(40, 40, 40));
        animalPanel.setPreferredSize(new Dimension(300, frame.getHeight()));
        animalPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Add padding
        frame.add(animalPanel, BorderLayout.WEST);
        
        // Center content (CENTER)
        centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.BLACK);
        
        // Gun panel (Left, part of the center panel)
        gunPanel = new JPanel(new GridLayout(0, 1, 0, 5));  // Single column, 5px vertical gap
        gunPanel.setBackground(new Color(50, 50, 50));
        gunPanel.setPreferredSize(new Dimension(200, frame.getHeight()));
        gunPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Add padding
        
        // Game view (center of center panel)
        JPanel gameView = new JPanel();
        gameView.setBackground(new Color(30, 30, 30));
        
        // Add gun panel and game view to center panel
        centerPanel.add(gunPanel, BorderLayout.WEST);
        centerPanel.add(gameView, BorderLayout.CENTER);
        
        // East panel (right of center)
        eastPanel = new JPanel();
        eastPanel.setBackground(new Color(40, 40, 40));  // Same as animal panel
        eastPanel.setPreferredSize(new Dimension(100, frame.getHeight()));
        
        // Add east panel to center panel
        centerPanel.add(eastPanel, BorderLayout.EAST);
        
        // Add center panel to frame
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void PlayerAdd(String type, String name, String breed, int currency) {
        JPanel panel = new JPanel(new BorderLayout(10, 0));
        panel.setBackground(new Color(60, 60, 60));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Breed image (using first letter as placeholder)
        JLabel imageLabel = new JLabel(breed.substring(0, 1).toUpperCase());
        imageLabel.setOpaque(true);
        imageLabel.setBackground(new Color(80, 80, 80));
        imageLabel.setForeground(Color.WHITE);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        imageLabel.setPreferredSize(new Dimension(40, 40));
        JPanel infoPanel = new JPanel(new BorderLayout());
        infoPanel.setOpaque(false);
        
        // Name and credits in a single row
        JPanel topRow = new JPanel(new BorderLayout());
        topRow.setOpaque(false);
        
        JLabel nameLabel = new JLabel(name);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        // Credits (aligned to the right of the name)
        JLabel creditsLabel = new JLabel("#" + currency);
        creditsLabel.setForeground(Color.WHITE);
        creditsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        topRow.add(nameLabel, BorderLayout.WEST);
        topRow.add(creditsLabel, BorderLayout.EAST);
        
        infoPanel.add(topRow, BorderLayout.NORTH);
        
        panel.add(imageLabel, BorderLayout.WEST);
        panel.add(infoPanel, BorderLayout.CENTER);
        
        animalPanel.add(panel);
        animalPanel.revalidate();
        animalPanel.repaint();
    }
    
    public void GunAdd(String name, String type, int price) {
        JButton gunButton = new JButton("<html><div style='text-align:left;'>" + 
            "<b>" + name + "</b><br>" +
            "<span style='color:#AAAAAA;font-size:10px;'>" + type + " • " + price + "</span></div>");
        
        gunButton.setBackground(new Color(70, 70, 70));
        gunButton.setForeground(Color.WHITE);
        gunButton.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        gunButton.setHorizontalAlignment(SwingConstants.LEFT);
        gunButton.setFocusPainted(false);
        gunButton.setMargin(new Insets(5, 10, 5, 10));
        
        // Add type indicator
        gunButton.setIcon(new ImageIcon(createColorIcon(getTypeColor(type), 10, 10)));
        gunButton.setIconTextGap(10);
        
        gunPanel.add(gunButton);
        gunPanel.revalidate();
        gunPanel.repaint();
    }
    
    private Color getTypeColor(String type) {
        return switch (type.toLowerCase()) {
            case "sidearms" -> new Color(255, 100, 100);
            case "smg" -> new Color(100, 200, 255);
            case "shotgun" -> new Color(100, 255, 150);
            case "rifle" -> new Color(255, 200, 100);
            case "sniper" -> new Color(200, 100, 255);
            case "heavy" -> new Color(255, 150, 100);
            default -> Color.GRAY;
        };
    }
    
    private java.awt.Image createColorIcon(Color color, int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(color);
        g2d.fillOval(0, 0, width, height);
        g2d.dispose();
        return image;
    }
}
