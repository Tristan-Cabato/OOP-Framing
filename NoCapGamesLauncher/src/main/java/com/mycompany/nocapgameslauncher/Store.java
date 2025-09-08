/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nocapgameslauncher;

/**
 *
 * @author ljamaiso
 */
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.URL;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import com.mycompany.nocapgameslauncher.gui.mainFrame;

// Main class for the No Cap Games Launcher application
public class Store extends JFrame {
    private static final boolean DEBUG = true;

    // Main panels for the layout
    private JPanel mainPanel;
    private JPanel contentContainer;
    private JPanel cardsPanel;
    private ArrayList<JPanel> gameCardsList;

    // Constructor to set up the main application window
    public Store() {
        // Set up the main window properties
        setTitle("No Cap Games Launcher");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1280, 720)); // Set a fixed size
        setResizable(false); // Disable resizing
        setLocationRelativeTo(null); // Center the window

        // Use BorderLayout for the main structure (sidebar and main content)
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(0x121212));
        add(mainPanel);

        // Create the header
        createHeader();

        // Create the main content area
        createContentView();
    }

    // Creates the static top header panel
    private void createHeader() {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(0x202020));
        headerPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        // Header links (static)
        JPanel headerLinks = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        headerLinks.setBackground(new Color(0x202020));
        
        JButton homeButton = createHeaderLink("Home");
        homeButton.addActionListener(e -> {
            mainFrame frame = new mainFrame();
            frame.setVisible(true);
            this.dispose();
        });
        JButton storeLink = createHeaderLink("Store");
        JButton friendsLink = createHeaderLink("Friends");
        friendsLink.addActionListener(e -> {
            Friends friends = new Friends();
            friends.setVisible(true);
        });
        headerLinks.add(homeButton);
        headerLinks.add(storeLink);
        headerLinks.add(friendsLink);
        headerPanel.add(headerLinks, BorderLayout.WEST);

        // Search bar (static)
        JTextField searchBar = new JTextField("Search games...");
        searchBar.setForeground(new Color(0x888888));
        searchBar.setBackground(new Color(0x333333));
        searchBar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(0x444444)),
            new EmptyBorder(8, 15, 8, 15)
        ));
        searchBar.setPreferredSize(new Dimension(400, 30));
        searchBar.setToolTipText("Search games...");
        searchBar.putClientProperty("JComponent.roundedCorners", true);
        JPanel searchPanel = new JPanel(new GridBagLayout());
        searchPanel.setBackground(new Color(0x202020));
        searchPanel.add(searchBar);
        headerPanel.add(searchPanel, BorderLayout.CENTER);

        // Profile icon (static)
        JPanel profilePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        profilePanel.setBackground(new Color(0x202020));
        
        JButton profileIcon = new JButton("O");
        profileIcon.setFont(new Font("Arial", Font.PLAIN, 24));
        profileIcon.setForeground(Color.WHITE);
        profileIcon.setBackground(new Color(0x202020));
        profileIcon.setBorderPainted(false);
        profileIcon.setFocusPainted(false);
        profileIcon.setContentAreaFilled(false);
        profilePanel.add(profileIcon);
        profileIcon.addActionListener(e -> {
            ProfileWindow profileWindow = new ProfileWindow(this);
            Point location = profileIcon.getLocationOnScreen();
            profileWindow.setLocation(location.x - profileWindow.getWidth() + profileIcon.getWidth(), location.y + profileIcon.getHeight());
            profileWindow.setVisible(true);
        });
        
        headerPanel.add(profilePanel, BorderLayout.EAST);
        mainPanel.add(headerPanel, BorderLayout.NORTH);
    }
    
    // Helper method to create a static header link button
    private JButton createHeaderLink(String text) {
        JButton link = new JButton(text);
        link.setForeground(Color.WHITE);
        link.setBackground(new Color(0x202020));
        link.setBorderPainted(false);
        link.setFocusPainted(false);
        link.setContentAreaFilled(false);
        return link;
    }

    // Utility to load icons from classpath first, then fallback to filesystem during dev
    private ImageIcon loadIcon(String resourcePath) {
        if (DEBUG) System.out.println("loadIcon called with: " + resourcePath);
        URL url = getClass().getResource(resourcePath);
        if (url != null) {
            if (DEBUG) System.out.println(" → Loaded from classpath: " + url);
            return new ImageIcon(url);
        }
        // Fallback: look under project tree when running from IDE/mvn exec
        String rp = resourcePath.startsWith("/") ? resourcePath.substring(1) : resourcePath;
        File f1 = new File("src/main/resources/" + rp);
        File f2 = new File("src/" + rp); // e.g., src/Resources/...
        File pick = f1.exists() ? f1 : (f2.exists() ? f2 : null);
        if (pick != null) {
            if (DEBUG) System.out.println(" → Loaded from filesystem: " + pick.getAbsolutePath());
            return new ImageIcon(pick.getAbsolutePath());
        }
        if (DEBUG) {
            System.out.println(" ✗ Could not find: " + resourcePath);
            System.out.println("   Tried classpath, then: " + f1.getAbsolutePath() + " and " + f2.getAbsolutePath());
        }
        // Last resort: placeholder so UI still renders
        BufferedImage img = new BufferedImage(320, 180, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        g.setColor(new Color(0x2a2a2a));
        g.fillRect(0,0,320,180);
        g.setColor(Color.LIGHT_GRAY);
        g.drawString("Image missing: " + resourcePath, 10, 20);
        g.dispose();
        return new ImageIcon(img);
    }

    // Creates the main content view (Game Store)
    private void createContentView() {
        try {
            contentContainer = new JPanel();
            contentContainer.setLayout(new BoxLayout(contentContainer, BoxLayout.Y_AXIS));
            contentContainer.setBackground(new Color(0x121212));
            contentContainer.setBorder(new EmptyBorder(20, 20, 20, 20));

            JLabel titleLabel = new JLabel("Game Store");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
            titleLabel.setForeground(new Color(0xef4444));
            titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            contentContainer.add(titleLabel);
            contentContainer.add(Box.createRigidArea(new Dimension(0, 20)));

            cardsPanel = new JPanel(new GridLayout(0, 4, 20, 20));
            cardsPanel.setBackground(new Color(0x121212));
            cardsPanel.setBorder(new EmptyBorder(20, 0, 0, 0));

            gameCardsList = new ArrayList<>();
            
            // Temporary game cards for the store
            ImageIcon tempIcon1 = loadIcon("/Resources/temp1.jpg");
            ImageIcon tempIcon2 = loadIcon("/Resources/temp2.jpg");
            ImageIcon tempIcon3 = loadIcon("/Resources/temp3.jpg");
            ImageIcon tempIcon4 = loadIcon("/Resources/temp4.jpg");
            ImageIcon tempIcon5 = loadIcon("/Resources/temp5.jpg");
            ImageIcon tempIcon6 = loadIcon("/Resources/temp6.jpg");
            ImageIcon tempIcon7 = loadIcon("/Resources/temp7.jpg");
            ImageIcon tempIcon8 = loadIcon("/Resources/temp8.jpg");

            gameCardsList.add(createGameCard("Temporary Game 1", "Description for temporary game 1.", tempIcon1));
            gameCardsList.add(createGameCard("Temporary Game 2", "Description for temporary game 2.", tempIcon2));
            gameCardsList.add(createGameCard("Temporary Game 3", "Description for temporary game 3.", tempIcon3));
            gameCardsList.add(createGameCard("Temporary Game 4", "Description for temporary game 4.", tempIcon4));
            gameCardsList.add(createGameCard("Temporary Game 5", "Description for temporary game 5.", tempIcon5));
            gameCardsList.add(createGameCard("Temporary Game 6", "Description for temporary game 6.", tempIcon6));
            gameCardsList.add(createGameCard("Temporary Game 7", "Description for temporary game 7.", tempIcon7));
            gameCardsList.add(createGameCard("Temporary Game 8", "Description for temporary game 8.", tempIcon8));


            for (JPanel card : gameCardsList) {
                cardsPanel.add(card);
            }

            JScrollPane scrollPane = new JScrollPane(cardsPanel);
            scrollPane.setBorder(BorderFactory.createEmptyBorder());
            scrollPane.setBackground(new Color(0x121212));
            scrollPane.getViewport().setBackground(new Color(0x121212));
            scrollPane.getVerticalScrollBar().setUnitIncrement(16);


            contentContainer.add(scrollPane);

            mainPanel.add(contentContainer, BorderLayout.CENTER);
        } catch (Throwable t) {
            t.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Failed to build content: " + t.getClass().getSimpleName() + " - " + t.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    // Creates a single static Game Card panel
    private JPanel createGameCard(String title, String description, ImageIcon icon) {
        JPanel card = new JPanel(new BorderLayout(10, 10));
        card.setBackground(new Color(0x1e1e1e));
        card.setBorder(BorderFactory.createLineBorder(new Color(0x333333), 1));

        // Scale image to fixed size (e.g., 200x120)
        Image scaled = icon.getImage().getScaledInstance(-1, 120, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(scaled)) {
            @Override
            public void setBounds(int x, int y, int width, int height) {
                super.setBounds(x, y, width, height);
                if (icon != null) {
                    Image scaledDynamic = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                    setIcon(new ImageIcon(scaledDynamic));
                }
            }
        };
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        card.add(imageLabel, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel(title);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        card.add(titleLabel, BorderLayout.NORTH);

        JTextArea descArea = new JTextArea(description);
        descArea.setWrapStyleWord(true);
        descArea.setLineWrap(true);
        descArea.setEditable(false);
        descArea.setForeground(new Color(0xBBBBBB));
        descArea.setBackground(new Color(0x1e1e1e));
        descArea.setFont(new Font("Arial", Font.PLAIN, 12));
        card.add(descArea, BorderLayout.SOUTH);

        return card;
    }

    // Main entry point
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Store launcher = new Store();
            launcher.setVisible(true);
        });
    }
}
