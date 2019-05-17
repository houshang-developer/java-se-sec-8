package gui.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 401-06 on 5/16/2019.
 */
public class App1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("Click on Me");
            button.addActionListener(new Listener());
            frame.getContentPane().add(button);
        }




        frame.setVisible(true);
    }
}

class Listener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");
    }
}