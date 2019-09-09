package h06;

import java.awt.*;
import java.applet.*;


public class MoneyMan extends Applet {
    double AantalGeld;
    double Personen;
    double uitkomst;

    public void init() {
        AantalGeld = 113;
        Personen = 4;
        uitkomst = AantalGeld / Personen;
    }

    public void paint(Graphics g) {
        g.drawString("Jeannette: " + "€ " + uitkomst, 20, 20);
        g.drawString("Jan: " + "€ " + uitkomst, 20, 35);
        g.drawString("Ali: " + "€ " + uitkomst, 20, 50);
        g.drawString("Jij: " + "€ " + uitkomst, 20, 65);
    }
}
