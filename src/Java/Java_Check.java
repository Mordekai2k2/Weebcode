package Java;

import java.applet.*;
import java.awt.*;

public class Java_Check extends Applet {

    public void paint(Graphics g) {
        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                g.drawString ("Nu zijn we op de helft",100 ,160);
            }
            else {
                if (i == 9) {
                    g.drawString(" ", 100, 200);
                }
                else {
                    g.drawString("Dit is regel: " + i, 100, 70 + (i + 1) * 15);
                }
            }
        }
    }
}
