package h06;

import java.awt.*;
import java.applet.*;


public class Seconde extends Applet {
    int Seconde;
    int Minuut;
    int Uur;
    int Dag;
    int Jaar;

    public void init() {
        Seconde = 1;
        Minuut = Seconde * 60;
        Uur = Minuut * 60;
        Dag = Uur * 24;
        Jaar = Dag * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Hoeveel secondes zitten in een:", 20, 20);
        g.drawString("Seconde: " + Seconde, 20, 35);
        g.drawString("Minuut: " + Minuut, 20, 50);
        g.drawString("Uur: " + Uur, 20, 65);
        g.drawString("Dag: " + Dag, 20, 80);
        g.drawString("Jaar: " + Jaar, 20, 95);
    }
}
