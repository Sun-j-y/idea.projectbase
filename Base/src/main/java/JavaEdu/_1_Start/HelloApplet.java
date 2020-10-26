package JavaEdu._1_Start;

import java.applet.Applet;
import java.awt.*;


public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World!", 50, 25);
    }
}
