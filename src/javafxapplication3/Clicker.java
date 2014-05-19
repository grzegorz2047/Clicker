/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.util.Timer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author student_U190
 */
public class Clicker extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Data.buttonforclick= new Button("kliknij");
        Data.buybutton = new Button("Kup");
        Data.licznik= new Label("0");
        Data.licznik.setScaleX(4);
        Data.licznik.setScaleY(4);
                

        
        GridPane template = new GridPane();
        template.setHgap(30);
        template.setVgap(32);

        HBox hbButtons = new HBox();
        hbButtons.setSpacing(30.0);
        hbButtons.getChildren().addAll(Data.buybutton, Data.buttonforclick);
        template.add(hbButtons,5,3,2,1);
        
        
        
        HBox hblicznik = new HBox();
        hblicznik.getChildren().addAll(Data.licznik);
        template.add(hblicznik, 6, 1,2,1);

        Timer timer = new Timer() ;
        timer.schedule(new ClassForThread(), 0, 1000);
    

        Data.buttonforclick.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Data.licznik.setText(String.valueOf(Data.money++));
            }
        });
        Data.buybutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Buying.buySomething();
            }
        });
        
        Data.bezdomnybutton = new Button("Bezdomny, koszt: ");
        Data.mieszczaninbutton = new Button("Mieszczanin, koszt: ");
        Data.domekbutton = new Button("Domek, koszt: ");
        Data.monopolowybutton = new Button("Monopolowy, koszt: ");
        Data.blokbutton = new Button("Blok, koszt: ");
        Data.biedronkabutton = new Button("Biedronka, koszt: ");
        Data.wiezowiecbutton = new Button("Wiezowiec, koszt: ");
        Data.Tuskbutton= new Button("Tusk, koszt: ");
        VBox vb = new VBox();
        vb.getChildren().addAll(Data.bezdomnybutton, Data.mieszczaninbutton, 
                Data.domekbutton, Data.monopolowybutton, Data.blokbutton,
                Data.biedronkabutton, Data.wiezowiecbutton, Data.Tuskbutton);
        template.add(vb, 4,4,1,1);
        Scene scene = new Scene(template, 400, 300);
        primaryStage.setTitle("VATClicker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
