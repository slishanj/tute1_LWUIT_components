/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class fm2 extends MIDlet {

    public void startApp() {
        Display.init(this);
        try {
            Resources r = Resources.open("/mob_tutes_1/mo_final.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
        } catch (Exception e) {
            System.out.println(e);
        }
        Form f = new Form();
        f.setTitle("alo machan");
        f.setLayout(new BorderLayout());
        f.show();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
