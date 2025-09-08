package com.mycompany.nocapgameslauncher;

import javax.swing.*;
import java.awt.*;

public class Friends extends JFrame {

    public Friends() {
        setTitle("Friends");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        // Create a list model and add friends
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Friend 1");
        listModel.addElement("Friend 2");
        listModel.addElement("Friend 3");
        listModel.addElement("Friend 4");
        listModel.addElement("Friend 5");

        // Create the JList and customize it
        JList<String> friendList = new JList<>(listModel);
        friendList.setBackground(new Color(0x1e1e1e));
        friendList.setForeground(Color.WHITE);
        friendList.setSelectionBackground(new Color(0x333333));
        friendList.setSelectionForeground(Color.WHITE);
        friendList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                c.setBackground(isSelected ? new Color(0x333333) : new Color(0x1e1e1e));
                c.setForeground(Color.WHITE);
                setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
                return c;
            }
        });

        // Add the list to a scroll pane
        JScrollPane scrollPane = new JScrollPane(friendList);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(0x333333)));

        // Add the scroll pane to the frame
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Friends friends = new Friends();
            friends.setVisible(true);
        });
    }
}
