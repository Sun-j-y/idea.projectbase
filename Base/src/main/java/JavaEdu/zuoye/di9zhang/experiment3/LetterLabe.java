package JavaEdu.zuoye.di9zhang.experiment3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JTextField;

public class LetterLabe extends JTextField implements FocusListener {
    LetterLabe() {
    }

    {
        setEditable(false);
        addFocusListener(this);
        setBackground(Color.white);
        setFont(new Font("Arial", Font.PLAIN, 30));
    }

    public static LetterLabe[] getLetterLabe(int n) {
        LetterLabe[] a = new LetterLabe[n];
        for (int k = 0; k < a.length; k++) {
            a[k] = new LetterLabe();
        }
        return a;

    }

    public void focusGained(FocusEvent e) {
        setBackground(Color.cyan);
    }

    public void focusLost(FocusEvent e) {
        setBackground(Color.white);
    }

    public void setText(char c) {
        setText("" + c);
    }
}
