package com.mycompany.guipractice4.gui.panels.landingPanels;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;

import com.mycompany.guipractice4.gui.components.sidebarCreator;

public class LoginPanel extends JPanel{
    private CardLayout cardlayout;
    private JPanel mainpanel;
    
    public LoginPanel(){
        cardlayout = new CardLayout();
        mainpanel = new JPanel(cardlayout);
        initializePanel();
        // ThemeManager.getInstance().applyThemeToContainer(this);
    }

    private void initializePanel(){
        setLayout(new BorderLayout());

        // JPanel topPanel = new ThemePanel(new FlowLayout(FlowLayout.RIGHT));
        // topPanel.add(new DarkModeToggle());
        // add(topPanel, BorderLayout.NORTH);

        // JPanel sidebar = SidebarFactory.createNavigationSidebar(250, this::handleSidebarSelection);
        JPanel sidebar = sidebarCreator.createCollapsible(250, 50, this::handleSidebarSelection);

        add(sidebar, BorderLayout.WEST);

        mainpanel.add(new dashboard(), "DASHBOARD");
        mainpanel.add(new profile(), "PROFILE");
        add(mainpanel, BorderLayout.CENTER);
        cardlayout.show(mainpanel, "DASHBOARD");
    }

    private void handleSidebarSelection(String item) {
        System.out.println("Selected: " + item);
        // Handle sidebar item selection
        switch (item) {
            case "Dashboard":
                // Show dashboard
                cardlayout.show(mainpanel, "DASHBOARD");
                break;
            case "Profile":
                // Show profile
                cardlayout.show(mainpanel, "PROFILE");
                break;
            // ... other cases
        }
    }
}