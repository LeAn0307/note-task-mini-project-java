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
        this.setPreferredSize(new Dimension(400, 50));
        this.setBackground(new Color(232,248,134));
        this.setLayout(new GridLayout(1,2,5,5));
        this.setBorder(emptyBorder);
        this.setBackground(Color.white);

        //add btn button
        addTask = new JButton("Add");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 18));
        addTask.setBackground(new Color(162,185,9));
        addTask.setForeground(Color.white);
        addTask.setBorder(new RoundedBorder(20));
        this.add(addTask);

        //clear complete task btn
        clearTask = new JButton("Clear Done");
        clearTask.setBorder(emptyBorder);
        clearTask.setFont(new Font("Sans-serif", Font.PLAIN, 18));
        clearTask.setBackground(new Color(198,61,30));
        clearTask.setForeground(Color.white);
        clearTask.setBorder(new RoundedBorder(20));
        this.add(clearTask);
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClearTask() {
        return clearTask;
    }

    private static class RoundedBorder implements Border {
        private int radius;
        RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
}
