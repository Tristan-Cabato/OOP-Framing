package com.mycompany.nocaplanding;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author tcabato
 */
public class GUI extends JFrame {
    public GUI() {
        setTitle("Steam Mock UI");
        setSize(1920, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(24, 26, 27));
        sidebar.setPreferredSize(new Dimension(200, getHeight()));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        JLabel sidebarLogo = new JLabel(new ImageIcon("logo.png"), JLabel.CENTER);
        sidebarLogo.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0)); // Add some space below the logo
        sidebar.add(sidebarLogo);

        String[] sidebarItems = {"Your Store", "Categories", "Trending", "Recommended", "News", "Points Shop"};
        for (String item : sidebarItems) {
            JLabel label = new JLabel(item);
            label.setForeground(Color.WHITE);
            label.setFont(new Font("SansSerif", Font.PLAIN, 14));
            label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            sidebar.add(label);
        }

        // Top NavBar
        JPanel topNav = new JPanel();
        topNav.setBackground(new Color(35, 37, 38));
        topNav.setPreferredSize(new Dimension(getWidth(), 50));
        topNav.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));

        String[] navItems = {"Store", "Community", "About Us", "Support"};
        for (String item : navItems) {
            JLabel label = new JLabel(item);
            label.setForeground(Color.WHITE);
            label.setFont(new Font("SansSerif", Font.BOLD, 14));
            topNav.add(label);
        }

        // Main content area
        JPanel mainContent = new JPanel();
        mainContent.setBackground(new Color(42, 72, 94));
        mainContent.setLayout(new BoxLayout(mainContent, BoxLayout.Y_AXIS));
        mainContent.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Featured Game Panel
        JPanel featuredGame = new JPanel();
        featuredGame.setPreferredSize(new Dimension(800, 250));
        featuredGame.setOpaque(false);
        featuredGame.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.GRAY), 
            "All Games",
            TitledBorder.LEFT,
            TitledBorder.TOP,
            new Font("SansSerif", Font.BOLD, 14),
            Color.WHITE
        ));
        featuredGame.setLayout(new BorderLayout());

        JLabel gameTitle = new JLabel("This is a game");
        gameTitle.setForeground(Color.WHITE);
        gameTitle.setFont(new Font("SansSerif", Font.BOLD, 24));
        gameTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        featuredGame.add(gameTitle, BorderLayout.CENTER);

        // Add to main content
        mainContent.add(featuredGame);

        // Add all panels to JFrame
        add(topNav, BorderLayout.NORTH);
        add(sidebar, BorderLayout.WEST);
        add(mainContent, BorderLayout.CENTER);

        setVisible(true);
    }
}
