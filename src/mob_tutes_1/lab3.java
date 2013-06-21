/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.IOException;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class lab3 extends MIDlet {

    public void startApp() {
         Display.init(this);
        try {
            Resources r = Resources.open("/mob_tutes_1/mo_final.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
        } catch (Exception e) {
            System.out.println(e);
        }
        Form f = new Form();
        Image icon = null;
        try {
            icon = Image.createImage("/red.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Label imglabel = new Label(icon);
        imglabel.setText("done");
            imglabel.setAlignment(Label.RIGHT);
            imglabel.setTextPosition(Label.BOTTOM);
        f.setTitle("alo machan");
        f.setLayout(new BorderLayout());
        f.addComponent(BorderLayout.NORTH,imglabel);
        f.show();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
