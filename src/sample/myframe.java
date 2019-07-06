package sample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class myframe extends JFrame {
    private JButton button = new JButton("Выбрать");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Введите имя:");
    private JRadioButton radio1 = new JRadioButton("Мужской");
    private JRadioButton radio2 = new JRadioButton("Женский");
    private JCheckBox check = new JCheckBox("Согласна/ен", false);

    public myframe () {
        super("Работник");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener () );
        container.add(button);
    }
    class ButtonEventListener implements ActionListener {
        public  void actionPerformed (ActionEvent e) {
            String message = "";
            message += "Кнопка нажата\n";
            message += "Имя " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Мужской" : "Женский" + "пол");
            message += "С условиями " + ((check.isSelected()) ? "Согласен" : "Не согласен");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}