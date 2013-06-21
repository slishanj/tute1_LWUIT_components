/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.layouts.BorderLayout;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class fm1 extends MIDlet {

    public void startApp() {
         Display.init(this);
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
