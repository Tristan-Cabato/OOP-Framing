import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Framing extends JFrame {
    public Framing() {
        // JFrame frame = new JFrame(); Generating another frame technically

        // Starting Layout
            this.setTitle("OOP");
            this.setSize(800, 600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);

            ImageIcon icon = new ImageIcon("C:\\Users\\tcabato\\Pictures\\Screenshots\\Screenshot 2025-07-28 080107.png");
            this.setIconImage(icon.getImage());

            this.getContentPane().setBackground(new Color(108, 124, 147));

            // Label
            JLabel label = new JLabel();
            JLabel label2 = new JLabel();


            label.setText("Skiblidi");
                label.setForeground(Color.CYAN); 
                label.setBackground(Color.BLACK); 
                label.setOpaque(false);
                label.setFont(new Font("MV Boli", Font.BOLD, 30));
                label.setVerticalAlignment(JLabel.BOTTOM);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBounds(100, 100, 200, 100);
            
            label2.setText("This is another label!"); 
                label2.setForeground(Color.CYAN); 
                label2.setBackground(Color.BLACK); 
                label2.setOpaque(false);
                label2.setFont(new Font("MV Boli", Font.BOLD, 30));
                label2.setVerticalAlignment(JLabel.TOP);
                label2.setHorizontalAlignment(JLabel.CENTER);
                label2.setBounds(100, 250, 500, 100);

                
            this.add(label);
            this.add(label2);
                
        // Border
            Border border = BorderFactory.createLineBorder(Color.BLUE, 6, true);
            // Border frameborder = BorderFactory.createSoftBevelBorder(5);
            label.setBorder(border);
            label2.setBorder(border);
            

        // this.setBorder(frameborder);
        this.setLayout(null);
        this.setVisible(true);
    }
}
