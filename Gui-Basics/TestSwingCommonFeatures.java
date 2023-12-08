import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.*;

public class TestSwingCommonFeatures extends JFrame{

    public TestSwingCommonFeatures(){

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        JButton btnLeft = new JButton("Left");
        JButton btnCenter = new JButton("Center");
        JButton btnRight = new JButton("Right");
        btnLeft.setBackground(Color.GREEN);
        btnCenter.setForeground(Color.WHITE);
        btnRight.setToolTipText("This is the right button");
        p1.add(btnLeft);
        p1.add(btnCenter);
        p1.add(btnRight);
        p1.setBorder(new TitledBorder("Three Buttons"));

        Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
        Border lineBorder = new LineBorder(Color.BLACK, 2);

        JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
        JLabel jlbRed = new JLabel("Red");
        JLabel jlbOrange = new JLabel("Orange");
        jlbRed.setForeground(Color.RED);
        jlbOrange.setForeground(Color.ORANGE);
        jlbRed.setFont(largeFont);
        jlbOrange.setFont(largeFont);
        jlbRed.setBorder(lineBorder);
        jlbOrange.setBorder(lineBorder);
        p2.add(jlbRed);
        p2.add(jlbOrange);
        p2.setBorder(new TitledBorder("Two Labels"));

        setLayout(new GridLayout(2, 1, 5, 5));
        add(p1);
        add(p2);
    }

    public static void main(String[] args){
        TestSwingCommonFeatures frame = new TestSwingCommonFeatures();
        frame.setSize(250, 200);
        frame.setLocationRelativeTo(null);
        frame.setTitle("SwingCommonFeatures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}