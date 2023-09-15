import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    JFrame frame1 = new JFrame();
    frame1.setVisible(true);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame1.setSize(700, 500);
//    frame1.setLocation(200, 100);
        frame1.setBounds(400, 100, 400, 400);
        frame1.setTitle("mytitle");
        ImageIcon icon = new ImageIcon("E:\\java programs\\Swing\\jframe\\src\\Capture.png");
        frame1.setIconImage(icon.getImage());

    }
}