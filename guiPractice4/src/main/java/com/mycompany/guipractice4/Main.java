package com.mycompany.guipractice4;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.mycompany.guipractice4.gui.mainFrame;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            mainFrame mainFrame = new mainFrame();
            mainFrame.setVisible(true);
        });
    }
}