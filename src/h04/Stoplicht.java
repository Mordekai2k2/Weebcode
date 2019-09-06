package h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.BLACK);
        g.fillRoundRect(20, 20, 100, 200, 30, 30);
        g.setColor(Color.RED);
        g.fillOval(50, 40, 40, 40);
        g.setColor(Color.ORANGE);
        g.fillOval(50, 95, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(50, 150, 40, 40);
        g.setColor(Color.GRAY);
        g.fillRect(60, 220, 20, 100);

    }
}