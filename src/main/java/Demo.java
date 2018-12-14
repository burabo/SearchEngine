import javax.swing.*;
import java.awt.*;
public class Demo {

    JFrame frame = new JFrame("Barra de pesquisa");

    public Demo() {

        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(new JTextField(20));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}

