import javax.swing.*;
import java.awt.*;

public class TestPanel extends JFrame{

    public TestPanel(){
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new BorderLayout());
        JTextField lbl1 = new JTextField("Time to be displayed here");
        p1.add(lbl1, BorderLayout.NORTH);
        JPanel pbtn = new JPanel(new GridLayout(4, 3));

        for (int i = 1; i <= 9; i++){
            pbtn.add(new JButton("" + i));
        }

        pbtn.add(new JButton("0"));
        pbtn.add(new JButton("Start"));
        pbtn.add(new JButton("Stop"));

        p1.add(pbtn, BorderLayout.CENTER);

        JButton lbl2 = new JButton("Food to be placed here");

        add(lbl2, BorderLayout.WEST);
        add(p1, BorderLayout.CENTER);

    }

    public static void main(String[] args){
        TestPanel frame = new TestPanel();
        frame.setTitle("TestPanel");
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}