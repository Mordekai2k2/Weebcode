package h04;

import java.awt.*;
import java.applet.*;

public class SchemaFatKidz extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.LIGHT_GRAY);

        g.setColor(Color.GRAY);
        g.drawLine(75, 220, 75, 20);
        g.drawLine(75, 220, 320, 220);

        g.setColor(Color.GRAY);
        g.drawString("100", 55, 30 );
        g.drawString("80", 60, 70 );
        g.drawString("60", 60, 110 );
        g.drawString("40", 60, 150 );
        g.drawString("20", 60, 190 );
        g.drawString("0", 65, 230 );

        g.setColor(Color.RED);
        g.drawString("Valerie", 90, 240 );
        g.fillRect(100, 145, 20, 75);

        g.setColor(Color.GREEN);
        g.drawString("Jeroen", 160, 240 );
        g.fillRect(170, 25, 20, 195);

        g.setColor(Color.BLUE);
        g.drawString("Hans", 230, 240 );
        g.fillRect(240, 65, 20, 155);
    }
}