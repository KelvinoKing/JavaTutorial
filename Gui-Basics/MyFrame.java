import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame{
    public static void main(String[] args){
        JFrame myFrame = new JFrame("MyFrameWithComponents");

        JButton btn = new JButton("Ok");
        myFrame.add(btn);

        myFrame.setSize(200,200);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}