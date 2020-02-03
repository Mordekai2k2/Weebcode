package h06;

import java.awt.*;
import java.applet.*;


public class Negatief extends Applet {
    int Positief1;
    int Positief2;
    int Negatief;

    public void init() {
        Positief1 = 19;
        Positief2 = 973;
        Negatief -= Positief1 + Positief2;
    }

    public void paint(Graphics g) {
        g.drawString(Positief1 + " + " + Positief2 + " = " + Negatief, 20, 65);
    }
}
