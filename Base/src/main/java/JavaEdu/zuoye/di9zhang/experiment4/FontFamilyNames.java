package JavaEdu.zuoye.di9zhang.experiment4;

import java.awt.*;

public class FontFamilyNames {
    String[] allFontNames;

    public String[] getFontName(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        allFontNames = ge.getAvailableFontFamilyNames();
        return allFontNames;
    }
}
