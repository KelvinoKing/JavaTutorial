import javax.swing.JFrame;

public class MyFrame{
    public static void main(String[] args){
        JFrame myFrame = new JFrame();
        myFrame.setSize(200,200);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}