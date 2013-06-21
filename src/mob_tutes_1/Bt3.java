/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Button;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.IOException;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class Bt3 extends MIDlet {

    public void startApp() {
        Display.init(this);
        try {
            Resources r = Resources.open("/mob_tutes_1/mo_final.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
        } catch (Exception e) {
            System.out.println(e);
        }
        Form f= new Form();
        Button b1 = new Button("text");
        Image icon = null;
        try {
            icon = Image.createImage("/red.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Button b2 = new Button(icon);
        Button b3 = new Button(icon);
        b3.setText("pic butt");
        b3.setTextPosition(Button.BOTTOM);
        f.setTitle("duh!");
        f.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        f.addComponent(b1);
        f.addComponent(b2);
        f.addComponent(b3);
        f.show();
        
        
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
