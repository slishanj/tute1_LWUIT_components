/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Command;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.IOException;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class cmd extends MIDlet implements ActionListener, CommandListener{
private Form mform;
    public void startApp() {
        if(mform==null){
        Display.init(this);
        
        Form f = new Form("Hello, LWUIT!");
            Command exitCommand = new Command("exit");
            f.addCommand(exitCommand);
           // f.setCommandListener(this);
        
        f.show();
    }
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void actionPerformed(ActionEvent ae) {
        destroyApp(true);
        notifyDestroyed();
    }

    public void commandAction(javax.microedition.lcdui.Command c, Displayable d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
