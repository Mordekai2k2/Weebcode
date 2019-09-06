package h04;

import java.awt.*;
import java.applet.*;

public class Elips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.YELLOW);
        g.fillArc(20, 20, 100, 50, 0, 361);
    }
}