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
            Data.bezdomnybutton.setText("Bezdomny, liczba "+(++Data.bezdomnyamount)+", koszt: "+(int)Data.bezdomnyprice);
        }
    }
    public static void buyMieszczanin(){
        if(Data.money>=Data.mieszczaninprice){
            Data.autoclick+=0.1;
            Data.money-=Data.mieszczaninprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.mieszczaninprice=(Data.mieszczaninprice*Data.multiplierprice)+Data.mieszczaninprice;
            Data.mieszczaninbutton.setText("Mieszczanin, liczba "+(++Data.mieszczaninamount)+", koszt: "+(int)Data.mieszczaninprice);
        }
    }
    public static void buyDomek(){
        if(Data.money>=Data.domekprice){
            Data.autoclick+=0.5;
            Data.money-=Data.domekprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.domekprice=(Data.domekprice*Data.multiplierprice)+Data.domekprice;
            Data.domekbutton.setText("Domek, liczba "+(++Data.domekamount)+", koszt: "+(int)Data.domekprice);
        }
    }
    public static void buyMonopolowy(){
        if(Data.money>=Data.monopolowyprice){
            Data.autoclick+=1;
            Data.money-=Data.monopolowyprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.monopolowyprice=(Data.monopolowyprice*Data.multiplierprice)+Data.monopolowyprice;
            Data.monopolowybutton.setText("Monopolowy, liczba "+(++Data.monopolowyamount)+", koszt: "+(int)Data.monopolowyprice);
        }
    }
    public static void buyBlok(){
        if(Data.money>=Data.blokprice){
            Data.autoclick+=2;
            Data.money-=Data.blokprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.blokprice=(Data.blokprice*Data.multiplierprice)+Data.blokprice;
            Data.blokbutton.setText("Blok, liczba "+(++Data.blokamount)+", koszt: "+(int)Data.blokprice);
        }
    }
    public static void buyBiedronka(){
        if(Data.money>=Data.biedronkaprice){
            Data.autoclick+=5;
            Data.money-=Data.biedronkaprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.biedronkaprice=(Data.biedronkaprice*Data.multiplierprice)+Data.biedronkaprice;
            Data.biedronkabutton.setText("Biedronka, liczba "+(++Data.biedronkaamount)+", koszt: "+(int)Data.biedronkaprice);
        }
    }
    public static void buyWiezowiec(){
        if(Data.money>=Data.wiezowiecprice){
            Data.autoclick+=10;
            Data.money-=Data.wiezowiecprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.wiezowiecprice=(Data.wiezowiecprice*Data.multiplierprice)+Data.wiezowiecprice;
            Data.wiezowiecbutton.setText("Wiezowiec, liczba "+(++Data.wiezowiecamount)+", koszt: "+(int)Data.wiezowiecprice);
        }
    }
    public static void buyTusk(){
        if(Data.money>=Data.tuskprice){
            Data.autoclick+=0.1;
            Data.money-=Data.tuskprice;
            Data.licznik.setText(String.valueOf((int)Data.money));
            Data.tuskprice=(Data.tuskprice*Data.multiplierprice)+Data.tuskprice;
            Data.Tuskbutton.setText("Tusk, liczba "+(++Data.tuskamount)+", koszt: "+(int)Data.tuskprice);
        }
    }
    public static void loadButtonPrices(){
        Data.bezdomnybutton.setText("Bezdomny, liczba "+Data.bezdomnyamount+", koszt: "+(int)Data.bezdomnyprice);
        Data.mieszczaninbutton.setText("Mieszczanin, liczba "+Data.mieszczaninamount+", koszt: "+(int)Data.mieszczaninprice);
        Data.domekbutton.setText("Domek, liczba "+Data.domekamount+", koszt: "+(int)Data.domekprice);
        Data.monopolowybutton.setText("Monopolowy, liczba "+Data.monopolowyamount+", koszt: "+(int)Data.monopolowyprice);
        Data.blokbutton.setText("Blok, liczba "+Data.blokamount+", koszt: "+(int)Data.blokprice);
        Data.biedronkabutton.setText("Biedronka, liczba "+Data.biedronkaamount+", koszt: "+(int)Data.biedronkaprice);
        Data.wiezowiecbutton.setText("Wiezowiec, liczba"+Data.wiezowiecamount+", koszt: "+(int)Data.wiezowiecprice);
        Data.Tuskbutton.setText("Tusk, liczba "+Data.tuskamount+", koszt: "+(int)Data.tuskprice);
    }
}
