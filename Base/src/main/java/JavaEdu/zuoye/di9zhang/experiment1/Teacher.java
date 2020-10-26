package JavaEdu.zuoye.di9zhang.experiment1;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Teacher implements ActionListener {

    int numberOne, numberTwo;
    String operator = "";
    boolean isRight;
    Random random;
    int maxInteger;

    JTextField textOne, textTwo, textResult;
    JLabel opeartorLable, message;

    public Teacher() {
        random = new Random();
    }

    public void setMaxInteger(int n) {
        maxInteger = n;
    }

    public void setJTextField(JTextField... t) {
        textOne = t[0];
        textTwo = t[1];
        textResult = t[2];
    }

    public void setJLabel(JLabel... label) {
        opeartorLable = label[0];
        message = label[1];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("getProblem")) {
            numberOne = random.nextInt(maxInteger) + 1;
            numberTwo = random.nextInt(maxInteger) + 1;
            double d = Math.random();     // ��ȡ(0,1)֮��������
            if (d >= 0.5) {
                operator = "+";
            } else {
                operator = "-";
            }
            textOne.setText("" + numberOne);
            textTwo.setText("" + numberTwo);
            opeartorLable.setText(operator);
            message.setText("��ش�");
            textResult.setText(null);
        } else if (str.equals("answer")) {
            String answer = textResult.getText();
            try {
                int result = Integer.parseInt(answer);

                if (operator.equals("+")) {
                    if (result == numberOne + numberTwo) {
                        message.setText("��ش���ȷ");
                    } else {
                        message.setText("��ش����");
                    }

                } else if (operator.equals("-")) {
                    if (result == numberOne - numberTwo) {
                        message.setText("��ش���ȷ");
                    } else {
                        message.setText("��ش����");
                    }
                }
            } catch (NumberFormatException exception) {
                message.setText("�����������ַ�");
            }
        }
    }
}


