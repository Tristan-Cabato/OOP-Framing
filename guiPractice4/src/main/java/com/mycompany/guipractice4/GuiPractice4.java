package com.mycompany.guipractice4;

import javax.swing.SwingUtilities;

import com.mycompany.guipractice4.gui.mainFrame;

public class GuiPractice4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            mainFrame frame = new mainFrame();
            frame.setVisible(true);
        });
    }
}
