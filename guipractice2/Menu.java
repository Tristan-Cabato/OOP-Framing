package com.mycompany.guipractice2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Menu extends JFrame {
    public Menu() {
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        // setLayout(new GridLayout(3,3));

        ArrayList <JPanel> panels = new ArrayList<>();
            panels.add(createPanel(new Dimension(0, 50), Color.RED, true)); // North
            panels.add(createPanel(new Dimension(0, 100), Color.BLACK, true)); // South
            panels.add(createPanel(new Dimension(140, 0), Color.RED, true)); // NorthEast(???)

        // North
        ArrayList <JButton> buttons = new ArrayList<>();
            buttons.add(createButton("Home"));
            buttons.get(0).setEnabled(false);
            buttons.add(createButton("About"));
            buttons.add(createButton("Contact"));

            for (JButton button : buttons) {
                panels.get(2).add(button);
            }

        buttons.get(0).addActionListener(e -> {
           buttons.get(0).setEnabled(false); 
           buttons.get(1).setEnabled(true); 
           buttons.get(2).setEnabled(true); 
        });
        buttons.get(1).addActionListener(e -> {
           buttons.get(0).setEnabled(true); 
           buttons.get(1).setEnabled(false); 
           buttons.get(2).setEnabled(true); 
        });
        buttons.get(2).addActionListener(e -> {
           buttons.get(0).setEnabled(true); 
           buttons.get(1).setEnabled(true); 
           buttons.get(2).setEnabled(false); 
        });

        panels.get(0).setLayout(new BorderLayout());
        panels.get(0).add(panels.get(2), BorderLayout.EAST);
        
        // Center
        JLayeredPane center = new JLayeredPane();
            center.setOpaque(true);
            center.setVisible(true);
            center.setPreferredSize(new Dimension(800, 250));

        ArrayList <JPanel> centerPanels = new ArrayList<>();
            centerPanels.add(createPanel(new Dimension(800, 250), Color.YELLOW, true));
            centerPanels.add(createPanel(new Dimension(800, 250), Color.ORANGE, false));
            centerPanels.add(createPanel(new Dimension(800, 250), Color.MAGENTA, false));

        // Layers
            center.add(centerPanels.get(0), JLayeredPane.DEFAULT_LAYER);
            center.add(centerPanels.get(1), JLayeredPane.PALETTE_LAYER);
            center.add(centerPanels.get(2), JLayeredPane.MODAL_LAYER);
        

        add(panels.get(0), BorderLayout.NORTH);
        add(panels.get(1), BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);

        // pack();
        setVisible(true);
    }

    private JPanel createPanel(Dimension dimension, Color color, boolean isVisible) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(dimension);
        panel.setBackground(color);
        panel.setVisible(isVisible);

        return panel;
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(40, 10));
        button.setFocusable(false);
        button.setBackground(Color.RED);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        return button;
    }
}
