package JavaEdu.zuoye.di9zhang.experiment1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComputerFrame extends JFrame {
    JMenuBar menuBar;
    JMenu choiceGrade;  // ѡ�񼶱�ò˵�
    JMenuItem grade1, grade2;
    JTextField textOne, textTwo, textResult;
    JButton getProblem, giveAnswer;
    JLabel operatorLabel, message;
    Teacher teacherHZhang;

    ComputerFrame() {
        teacherHZhang = new Teacher();
        teacherHZhang.setMaxInteger(20);
        setLayout(new FlowLayout());
        menuBar = new JMenuBar();
        choiceGrade = new JMenu("ѡ�񼶱�");
        grade1 = new JMenuItem("�׶�����");
        grade2 = new JMenuItem("��ͯ����");
        grade1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacherHZhang.setMaxInteger(10);
            }
        });
        grade2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacherHZhang.setMaxInteger(50);
            }
        });

        choiceGrade.add(grade1);
        choiceGrade.add(grade2);
        menuBar.add(choiceGrade);
        setJMenuBar(menuBar);
        textOne = new JTextField(5);
        textTwo = new JTextField(5);
        textResult = new JTextField(5);
        operatorLabel = new JLabel("+");
        operatorLabel.setFont(new Font("Arial", Font.BOLD, 20));
        message = new JLabel("�㻹û�лش���");
        getProblem = new JButton("��ȡ��Ŀ");
        giveAnswer = new JButton("ȷ�ϴ�");

        add(getProblem);
        add(textOne);
        add(operatorLabel);
        add(textTwo);
        add(new JLabel("="));
        add(textResult);
        add(giveAnswer);
        add(message);

        textResult.requestFocus();
        textOne.setEditable(false);
        textTwo.setEditable(false);
        getProblem.setActionCommand("getProblem");
        textResult.setActionCommand("answer");
        giveAnswer.setActionCommand("answer");
        teacherHZhang.setJTextField(textOne,textTwo,textResult);
        teacherHZhang.setJLabel(operatorLabel,message);

        getProblem.addActionListener(teacherHZhang);
        giveAnswer.addActionListener(teacherHZhang);
        textResult.addActionListener(teacherHZhang);



        setVisible(true);
        validate();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
