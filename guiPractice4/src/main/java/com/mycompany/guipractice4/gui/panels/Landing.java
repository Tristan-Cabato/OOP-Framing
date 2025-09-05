/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guipractice4.gui.panels;
import com.mycompany.guipractice4.gui.components.sidebarCreator;
import com.mycompany.guipractice4.gui.panels.landingPanels.dashboard;
import com.mycompany.guipractice4.gui.panels.landingPanels.profile;
import com.mycompany.guipractice4.utils.ThemePanel;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author tcabato
 */
public class Landing extends JPanel {
    private final CardLayout cardLayout;
    private final JPanel contentPanel;
    
    
    public Landing() {
        cardLayout = new CardLayout();
        contentPanel = new ThemePanel(cardLayout);
        
        initializePanel();
    }
    
    private void initializePanel() {
        setLayout(new BorderLayout());
        
        contentPanel.add(new dashboard(), "DASHBOARD");
        contentPanel.add(new profile(), "PROFILE");
        add(contentPanel, BorderLayout.CENTER);
        
//        JPanel sidebar = SidebarFactory.createNavigationSidebar(250, this::handleSidebarEvent);
//        add(sidebar, BorderLayout.WEST);
//        
        add(sidebarCreator.createCollapsible(250, 50, this::sidebarEvents), BorderLayout.WEST);
        sidebarEvents("DASHBOARD");
    }
    
    private void sidebarEvents(String text) {
        System.out.println("Clicked: " + text);
        switch (text) {
            case "DASHBOARD" -> cardLayout.show(contentPanel, "DASHBOARD");
            case "PROFILE" -> cardLayout.show(contentPanel, "PROFILE");
            case "ABOUT" -> cardLayout.show(contentPanel, "ABOUT");
            case "SETTING" -> cardLayout.show(contentPanel, "SETTING");
            case "LOGOUT" -> cardLayout.show(contentPanel, "LOGOUT");
            default -> System.out.println("sybau");
        }
    }
}
