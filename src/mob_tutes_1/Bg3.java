/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.List;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class Bg3 extends MIDlet {

    public void startApp() {
        Display.init(this);
        try {
            Resources r = Resources.open("/mob_tutes_1/mo_final.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
        } catch (Exception e) {
            System.out.println(e);
        }
        Form f = new Form("more buttons");
        f.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        List list = new List();
        list.addItem("1");
        list.addItem("2");
        list.addItem("3");
        list.addItem("4");
        list.addItem("5");
        list.addItem("6");
        f.addComponent(list);
        ComboBox comboBox = new ComboBox(list.getModel());
        f.addComponent(comboBox);
        f.show();
        
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
