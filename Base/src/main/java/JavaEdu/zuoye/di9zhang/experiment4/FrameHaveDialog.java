package JavaEdu.zuoye.di9zhang.experiment4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameHaveDialog  extends JFrame implements ActionListener {
    JTextArea text;
    JButton buttonFont;
    FrameHaveDialog(){
        buttonFont = new JButton("��������");
        text=new JTextArea("Java 2 ʵ�ý̳�(���İ�)");
        buttonFont.addActionListener(this);
        add(buttonFont,BorderLayout.NORTH);
        add(text);
        setBounds(60,60,300,300);
        setVisible(true);
        validate();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonFont){
            FontDialog dialog=new FontDialog(this);
            dialog.setVisible(true);
            if(dialog.getState()==FontDialog.YES){
                text.setFont(dialog.getFont());
                text.repaint();
            }
            if(dialog.getState()==FontDialog.No) {
                text.repaint();
            }
        }
    }
}
