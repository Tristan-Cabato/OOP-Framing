package com.mycompany.guipractice4.gui;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.guipractice4.gui.panels.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author tcabato
 */
public class mainFrame extends JFrame {
    private static CardLayout cardLayout;
    private static JPanel mainPanel;
    
    
    public mainFrame() {
        initializeFrame();
        setupUI();
    }
    
    private void initializeFrame() {
        setTitle("Gui Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setMinimumSize(new Dimension(20,200));
        setBackground(Color.BLACK);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width * 3/4, screenSize.height * 3/4);
    }
    
    private void setupUI() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        
        mainPanel.add(new Login(), "LOGIN");
        mainPanel.add(new Landing(), "Landing");
        
        // setLayout(cardLayout);  Panel cant contain cards???
        setContentPane(mainPanel);
        showCard("Login");
    }
    
    public static void showCard(String text) {
        cardLayout.show(mainPanel, text);
    }
}
