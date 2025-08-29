/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guipractice4.gui.components;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.function.*;
/**
 *
 * @author tcabato
 */
public class sidebarCreator {
    private static Color DEFAULT_BG = Color.GRAY;
    private static Color HIGHLIGHTED = new Color(200, 200, 200);
            
    public static JPanel createNavigationSidebar(int width, Consumer<String> onItemClick) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(DEFAULT_BG);
        panel.setPreferredSize(new Dimension(width, Integer.MAX_VALUE)); // Watch for this
        panel.setMaximumSize(new Dimension(width, Integer.MAX_VALUE));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
        
        addItem(panel, "dashboard", "👅💕💦💦", onItemClick);
        addItem(panel, "profile", "🍆🍆💦🐃", onItemClick);
        
        return panel;
    }
    
    private static void addItem(JPanel panel, String text, String icon, Consumer<String> onItemClick) {
        JButton button = new JButton(text + " " + icon);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setPreferredSize(new Dimension(Integer.MAX_VALUE, 20));
        button.setMinimumSize(new Dimension(Integer.MAX_VALUE, 10));
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        button.setHorizontalAlignment(JButton.LEFT); // For texts
        button.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        button.setContentAreaFilled(true);
        button.setFocusable(false);
        button.setFocusPainted(false);
        
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBackground(HIGHLIGHTED);
                button.setOpaque(true);
            }
            
            public void mouseExited(MouseEvent e) {
                button.setBackground(null);
                button.setOpaque(false);
            }
        });
        
        button.addActionListener(e -> {
            onItemClick.accept(text.toUpperCase());
        }); // Method referencing
        
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
    }
}
