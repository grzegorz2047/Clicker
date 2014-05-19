/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.util.TimerTask;
import javafx.application.Platform;

/**
 *
 * @author student_U190
 */
public class ClassForThread extends TimerTask{

   
    @Override
    public void run() {
        Platform.runLater(new FXThread());
    
    }
    
}
