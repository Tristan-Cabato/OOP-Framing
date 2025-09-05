package com.mycompany.guipractice4.utils;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class ThemeManager {
    private static ThemeManager instance;
    private boolean darkMode = false;
    
    private final ArrayList<ThemeChangeListener> listeners = new ArrayList<>();
    
    // Color schemes
    private final Color lightBackground = Color.WHITE;
    private final Color lightForeground = Color.BLACK;
    private final Color lightComponent = new Color(240, 240, 240);
    
    private final Color darkBackground = new Color(45, 45, 45);
    private final Color darkForeground = Color.WHITE;
    private final Color darkComponent = new Color(60, 60, 60);

    private ThemeManager() {
        // Private constructor for singleton
    }

    public static ThemeManager getInstance() {
        if (instance == null) {
            instance = new ThemeManager();
        }
        return instance;
    }

    
    public boolean isDarkMode() {
        return darkMode;
    }
    
    public void toggleDarkMode() {
        darkMode = !darkMode;
        applyThemeToAllComponents();
        notifyListeners();
    }
    
    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
        applyThemeToAllComponents();
        notifyListeners();
    }
    
    public void addThemeChangeListener(ThemeChangeListener listener) {
        listeners.add(listener);
    }
    
    public void removeThemeChangeListener(ThemeChangeListener listener) {
        listeners.remove(listener);
    }
    
    private void notifyListeners() {
        for (ThemeChangeListener listener : listeners) {
            listener.onThemeChanged(darkMode);
        }
    }
    
    public void applyThemeToAllComponents() {
        // Apply to all existing frames and dialogs
        for (Window window : Window.getWindows()) {
            applyThemeToContainer(window);
        }
    }
    
    public void applyThemeToContainer(Container container) {
        applyThemeToComponent(container);
        
        for (Component comp : container.getComponents()) {
            if (comp instanceof Container) {
                applyThemeToContainer((Container) comp);
            } else {
                applyThemeToComponent(comp);
            }
        }
    }
    
    private void applyThemeToComponent(Component comp) {
        if (darkMode) {
            applyDarkTheme(comp);
        } else {
            applyLightTheme(comp);
        }
    }
    
    private void applyDarkTheme(Component comp) {
        comp.setForeground(darkForeground);
        
        if (comp instanceof JComponent) {
            JComponent jcomp = (JComponent) comp;
            
            if (jcomp instanceof JPanel || jcomp instanceof JLabel) {
                jcomp.setBackground(darkBackground);
            } else if (jcomp instanceof JButton || jcomp instanceof JTextField || 
                       jcomp instanceof JComboBox || jcomp instanceof JList) {
                jcomp.setBackground(darkComponent);
                jcomp.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));
            }
            
            // Special cases
            if (jcomp instanceof JTextArea || jcomp instanceof JTextPane) {
                jcomp.setBackground(darkComponent);
                jcomp.setForeground(darkForeground);
            }
            
            if (jcomp instanceof JScrollPane) {
                jcomp.setBackground(darkBackground);
            }
        }
    }
    
    private void applyLightTheme(Component comp) {
        comp.setForeground(lightForeground);
        
        if (comp instanceof JComponent) {
            JComponent jcomp = (JComponent) comp;
            
            if (jcomp instanceof JPanel || jcomp instanceof JLabel) {
                jcomp.setBackground(lightBackground);
            } else if (jcomp instanceof JButton || jcomp instanceof JTextField || 
                       jcomp instanceof JComboBox || jcomp instanceof JList) {
                jcomp.setBackground(lightComponent);
                jcomp.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }
            
            // Special cases
            if (jcomp instanceof JTextArea || jcomp instanceof JTextPane) {
                jcomp.setBackground(Color.WHITE);
                jcomp.setForeground(lightForeground);
            }
            
            if (jcomp instanceof JScrollPane) {
                jcomp.setBackground(lightBackground);
            }
        }
    }
    
    public Color getBackgroundColor() {
        return darkMode ? darkBackground : lightBackground;
    }
    
    public Color getForegroundColor() {
        return darkMode ? darkForeground : lightForeground;
    }
    
    public Color getComponentColor() {
        return darkMode ? darkComponent : lightComponent;
    }
    
    public interface ThemeChangeListener {
        void onThemeChanged(boolean isDarkMode);
    }

}