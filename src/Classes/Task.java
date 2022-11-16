package Classes;

import javax.swing.*;
import java.awt.*;

import static javax.swing.BorderFactory.createLineBorder;

public class Task extends JPanel {
    private JLabel index;
    private JTextField taskName;
    private JButton done;
    private boolean checked;

    public Task() {
        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.white);
        this.setLayout(new BorderLayout());
//        this.setBorder(createLineBorder(new Color(103,193,205), 3));
        this.setBorder(createLineBorder(new Color(167, 180, 85), 2));


        checked = false;
        index = new JLabel("");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Your Task here!!");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.white);
        this.add(taskName, BorderLayout.CENTER);


        done = new JButton("Complete");
        done.setPreferredSize(new Dimension(60, 20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBackground(new Color(167, 180, 85));
        done.setForeground(Color.white);
        this.add(done, BorderLayout.EAST);

    }

    //    Change order
    public void changeIndex(int num) {
        this.index.setText(num + "");
        this.revalidate();
    }

    //Change state when completed
    public void changeState() {
        this.setBackground(Color.white);
        this.setBorder(createLineBorder(Color.white, 2));
        this.setBorder(createLineBorder(new Color(96, 98, 88), 2));
        done.setBackground(Color.gray);
        done.setText("Done");
        checked = true;
    }


    public JButton getDone() {
        return done;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean getState() {
        return checked;
    }
}
