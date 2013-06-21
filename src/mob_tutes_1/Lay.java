/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Button;
import com.sun.lwuit.Component;
import com.sun.lwuit.Container;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.IOException;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class Lay extends MIDlet {

    public Lay(){
        
    }
    public void startApp() {
         Display.init(this);
        try {
            Resources r = Resources.open("/mob_tutes_1/mo_final.res");
            UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));
        } catch (Exception e) {
            System.out.println(e);
        }
        Form f= new Form();
        f.setLayout(new BorderLayout());
         Image icon = null;
        try {
            icon = Image.createImage("/red.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Label bottomtext = new Label(icon);
        bottomtext.setText("ahaaaaa...");
            bottomtext.setAlignment(Component.CENTER);
                    bottomtext.setTextPosition(Component.BOTTOM);
            
            Container buttonbar = new Container(new BoxLayout(BoxLayout.X_AXIS));
        buttonbar.addComponent(new Button("add"));
        buttonbar.addComponent(new Button("remove"));
        buttonbar.addComponent(new Button("edit"));
        buttonbar.addComponent(new Button("send"));
        buttonbar.addComponent(new Button("exit"));
        f.addComponent(BorderLayout.CENTER,bottomtext);
        f.addComponent(BorderLayout.SOUTH,buttonbar);
        f.show();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
