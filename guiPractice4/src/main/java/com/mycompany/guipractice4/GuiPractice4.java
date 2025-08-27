/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guipractice4;
import com.mycompany.guipractice4.gui.mainFrame;
import javax.swing.*;


/**
 *
 * @author tcabato
 */
public class GuiPractice4 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {   
                e.printStackTrace();
            }
        });
        
        mainFrame main = new mainFrame();
        main.setVisible(true);
    }
}
