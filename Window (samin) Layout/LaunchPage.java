package com.mycompany.guipractice3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.mycompany.guipractice3.NextPage;
import java.awt.GridLayout;

public class LaunchPage extends JFrame {
    JFrame frame = new JFrame();
    public LaunchPage() {
        // Setup
            frame.setSize(new Dimension(400, 400));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setTitle("GUI 3");
            frame.setLocationRelativeTo(null);
            frame.setLayout(new GridLayout(8, 8));

            ArrayList<JPanel> panels = new ArrayList<>();
                for (int i = 0; i < 64; i++) {
                    panels.add(createPanel());
                }
                for (JPanel panel : panels) {
                    frame.add(panel);
                }
        frame.pack();        
        frame.setVisible(true);
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(100, 100));
            panel.setBackground(Color.LIGHT_GRAY);
            panel.setBorder(BorderFactory.createBevelBorder(5));
            panel.setLayout(new BorderLayout());

            Random random = new Random();
            JLabel label = new JLabel("2B-%d".formatted(random.nextInt(100, 1000)));
                label.setHorizontalTextPosition(JLabel.CENTER);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setPreferredSize(new Dimension(100, 20));
                panel.add(label, BorderLayout.SOUTH);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(Color.DARK_GRAY);
                panel.repaint();
                label.setForeground(Color.WHITE);
                label.repaint();
            } @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
                panel.repaint();
                label.setForeground(Color.BLACK);
                label.repaint();
            } @Override
            public void mousePressed(MouseEvent e) {
                panel.setBackground(Color.MAGENTA);
                panel.repaint();
            } @Override
            public void mouseReleased(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
                panel.repaint();
            } @Override
            public void mouseClicked(MouseEvent e) {
                NextPage newPage = new NextPage();
                frame.dispose();
            }
        });

        return panel;
    }
}