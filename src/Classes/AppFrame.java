package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {
    private TitleBar title;
    private List listItems;
    private ButtonPanel btnPanel;

    private JButton addTask;
    private JButton clear;

    public AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //init
        title = new TitleBar();
        listItems = new List();
        btnPanel = new ButtonPanel();
        //add border layout title into frame
        this.add(title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);
        this.add(listItems, BorderLayout.CENTER);
        addTask = btnPanel.getAddTask();
        clear = btnPanel.getClearTask();
        addListeners();

    }
public void addListeners(){
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Task task = new Task();
                listItems.add(task);
                revalidate();
            }
        });
}

}
