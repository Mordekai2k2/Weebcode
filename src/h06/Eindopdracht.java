package h06;

import java.awt.*;
import java.applet.*;


public class Eindopdracht extends Applet {
    double Cijfer1,Cijfer2,Cijfer3,Gemiddelde,Gemiddelde2;
    int Gemiddelde3;
    double Gemiddelde4,EindAntwoord;

    public void init() {
        Cijfer1 =7.6;
        Cijfer2 =8.4;
        Cijfer3 =4.5;
        Gemiddelde = (Cijfer1 + Cijfer2 + Cijfer3) / 3;
        Gemiddelde2 = Gemiddelde * 10;
        Gemiddelde3 = (int)Gemiddelde2;
        Gemiddelde4 = (double)Gemiddelde3;
        EindAntwoord = Gemiddelde4 / 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het Gemiddelde is: " + EindAntwoord, 20, 20);
    }
}
