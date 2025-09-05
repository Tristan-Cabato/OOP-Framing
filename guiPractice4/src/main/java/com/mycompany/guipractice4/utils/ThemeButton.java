/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guipractice4.utils;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author tcabato
 */
public class ThemeButton extends JButton implements ThemeManager.ThemeChangeListener {
    public ThemeButton() {
        setupPanel();
        ThemeManager.getInstance().addThemeChangeListener(this);
    }
    public ThemeButton(String text) {
        setText(text);
        setupPanel();
        ThemeManager.getInstance().addThemeChangeListener(this);
    }
    
    public void setupPanel() {
        setBackground(ThemeManager.getInstance().getBackgroundColor());
        setForeground(ThemeManager.getInstance().getForegroundColor());
        repaint();
    }

    @Override
    public void onThemeChanged(boolean darkMode) {
        SwingUtilities.invokeLater(() -> {
            setBackground(ThemeManager.getInstance().getBackgroundColor());
            setForeground(ThemeManager.getInstance().getForegroundColor());
            repaint();
        });
    }
}
