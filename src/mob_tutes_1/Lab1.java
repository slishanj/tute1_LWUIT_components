/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class Lab1 extends MIDlet {

    public void startApp() {
        Display.init(this);
        try {
            Resources r = Resources.open("/mob_tutes_1/mo_final.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
        } catch (Exception e) {
            System.out.println(e);
        }
        Form f = new Form();
        Label north = new Label("North");
        Label south = new Label("South");
        Label east = new Label("East");
        Label west = new Label("West");
        Label center = new Label("Center");
        f.setTitle("alo machan");
        f.setLayout(new BorderLayout());
        f.addComponent(BorderLayout.NORTH,north);
        f.addComponent(BorderLayout.SOUTH,south);
        f.addComponent(BorderLayout.EAST,east);
        f.addComponent(BorderLayout.WEST,west);
        f.addComponent(BorderLayout.CENTER,center);
        f.show();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
