/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Grzegorz
 */
public class ButtonEvents {
    
    public void registerEvents(){
            Data.buttonforclick.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Data.licznik.setText(String.valueOf((int)Data.money++));
            }
        });
        Data.bezdomnybutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buyBezdomny();
            }
        });
        Data.mieszczaninbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buyMieszczanin();
            }
        });
        Data.domekbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buyDomek();
            }
        });
        Data.monopolowybutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buyMonopolowy();
            }
        });
        Data.blokbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buyBlok();
            }
        });
        Data.biedronkabutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buyBiedronka();
            }
        });
        Data.wiezowiecbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buyWiezowiec();
            }
        });
        Data.Tuskbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buyTusk();
            }
        });
    }
    

    
}
