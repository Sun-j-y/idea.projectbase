package JavaEdu.zuoye.di9zhang.exam2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TwoFrame extends JFrame implements ActionListener{
	JButton bu1,bu2,bu3,bu4;
	JTextField x,y,z;
	TwoFrame(String s){
		super(s);
		FlowLayout fly = new FlowLayout();
		setLayout(fly);
		setBounds(500,400,500,500);
		bu1 = new JButton("¼Ó");
		bu2 = new JButton("¼õ");
		bu3 = new JButton("³Ë");
		bu4 = new JButton("³ý");
		add(bu1);
		add(bu2);
		add(bu3);
		add(bu4);
		x = new JTextField(10);
		y = new JTextField(10);
		z = new JTextField(10);
		bu1.addActionListener(this);
		bu2.addActionListener(this);
		bu3.addActionListener(this);
		bu4.addActionListener(this);
		add(x);
		add(y);
		add(z);
		x.setEditable(true);
		y.setEditable(true);
		z.setEditable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Object t = e.getSource();
		double m=0,n=0;
		String g,h;
		g = x.getText();
		h = y.getText();
		m = Double.parseDouble(g);
		n = Double.parseDouble(h);
		if(t == bu1) {
			z.setText("=" + (n + m));
			
		}
		else if(t == bu2) {
			z.setText("=" + (n - m));
	
		}
		else if(t == bu3) {
			z.setText("=" + n*m);
		}
		else {
			z.setText("=" + m/n);
			
		}
	}

}
