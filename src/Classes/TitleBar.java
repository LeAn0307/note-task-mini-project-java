package Classes;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    TitleBar() {
        //container - header
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.gray);
        // Add text title
        JLabel titleText = new JLabel("Task Notes");
        titleText.setPreferredSize(new Dimension(200, 80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);



    }
}
