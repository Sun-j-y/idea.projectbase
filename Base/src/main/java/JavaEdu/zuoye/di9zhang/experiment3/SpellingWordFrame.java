package JavaEdu.zuoye.di9zhang.experiment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class SpellingWordFrame extends JFrame implements KeyListener, ActionListener {
    JTextField inputWord;
    JButton button;
    LetterLabe[] label;
    JPanel northP, centerP;
    Box wordBox;
    String hintMessage = "����굥����ĸ�������Ҽ�ͷ������ĸ���������г������ĵ���";
    JLabel messaageLabel = new JLabel(hintMessage);
    String word = "";

    SpellingWordFrame() {
        inputWord = new JTextField(12);
        button = new JButton("ȷ��");
        button.addActionListener(this);
        inputWord.addActionListener(this);
        northP = new JPanel();
        northP.add(new JLabel("���뵥��:"));
        northP.add(inputWord);
        northP.add(button);
        centerP = new JPanel();
        wordBox = Box.createHorizontalBox();
        centerP.add(wordBox);
        add(northP, BorderLayout.NORTH);
        add(centerP, BorderLayout.CENTER);
        add(messaageLabel, BorderLayout.SOUTH);
        setVisible(true);
        validate();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        word = inputWord.getText();
        int n = word.length();
        RondomString rondom = new RondomString();
        String randomWord = rondom.getRondomString(word);
        wordBox.removeAll();
        messaageLabel.setText(hintMessage);
        if (n > 0) {
            label = LetterLabe.getLetterLabe(n);
            for (int k = 0; k < label.length; k++) {
                label[k].setText("" + randomWord.charAt(k));
                wordBox.add(label[k]);
                label[k].addKeyListener(this);
            }
            validate();
            inputWord.setText(null);
            label[0].requestFocus();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        LetterLabe sourceLabel = (LetterLabe) e.getSource();
        int index = -1;
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            for (int k = 0; k < label.length; k++) {
                if (label[k] == sourceLabel) {
                    index = k;
                    break;
                }
            }
            if (index != 0) {
                String temp = label[index].getText();
                label[index].setText(label[index - 1].getText());
                label[index - 1].setText(temp);
                label[index - 1].requestFocus();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            for (int k = 0; k < label.length; k++) {
                if (label[k] == sourceLabel) {
                    index = k;
                    break;
                }
            }
            if (index != label.length - 1) {
                String temp = label[index].getText();
                label[index].setText(label[index + 1].getText());
                label[index + 1].setText(temp);
                label[index + 1].requestFocus();
            }
        }
        validate();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String success = "";
        for (LetterLabe labe : label) {
            String str = labe.getText();
            success += str;
        }
        if (success.equals(word)) {
            messaageLabel.setText("��ϲ�㣬�ɹ���");
            for (LetterLabe letterLabe : label) {
                letterLabe.removeKeyListener(this);
                letterLabe.removeFocusListener(letterLabe);
                letterLabe.setBackground(Color.white);
            }
            inputWord.requestFocus();

        }
    }
}
