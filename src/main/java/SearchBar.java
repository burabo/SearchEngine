import javax.swing.*;
import java.awt.*;

public class SearchBar extends Thread {

    String sharedString;

    JFrame frame = new JFrame("Barra de pesquisa");

    @Override
    public void run() {

        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField text = new JTextField("Texto aqui",20);

        frame.add(text);
        frame.setVisible(true);

        sharedString = text.getText();
    }


}
