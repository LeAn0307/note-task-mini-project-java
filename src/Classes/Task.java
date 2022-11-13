package Classes;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private  JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean checked;

    public Task() {
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Color.red);
        this.setLayout(new BorderLayout());
        checked = false;
        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

        taskName = new JTextField("Your Task here!!");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.CYAN);
        this.add(taskName,BorderLayout.CENTER);
        done = new JButton("done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        this.add(done,BorderLayout.EAST);


    }


}
