package JavaEdu.zuoye.di9zhang.exam3;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ThreeFrame extends JFrame implements ActionListener {
    ThreeTrapezoid trapezoid = new ThreeTrapezoid();
    JTextField up = new JTextField(10);
    JTextField bottom = new JTextField(10);
    JTextField high = new JTextField(10);
    JTextArea show = new JTextArea();
    JButton bu = new JButton("面积");

    ThreeFrame(String s) {
        super(s);
        init();
        setVisible(true);
        setBounds(500, 500, 550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void init() {
        JPanel north = new JPanel();
        north.add(new JLabel("上低"));
        north.add(up);
        north.add(new JLabel("下底"));
        north.add(bottom);
        north.add(new JLabel("高"));
        north.add(high);
        north.add(bu);
        bu.addActionListener(this);
        add(north, BorderLayout.NORTH);
        add(new JScrollPane(show), BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        double a, b, c;
        a = Double.parseDouble(up.getText().trim());
        b = Double.parseDouble(bottom.getText().trim());
        c = Double.parseDouble(high.getText().trim());
        String area = trapezoid.setArea(a, b, c) + "";
        show.append("梯形面积" + area);

    }

}
