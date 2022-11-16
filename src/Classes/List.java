package Classes;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    List(){
        this.setLayout(new GridLayout(10,1,0,5));
        this.setBackground( new Color(231,241,169));

    }
   //    Update Index
    public void UpdateNumber(){
        Component [] listItems = this.getComponents();

        for (int i = 0; i<listItems.length; i++ ){
            if (listItems[i] instanceof Task){
                ((Task)listItems[i]).changeIndex(i+1);
            }
        }
    }

    // remove
    public void removeCompletedTask(){
        for(Component c : getComponents())
        {
            if(c instanceof Task)
            {
                if(((Task)c).getState())
                {
                    remove(c);
                    updateNumbers();
                }
            }
        }
    }

    public void updateNumbers()
    {
        Component[] listItems = this.getComponents();

        for(int i = 0;i<listItems.length;i++)
        {
            if(listItems[i] instanceof Task)
            {
                ((Task)listItems[i]).changeIndex(i+1);
            }
        }

    }

}
