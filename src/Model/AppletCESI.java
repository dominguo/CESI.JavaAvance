package Model;
/**
 * Created by pcthomas on 05/10/2016.
 */

import java.applet.*;
import java.awt.*;

public class AppletCESI extends Applet {
    String msg;

    public static void main(String[] args) {
        //this.init();
    }

    public void init() {
        msg="Bonjour java !";
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 20);
    }

    public void start() {
        msg="coucouo";
    }
}
