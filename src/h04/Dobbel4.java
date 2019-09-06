package h04;

import java.awt.*;
import java.applet.*;

public class Dobbel4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.WHITE);
        g.fillRoundRect(20, 20, 100, 100, 30, 30);
        g.setColor(Color.BLACK);
        g.drawRoundRect(20, 20, 100, 100, 30, 30);
        g.fillOval(30, 30, 25, 25);
        g.fillOval(85, 30, 25, 25);
        g.fillOval(30, 85, 25, 25);
        g.fillOval(85, 85, 25, 25);
    }
}