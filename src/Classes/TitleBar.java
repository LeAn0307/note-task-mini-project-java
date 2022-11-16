package Classes;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    TitleBar() {
        //container - header
        this.setPreferredSize(new Dimension(400, 60));
        this.setBackground(new Color(159, 175, 33));
        // Add text title
        JLabel titleText = new JLabel("Task Notes");
        titleText.setPreferredSize(new Dimension(200, 60));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setForeground(new Color(0xffffdd));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);



    }
}
