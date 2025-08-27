package com.mycompany.guipractice4.gui.panels;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.guipractice4.gui.components.buttonCreator;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author tcabato
 */
public class Login extends JPanel {
    public Login() {
        setBackground(Color.BLACK);
        add(new buttonCreator("Login"));
        add(new buttonCreator("Sign Up"));
    }
    
    public JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(200,20));
        button.setBackground(Color.WHITE);
        setFocusable(false);
        
        return button;
    }
}
