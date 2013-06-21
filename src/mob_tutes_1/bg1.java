/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.RadioButton;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class bg1 extends MIDlet {

    public void startApp() {
        Display.init(this);
        try {
            Resources r = Resources.open("/mob_tutes_1/mo_final.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
        } catch (Exception e) {
            System.out.println(e);
        }
        Form f= new Form();
        RadioButton r1 = new RadioButton("rb1");
        RadioButton r2 = new RadioButton("rb2");
        f.setTitle("radio buttons");
        f.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        f.addComponent(r1);
        f.addComponent(r2);
        f.show();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
