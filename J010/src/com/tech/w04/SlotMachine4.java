package com.tech.w04;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter4 extends JFrame implements ActionListener {

    private JLabel[] labels;
    private JButton button, btnreset;
    private int[] numbers;

    public MyCounter4() {

        setTitle("SlotMachine");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        labels = new JLabel[3];
        numbers = new int[3];

        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(numbers[i] + "");
            labels[i].setOpaque(true);
            labels[i].setBackground(new Color(255, 0, 100 * i));
            labels[i].setFont(new Font("impact", Font.BOLD, 100));
            labels[i].setSize(100, 100);
            labels[i].setLocation(100 + 120 * i, 20);
            panel.add(labels[i]);
        }

        button = new JButton("땡겨!");
        btnreset = new JButton("Reset");

        button.setSize(300, 50);
        button.setLocation(100, 150);

        btnreset.addActionListener(this);
        button.addActionListener(this);

        btnreset.setSize(300, 50);
        btnreset.setLocation(100, 200);

        panel.add(button);
        panel.add(btnreset);
        add(panel);

        setVisible(true);

    }

    int cnt = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            for (int i = 0; i < labels.length; i++) {
                numbers[i] = (int) (Math.random() * 10);
                labels[i].setText(numbers[i] + "");
            }
            if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
                button.setText("추카추카 : " + cnt);
                cnt++;
            }
        } else if (e.getSource() == btnreset) {
            for (int i = 0; i < labels.length; i++) {
                labels[i].setText("0");
            }
        }
    }

}

public class SlotMachine4 {

    public static void main(String[] args) {
        new MyCounter4();
    }

}