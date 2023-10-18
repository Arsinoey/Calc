import java.awt;
import javax.swing.JFrame;

public class MainClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("My Temperature Calculator");
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add("panel");
        frame.setVisible(true);

        

    }
}