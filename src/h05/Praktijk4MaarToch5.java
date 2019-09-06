package h04;

import java.awt.*;
import java.applet.*;

public class Praktijk4MaarToch5 extends Applet {
    Color Vulkleurtje;
    Color Lijnkleur;
    int breed;
    int hoog;
    int Cirkel;

    public void init() {
        Vulkleurtje = Color.MAGENTA;
        Lijnkleur = Color.BLACK;
        breed = 180;
        hoog = 75;
        Cirkel = 75;
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Lijnkleur);

        //Lijn
        g.drawLine(20, 20, 200, 20);
        g.drawString("Lijn", 90, 35 );

        //Rechthoek
        g.drawRect(20, 50, breed, hoog);
        g.drawString("Rechthoek", 75, 140 );

        //Ronde Rechthoek
        g.drawRoundRect(20, 155, breed, hoog, 30, 30);
        g.drawString("Afgeronde rechthoek", 50, 250 );

        //Ovaal in Rechthoek
        g.setColor(Vulkleurtje);
        g.fillRect(220, 50, breed, hoog);
        g.setColor(Lijnkleur);
        g.drawOval(220, 50, breed, hoog);
        g.drawString("Gevulde rechthoek met ovaal", 230, 140 );

        //Ovaal Kleur
        g.setColor(Vulkleurtje);
        g.fillOval(220, 155, breed, hoog);
        g.setColor(Lijnkleur);
        g.drawString("Gevulde ovaal", 265, 245 );

        // Taartpunt met Ovaal
        g.drawOval(420, 50, breed, hoog);
        g.setColor(Vulkleurtje);
        g.fillArc(420, 50, breed, hoog, 0, 45);
        g.setColor(Lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 425, 140 );

        //Cirkel
        g.drawOval(475, 155, Cirkel, Cirkel);
        g.drawString("Cirkel", 495, 245 );
    }
}