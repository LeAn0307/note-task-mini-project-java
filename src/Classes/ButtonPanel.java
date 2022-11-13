package Classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JButton {
    private JButton addTask;
    private JButton clearTask;
    Border emptyBorder = BorderFactory.createEmptyBorder();

    //Constructor

    ButtonPanel() {
        this.setPreferredSize(new Dimension(400, 60));
        this.setBackground(Color.yellow);

        this.setLayout(new GridLayout(1,2,10,10));
        //add btn button
        addTask = new JButton("Add");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(addTask);
//        this.add(Box.createHorizontalStrut(10));
        //clear complete task btn
        clearTask = new JButton("Clear All");
        clearTask.setBorder(emptyBorder);
        clearTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(clearTask);
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClearTask() {
        return clearTask;
    }
}
