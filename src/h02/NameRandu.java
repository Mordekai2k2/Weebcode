package h04;

import java.awt.*;
import java.applet.*;

public class NameRandu extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.YELLOW);
        g.drawString("Randy Brouwer", 20, 20 );
    }
}