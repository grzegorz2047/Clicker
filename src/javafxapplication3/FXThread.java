/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

/**
 *
 * @author student_U190
 */
public class FXThread implements Runnable {
    
    @Override
    public void run() {
        Data.money+=Data.autoclick;
        Data.licznik.setText(String.valueOf((int)Data.money));
    
    }
    
}
