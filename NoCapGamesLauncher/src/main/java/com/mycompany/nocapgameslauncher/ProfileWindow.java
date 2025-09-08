package com.mycompany.nocapgameslauncher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProfileWindow extends JWindow {

    public ProfileWindow(Frame owner) {
        super(owner);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        panel.setBackground(new Color(0x202020));
        panel.setBorder(BorderFactory.createLineBorder(new Color(0x444444)));

        JButton signInButton = createProfileButton("Sign In");
        signInButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Sign In clicked!");
            dispose();
        });

        JButton changeAccountButton = createProfileButton("Change Account");
        changeAccountButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Change Account clicked!");
            dispose();
        });

        panel.add(signInButton);
        panel.add(changeAccountButton);

        add(panel);
        pack();

        // Close the window when it loses focus
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowLostFocus(WindowEvent e) {
                dispose();
            }
        });
    }

    private JButton createProfileButton(String text) {
        JButton button = new JButton(text);
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(0x333333));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setHorizontalAlignment(SwingConstants.LEFT);

        // Add hover effect
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(0x444444));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(0x333333));
            }
        });

        return button;
    }
}