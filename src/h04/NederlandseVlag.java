package h04;

import java.awt.*;
import java.applet.*;

public class NederlandseVlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.LIGHT_GRAY);
        g.setColor(Color.GRAY);
        g.fillRect(20, 50, 10, 200);
        g.setColor(Color.RED);
        g.fillRect(30, 50, 100, 20);
        g.setColor(Color.WHITE);
        g.fillRect(30, 70, 100, 20);
        g.setColor(Color.BLUE);
        g.fillRect(30, 90, 100, 20);
        g.setColor(Color.ORANGE);
        g.drawString("NEDERLAND", 40, 40 );
    }
}