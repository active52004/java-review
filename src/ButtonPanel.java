import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tom on 26/03/15.
 */
public class ButtonPanel extends JPanel {
    public ButtonPanel(){
        JButton yB = new JButton("yellow");
        JButton rB = new JButton("red");

        this.add(yB);
        this.add(rB);

        //register ActionListener
        ColorAction yA = new ColorAction(Color.yellow);
        ColorAction rA = new ColorAction(Color.red);
        yB.addActionListener(yA);
        rB.addActionListener(rA);
    }

    //actionlistner as a inner class
    private class ColorAction implements ActionListener {
        public ColorAction(Color c){
            backgroundColor = c;
        }
        //action method
        public void actionPerformed(ActionEvent event){
            setBackground(backgroundColor);
            repaint();

        }
        private Color backgroundColor;
    }


}
