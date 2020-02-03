package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H8_2 extends Applet {
    //variabelen
    int m;
    int v;
    int potm;
    int potv;

    //knoppen
    Button bm;
    Button bv;
    Button bpotm;
    Button bpotv;

    public void init() {
        //Size
        setSize(800, 200);
        //Standaard waardes
        m = 0;
        v = 0;
        potm = 0;
        potv = 0;
        //knoppen instellen
        bm = new Button("mannelijke studenten");
        bv = new Button("vrouwelijke studenten");
        bpotm = new Button("potentiele mannelijke studenten");
        bpotv = new Button("potentiele vrouwelijke studenten");
        //Functie van knoppen
        bm.addActionListener(new bmL());
        bv.addActionListener(new bvL());
        bpotm.addActionListener(new bpotmL());
        bpotv.addActionListener(new bpotvL());
        //knoppen zichtbaar maken
        add(bm);
        add(bv);
        add(bpotm);
        add(bpotv);

    }

    public void paint(Graphics g) {
        //variabelen zichtbaar
        g.drawString("mannelijke studenten: " + m,50,50);
        g.drawString("vrouwelijke studenten: " + v,50,60);
        g.drawString("potentiele mannelijke studenten: " + potm,50,70);
        g.drawString("potentiele vrouwelijke studenten: " + potv,50,80);

    }

    //knoppen functie
    class bmL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m ++;
            repaint();
        }
    }

    class bvL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            v ++;
            repaint();
        }
    }

    class bpotmL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potm ++;
            repaint();
        }
    }

    class bpotvL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potv ++;
            repaint();
        }
    }


}