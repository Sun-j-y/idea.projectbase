package JavaEdu.zuoye.di9zhang.experiment2;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalenderFrame extends JFrame implements ActionListener {

    JLabel labelDay[] = new JLabel[42];
    JButton titlename[] = new JButton[7];
    String name[] = {"��", "һ", "��", "��", "��", "��", "��"};
    JButton nextMonth, previousMonth;
    CalenderBean calender;
    JLabel showMessage = new JLabel("", JLabel.CENTER);
    int year = 2011, month = 2;

    public CalenderFrame() {
        JPanel pCenter = new JPanel();
        // ��pCenterJPanel�Ĳ�������Ϊ7��7�е�GridLayout����
        pCenter.setLayout(new GridLayout(7, 7));

        for (int i = 0; i < 7; i++) {
            titlename[i] = new JButton(name[i]);
            titlename[i].setBorder(new SoftBevelBorder(BevelBorder.RAISED));
            pCenter.add(titlename[i]);
        }
        for (int i = 0; i < 42; i++) {
            labelDay[i] = new JLabel("", JLabel.CENTER);
            labelDay[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
            pCenter.add(labelDay[i]);
        }
        calender = new CalenderBean();
        nextMonth = new JButton("����");
        previousMonth = new JButton("����");
        nextMonth.addActionListener((ActionListener) this);
        previousMonth.addActionListener((ActionListener) this);
        JPanel pNorth = new JPanel();
        JPanel pSorth = new JPanel();
        pNorth.add(previousMonth);
        pNorth.add(nextMonth);
        pSorth.add(showMessage);
        add(pCenter, BorderLayout.CENTER);
        add(pNorth, BorderLayout.NORTH);
        add(pSorth, BorderLayout.SOUTH);

        setYearAndMonth(year, month);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }


    public void setYearAndMonth(int y, int m) {
        calender.setYear(y);
        calender.setMonth(m);
        String day[] = calender.getCalender();
        for (int i = 0; i < 42; i++) {
            labelDay[i].setText(day[i]);
        }
        showMessage.setText("����: " + calender.getYear() + "��" + calender.getMonth() + "��");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextMonth) {
            month += 1;
            if (month > 12) {
                month = 1;
            }
            calender.setMonth(month);
            String day[] = calender.getCalender();
            for (int i = 0; i < 42; i++) {
                labelDay[i].setText(day[i]);
            }
        } else if (e.getSource() == previousMonth) {
            month = month - 1;
            if (month < 1) {
                month = 1;
            }
            calender.setMonth(month);
            String day[] = calender.getCalender();
            for (int i = 0; i < 42; i++) {
                labelDay[i].setText(day[i]);
            }
        }
        showMessage.setText("����: " + calender.getYear() + "��" + calender.getMonth() + "��");
    }
}
