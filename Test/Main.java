import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JCheckBox checkBox = new JCheckBox("Check Box");
        checkBox.setBounds(100, 100, 150, 50);
        System.out.println("Hello World");
        //Frame 
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.add(checkBox);
        frame.setVisible(true);

    }
}
