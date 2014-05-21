/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.util.Timer;
import javafx.application.Application;
import javafx.application.Platform;
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
import javafx.stage.WindowEvent;

/**
 *
 * @author student_U190
 */
public class Clicker extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Data.buttonforclick= new Button("kliknij");
        Data.licznik= new Label("0");
        Data.licznik.setScaleX(4);
        Data.licznik.setScaleY(4);
                

        
        GridPane template = new GridPane();
        template.setHgap(30);
        template.setVgap(32);

        HBox hbButtons = new HBox();
        hbButtons.setSpacing(30.0);
        hbButtons.getChildren().addAll(Data.buttonforclick);
        template.add(hbButtons,5,3,2,1);
        
        
        
        HBox hblicznik = new HBox();
        hblicznik.getChildren().addAll(Data.licznik);
        template.add(hblicznik, 6, 1,2,1);

        final Timer timer = new Timer() ;
        timer.schedule(new ClassForThread(), 0, 1000);
        
        Data.bezdomnybutton = new Button("Bezdomny, koszt: ");
        Data.mieszczaninbutton = new Button("Mieszczanin, koszt: ");
        Data.domekbutton = new Button("Domek, koszt: ");
        Data.monopolowybutton = new Button("Monopolowy, koszt: ");
        Data.blokbutton = new Button("Blok, koszt: ");
        Data.biedronkabutton = new Button("Biedronka, koszt: ");
        Data.wiezowiecbutton = new Button("Wiezowiec, koszt: ");
        Data.Tuskbutton= new Button("Tusk, koszt: ");
        
        ButtonEvents be = new ButtonEvents();
        be.registerEvents();
        
        VBox vb = new VBox();
        vb.getChildren().addAll(Data.bezdomnybutton, Data.mieszczaninbutton, 
                Data.domekbutton, Data.monopolowybutton, Data.blokbutton,
                Data.biedronkabutton, Data.wiezowiecbutton, Data.Tuskbutton);
        template.add(vb, 1,1,3,7);
        Scene scene = new Scene(template, 500, 400);
        primaryStage.setTitle("VATClicker");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                timer.cancel();
                Platform.exit();
                System.exit(0);
            }
        });
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
