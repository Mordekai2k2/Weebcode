package h11;

import java.applet.*;
import java.awt.*;

public class H11_1 extends Applet{
    public void init(){
    }

    public void paint(Graphics g){
        //Lube
        for(int i=1; i<=10; i++){
            //hoogte linken met i
            g.drawLine(10, i*10,210,i*10);
        }
    }
}