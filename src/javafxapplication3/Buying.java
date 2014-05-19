/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

/**
 *
 * @author student_U190
 */
public class Buying {
    
    public static void buySomething(){
        if(Data.money>=30){
            Data.autoclick+=0.1;
            Data.money-=30;
            Data.licznik.setText(String.valueOf((int)Data.money));
        }
    }
    
}
