/**
 * Created by tom on 26/03/15.
 */
import javax.swing.*;
import java.awt.*;

public class HelloWorldSwing {
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("HellowWorld");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Pane`s layout
        Container cp = frame.getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new ButtonPanel());

        /*
        //create button
        JButton b1 = new JButton("click me");
        //JButton b2 = new JButton("shit");
        JLabel l1 = new JLabel("OK");

        //JPanel
        JPanel jp1 = new JPanel(new BorderLayout());
        JPanel jp2 = new JPanel(new BorderLayout());
        jp2.setBackground(Color.red);

        jp1.add(b1, BorderLayout.CENTER);
        cp.add(jp1);
        jp2.add(l1, BorderLayout.EAST);
        cp.add(jp2);

        //JList
        String[] lines = {"a","b","c"};
        JList list = new JList(lines);
        cp.add(list);

        //JCheckBox
        cp.add(new JCheckBox());




        //add button
        cp.add(b1);
        //cp.add(b2);
*/
        //show the window
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        //anonymous class
        Runnable tr = new Runnable() {//runnable is an interface/class
            @Override//in{}, we implement the inherited func, doing override or implement the method in interface
            public void run() {
                createAndShowGUI();
            }
        };
        javax.swing.SwingUtilities.invokeLater(tr);
    }
}
