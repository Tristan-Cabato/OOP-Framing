/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guipractice4.gui.components;
import java.awt.*;
import java.awt.event.*;
import java.util.function.*;
import javax.swing.*;
/**
 *
 * @author tcabato
 */
public class sidebarCreator {
    private final static Color DEFAULT_BG = Color.GRAY;
    private final static Color HIGHLIGHTED = new Color(200, 200, 200);
            
    public static JPanel createNavigationSidebar(int width, Consumer<String> onItemClick) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(DEFAULT_BG);
        panel.setPreferredSize(new Dimension(width, Integer.MAX_VALUE)); // Watch for this
        panel.setMaximumSize(new Dimension(width, Integer.MAX_VALUE));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));

        addItem(panel, "Dashboard", "📦", onItemClick);
        addItem(panel, "Profile", "👲", onItemClick);
        
        return panel;
    }
    
    // Add Navigation Item
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
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(HIGHLIGHTED);
                button.setOpaque(true);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(null);
                button.setOpaque(false);
            }
        });
        
        button.addActionListener(_ -> {
            onItemClick.accept(text.toUpperCase());
        }); // Method referencing
        
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
    }
    
    public static JPanel createCollapsible(int expandedWidth, int collapsedWidth, Consumer<String> onItemClick) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(expandedWidth, Integer.MAX_VALUE));
        panel.setBackground(DEFAULT_BG);
        
        JButton button = new JButton("≡");
        button.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));

                
        addItem(contentPanel, "Dashboard", "📦", onItemClick);
        addItem(contentPanel, "Profile", "👲", onItemClick);
        addItem(contentPanel, "About", "❓", onItemClick);
        addItem(contentPanel, "Setting", "⚙️", onItemClick);
        addItem(contentPanel, "Logout", "👋", onItemClick);

        panel.add(button, BorderLayout.NORTH);
        panel.add(contentPanel, BorderLayout.CENTER);

        button.addActionListener(_ -> {
            boolean isCollapsed = panel.getWidth() == collapsedWidth;
            int newWidth = isCollapsed ? expandedWidth : collapsedWidth;
            panel.setPreferredSize(new Dimension(newWidth, Integer.MAX_VALUE));
            button.setText(isCollapsed ? "📂" : "📁");
            contentPanel.setVisible(isCollapsed);
            
            panel.revalidate();
            panel.repaint();
        });
        return panel;
    }
}
