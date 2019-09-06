package h04;

import java.awt.*;
import java.applet.*;

public class FatKidz2 extends Applet {
    int FatnessHans;
    int FatnessJeroen;
    int FatnessValerie;
    int Xnormal;
    int StandardHeight;
    int YCoord;
    int XCoord;

    public void init() {
        Xnormal = 75;
        StandardHeight = 30;
        YCoord = 240;
        XCoord = 30;
        FatnessHans = 160;
        FatnessJeroen = 200;
        FatnessValerie = 80;
    }

    public void paint(Graphics g) {
        setBackground(Color.LIGHT_GRAY);

        g.setColor(Color.GRAY);
        g.drawLine(75, 220, 75, 20);
        g.drawLine(75, 220, 320, 220);

        g.setColor(Color.GRAY);
        g.drawString("100", 270, YCoord );
        g.drawString("80", 230, YCoord );
        g.drawString("60", 190, YCoord );
        g.drawString("40", 150, YCoord );
        g.drawString("20", 110, YCoord );
        g.drawString("0", 70, YCoord );

        //Valerie
        g.setColor(Color.RED);
        g.drawString("Valerie", XCoord, 50 );
        g.fillRect(Xnormal, 35, FatnessValerie, StandardHeight);

        //Jeroen
        g.setColor(Color.GREEN);
        g.drawString("Jeroen", XCoord, 125 );
        g.fillRect(Xnormal, 110, FatnessJeroen, StandardHeight);

        //Hans
        g.setColor(Color.BLUE);
        g.drawString("Hans", XCoord, 200 );
        g.fillRect(Xnormal, 185, FatnessHans, StandardHeight);
    }
}