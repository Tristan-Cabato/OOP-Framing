package com.mycompany.guipractice4.gui.panels.landingPanels;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.mycompany.guipractice4.utils.ThemeManager;

public class dashboard extends JPanel implements ThemeManager.ThemeChangeListener{

    public dashboard(){
        setBackground(ThemeManager.getInstance().getComponentColor());
        setPreferredSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        ThemeManager.getInstance().addThemeChangeListener(this);
    }

    @Override
    public void onThemeChanged(boolean isDarkMode) {
        SwingUtilities.invokeLater(() -> {
            ThemeManager themeManager = ThemeManager.getInstance();
            setBackground(themeManager.getComponentColor());
            setForeground(themeManager.getForegroundColor());
        });
    }

    @Override
    public void removeNotify() {
        super.removeNotify();
        ThemeManager.getInstance().removeThemeChangeListener(this);
    }

}