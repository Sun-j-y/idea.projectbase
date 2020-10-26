package JavaEdu.Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.*;
import javax.swing.*;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/6/17-17:54
 */
public class GDBH extends Frame implements ActionListener {
    private Button button;
    private TextField text1;
    private TextArea text2;

    public GDBH() {
        super("验证哥德巴赫猜想");
        this.setBounds(450, 200, 350, 400);
        this.setResizable(false);
        this.setBackground(Color.lightGray);
        this.setLayout(new FlowLayout());
        this.add(new Label("输入一个整数"));
        text1 = new TextField("", 20);
        this.add(text1);
        button = new Button("验证哥德巴赫猜想");
        this.add(button);
        button.addActionListener(this);
        this.setLayout(new FlowLayout());
        text2 = new TextArea(20, 25);
        text2.setEditable(false);
        this.add(text2);
        this.setVisible(true);
        this.addWindowListener(new WinClose());
    }

    public static void main(String[] args) {
        new GDBH();
    }

    public void actionPerformed(ActionEvent e) {
        String str = text1.getText();
        try {
            long num = Long.parseLong(str);
            text2.setText(yz(num));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "\"" + str + "\"字符串不能转换成整数，请重新输入！！");
        }
    }

    public String yz(long num) {
        String str1 = "";
        if (num > 2 && num % 2 == 0) {
            for (long i = 2; i <= num / 2; i++) {
                for (long j = num / 2; j < num; j++) {
                    if (Prime(i) && Prime(j)) {
                        if (num == i + j) {
                            str1 += num + " = " + i + " + " + j + ";\n";
                        }
                    }
                }
            }
        } else if (num > 5 && num % 2 != 0) {
            for (long i = 2; i < num; i++) {
                for (long j = i; j < num; j++) {
                    for (long k = j; k < num; k++) {
                        if (Prime(i) && Prime(j) && Prime(k)) {
                            if (num == i + j + k) {
                                str1 += num + " = " + i + " + " + j + " + " + k + " ;\n";
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "输入错误!必须是大于2的偶数或大于5的奇数！！");

        }
        return str1;

    }

    public boolean Prime(long t) {
        for (long i = 2; i < t; i++) {
            if (t % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class WinClose implements WindowListener {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }
}
