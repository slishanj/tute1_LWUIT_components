/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.ButtonGroup;
import com.sun.lwuit.CheckBox;
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
public class Bg2 extends MIDlet {

    public void startApp() {
        Display.init(this);
        try {
            Resources r = Resources.open("/mob_tutes_1/mo_final.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
        } catch (Exception e) {
            System.out.println(e);
        }
        Form f = new Form("more buttons");

        RadioButton rb;
        ButtonGroup group = new ButtonGroup();
        rb = new RadioButton("scjp");
        group.add(rb);
        f.addComponent(rb);
        
        f.setLayout(new BoxLayout(BoxLayout.Y_AXIS));

        rb = new RadioButton("scwcd");
        group.add(rb);
        f.addComponent(rb);

        rb = new RadioButton("scmad");
        group.add(rb);
        f.addComponent(rb);
        
        CheckBox cb;
        
        cb = new CheckBox("ant");
        f.addComponent(cb);
        cb = new CheckBox("xml");
        f.addComponent(cb);
        cb = new CheckBox("ajax");
        f.addComponent(cb);
        cb = new CheckBox("spring");
        f.addComponent(cb);
        
        f.show();
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
