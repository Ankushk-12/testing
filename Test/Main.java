import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JCheckBox checkBox = new JCheckBox("Check Box");
        //Frame 
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.add(checkBox);
        frame.setVisible(true);

    }
}
