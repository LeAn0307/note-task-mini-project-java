package Classes;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class TitleBar extends JPanel {
    TitleBar() {
        //container - header
        this.setPreferredSize(new Dimension(400, 150));
//      this.setBackground(new Color(159, 175, 33));
        this.setBackground(Color.white);

        // Add title image

        JLabel titleText = new JLabel();
        URL url = getClass().getResource("../note.jpg");
        ImageIcon imgIcon= new ImageIcon(url);
        Image image = imgIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
        imgIcon= new ImageIcon(newimg);
        titleText.setIcon(imgIcon);
        /// add text title
//        titleText.setPreferredSize(new Dimension(200, 60));
//        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
//        titleText.setForeground(new Color(0xffffdd));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);



    }
}
