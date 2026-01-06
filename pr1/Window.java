package pr1;

import javax.swing.*;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Hello world");
        button.setBounds(150, 200, 50, 50);
        frame.add(button);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
