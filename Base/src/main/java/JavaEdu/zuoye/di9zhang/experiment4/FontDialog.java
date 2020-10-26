package JavaEdu.zuoye.di9zhang.experiment4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class FontDialog extends Dialog implements ActionListener, ItemListener {

    FontFamilyNames fontFamilyNames;
    int fontSize=36;
    String fontName;
    JComboBox fontNameList = new JComboBox();
    JComboBox fontSizeList = new JComboBox();
    JLabel label;
    Font font;
    JButton yes,cancel;
    static int YES=1;
    static int No=0;
    int state =-1;
    FontDialog(JFrame f){
        super(f);
        setTitle("字体对话框");
        font=new Font("宋体",Font.PLAIN,12);
        fontFamilyNames=new FontFamilyNames();
        this.setModal(true);
        yes=new JButton("Yes");
        cancel=new JButton("cancel");
        yes.addActionListener(this);
        cancel.addActionListener(this);
        label=new JLabel("hello,奥运",JLabel.CENTER);
        String[] name = fontFamilyNames.getFontName();

        fontNameList.addItem("字体");
        for (String s : name) {
            fontNameList.addItem(s);
        }
        fontSizeList.addItem("大小");
        for (int k=8;k<72;k=k+2) {
            fontSizeList.addItem(new Integer(k));
        }
        fontNameList.addItemListener(this);
        fontSizeList.addItemListener(this);
        JPanel pNorth=new JPanel();
        pNorth.add(fontNameList);
        pNorth.add(fontSizeList);
        add(pNorth,BorderLayout.NORTH);
        add(pNorth,BorderLayout.CENTER);
        JPanel pSouth=new JPanel();
        pSouth.add(yes);
        pSouth.add(cancel);
        add(pSouth,BorderLayout.SOUTH);
        setBounds(100,100,280,170);
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        validate();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==yes){
            state=YES;
            this.setVisible(false);

        }else if(e.getSource()==cancel){
            state=No;
            this.setVisible(false);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==fontSizeList){
            fontName= (String) fontNameList.getSelectedItem();
            font=new Font(fontName,Font.PLAIN,fontSize);
        }else if(e.getSource()==fontSizeList){
            Integer m = (Integer) fontSizeList.getSelectedItem();
            fontSize=m.intValue();
            font=new Font(fontName,Font.PLAIN,fontSize);
        }
        label.setFont(font);
        label.repaint();
        validate();

    }

    public int getState(){
        return state;
    }
    @Override
    public Font getFont(){
        return font;
    }
}
