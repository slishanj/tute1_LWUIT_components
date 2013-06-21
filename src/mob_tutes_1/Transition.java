/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mob_tutes_1;

import com.sun.lwuit.Button;
import com.sun.lwuit.Command;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.animations.CommonTransitions;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import javax.microedition.midlet.*;

/**
 * @author Administrator
 */
public class Transition extends MIDlet implements ActionListener {

    private Form mfirstform, msecondform;

    public void startApp() {
        if (mfirstform == null) {
            Display.init(this);
            mfirstform = new Form("first form");
            Button button = new Button("Switch");
            mfirstform.addComponent(button);
            button.addActionListener(this);
            mfirstform.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_VERTICAL, false, 200));
           
            msecondform = new Form("Second form");
            Button button2 = new Button("Switch");
            msecondform.addComponent(button2);
            button2.addActionListener(this);
            msecondform.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_VERTICAL, false, 200));
mfirstform.show();
        }
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void actionPerformed(ActionEvent ae) {
        Form current = Display.getInstance().getCurrent();
        if(current == mfirstform){
            msecondform.show();
        }else if(current == msecondform){
            mfirstform.show();
        }
    }
}
