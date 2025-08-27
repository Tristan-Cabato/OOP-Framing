/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guipractice4.gui.components;
import com.mycompany.guipractice4.gui.mainFrame;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author tcabato
 */
public class buttonCreator extends JButton {
    public buttonCreator(String text) {
        setPreferredSize(new Dimension(200,20));
        setBackground(Color.WHITE);
        setFocusable(false);
        setText(text);
        
        addActionListener(var -> {
            mainFrame.showCard("Landing");
        });
    }
}
