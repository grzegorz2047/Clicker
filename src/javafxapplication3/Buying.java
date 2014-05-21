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
    
    public static void buyBezdomny(){
        if(Data.money>=Data.bezdomnyprice){
            Data.autoclick+=0.05;
            Data.money-=Data.bezdomnyprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.bezdomnyprice=(Data.bezdomnyprice*Data.multiplierprice)+Data.bezdomnyprice;
            Data.bezdomnybutton.setText("Bezdomny, koszt: "+(int)Data.bezdomnyprice);
        }
    }
    public static void buyMieszczanin(){
        if(Data.money>=Data.mieszczaninprice){
            Data.autoclick+=0.1;
            Data.money-=Data.mieszczaninprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.mieszczaninprice=(Data.mieszczaninprice*Data.multiplierprice)+Data.mieszczaninprice;
        }
    }
    public static void buyDomek(){
        if(Data.money>=Data.domekprice){
            Data.autoclick+=0.5;
            Data.money-=Data.domekprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.domekprice=(Data.domekprice*Data.multiplierprice)+Data.domekprice;
        }
    }
    public static void buyMonopolowy(){
        if(Data.money>=Data.monopolowyprice){
            Data.autoclick+=1;
            Data.money-=Data.monopolowyprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.monopolowyprice=(Data.monopolowyprice*Data.multiplierprice)+Data.monopolowyprice;
        }
    }
    public static void buyBlok(){
        if(Data.money>=Data.blokprice){
            Data.autoclick+=2;
            Data.money-=Data.blokprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.blokprice=(Data.blokprice*Data.multiplierprice)+Data.blokprice;
        }
    }
    public static void buyBiedronka(){
        if(Data.money>=Data.biedronkaprice){
            Data.autoclick+=5;
            Data.money-=Data.biedronkaprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.biedronkaprice=(Data.biedronkaprice*Data.multiplierprice)+Data.biedronkaprice;
        }
    }
    public static void buyWiezowiec(){
        if(Data.money>=Data.wiezowiecprice){
            Data.autoclick+=10;
            Data.money-=Data.wiezowiecprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.wiezowiecprice=(Data.wiezowiecprice*Data.multiplierprice)+Data.wiezowiecprice;
        }
    }
    public static void buyTusk(){
        if(Data.money>=Data.tuskprice){
            Data.autoclick+=0.1;
            Data.money-=Data.tuskprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.tuskprice=(Data.tuskprice*Data.multiplierprice)+Data.tuskprice;
        }
    }
    public static void loadButtonPrices(){
        Data.bezdomnybutton.setText("Bezdomny, koszt: "+(int)Data.bezdomnyprice);
    }
}
