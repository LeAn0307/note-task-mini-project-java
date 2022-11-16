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

        //init frame
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //init variable
        title = new TitleBar();
        listItems = new List();
        btnPanel = new ButtonPanel();

        //add border layout (title,btn,...) into frame
        this.add(title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);
        this.add(listItems, BorderLayout.CENTER);


        //Get btn
        addTask = btnPanel.getAddTask();
        clear = btnPanel.getClearTask();

        //listen event to add new task and clear task
        addListeners();

    }
public void addListeners(){
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Task task = new Task();
                listItems.add(task);
                listItems.UpdateNumber();
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e);
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                listItems.removeCompletedTask();
                repaint();
            }
        });
}

}
