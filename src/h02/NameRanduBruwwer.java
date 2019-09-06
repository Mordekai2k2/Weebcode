package h04;

import java.awt.*;
import java.applet.*;

public class NameRanduBruwwer extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.drawString("Randy", 20, 20 );
        g.setColor(Color.RED);
        g.drawString("Brouwer", 20, 30 );
    }
}