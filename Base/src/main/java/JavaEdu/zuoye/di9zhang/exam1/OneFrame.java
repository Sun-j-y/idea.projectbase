package JavaEdu.zuoye.di9zhang.exam1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentListener;

public class OneFrame extends JFrame implements ActionListener {
    JTextArea input = new JTextArea(5, 5);
    JTextArea output = new JTextArea(5, 5);
    JButton bu = new JButton("average");

    OneFrame(String s) {
        super(s);
        FlowLayout fly = new FlowLayout();

        setBounds(500, 320, 250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        input.setEditable(true);
        output.setEditable(true);
        add(input);
        add(output);
        input.requestFocus();
        add(bu);
        bu.addActionListener(this);
        setLayout(fly);
    }

    public void actionPerformed(ActionEvent e) {
        double n = 0, m = 0, x = 0;
        String s = input.getText();
        String[] sh = s.split(" ");
        for (String value : sh) {
            n = Double.parseDouble(value);
            m = m + n;
        }
        output.setText("??:" + m + "\n" + "?????:" + m / sh.length);
    }

}
