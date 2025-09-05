package com.mycompany.guipractice4.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.mycompany.guipractice4.gui.panels.Login;
import com.mycompany.guipractice4.gui.panels.Landing;
import com.mycompany.guipractice4.utils.*;

public class mainFrame extends JFrame{
    private JPanel mainPanel;
    private CardLayout cardLayout;
    private Dimension screenSize;
    private int screenWidth;
    private int screenHeight;

    public mainFrame(){
        initializeFrame();
        setupUI();
        ThemeManager.getInstance().applyThemeToContainer(this);
    }

    private void initializeFrame(){
        setTitle("Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 600));

        setLocationRelativeTo(null);

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = screenSize.width * 1/2;
        screenHeight = screenSize.height * 2/3;
        setSize(screenWidth, screenHeight);
    }

    private void setupUI(){
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel topPanel = new ThemePanel(new FlowLayout(FlowLayout.RIGHT));
        topPanel.add(new DarkModeToggle());
        add(topPanel, BorderLayout.NORTH);

        mainPanel.add(new Login(() -> showPanel("LANDING")), "LOGIN");
        mainPanel.add(new Landing(), "LANDING");

        add(mainPanel, BorderLayout.CENTER);
        showPanel("LOGIN");
    }

    public void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }
}