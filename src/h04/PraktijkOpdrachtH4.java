package h04;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdrachtH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);

        g.drawLine(20, 20, 200, 20);
        g.drawString("Lijn", 90, 35 );

        g.drawRect(20, 50, 180, 75);
        g.drawString("Rechthoek", 75, 140 );

        g.drawRoundRect(20, 155, 180, 80, 30, 30);
        g.drawString("Afgeronde rechthoek", 50, 250 );

        g.setColor(Color.MAGENTA);
        g.fillRect(220, 50, 180, 75);
        g.setColor(Color.BLACK);
        g.drawOval(220, 50, 180, 75);
        g.drawString("Gevulde rechthoek met ovaal", 230, 140 );

        g.setColor(Color.MAGENTA);
        g.fillOval(220, 155, 180, 75);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal", 265, 245 );

        g.drawOval(420, 50, 180, 75);
        g.setColor(Color.MAGENTA);
        g.fillArc(420, 50, 180, 75, 0, 45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen", 425, 140 );

        g.drawOval(475, 155, 75, 75);
        g.drawString("Cirkel", 495, 245 );
    }
}