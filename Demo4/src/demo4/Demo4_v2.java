/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo4;

import static demo4.Demo4.lbl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author CFGS
 */
public class Demo4_v2 extends Application {

    static Label lbl = new Label();

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        Button btn = new Button();
        btn.setText("Say HelloWorld!");

        root.setBottom(lbl);
        root.setCenter(btn);

        //Clase anonima
//        EventHandler<ActionEvent> manejador = new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("HelloWorld!");
//                lbl.setText("HelloWorld!");
//            }
//        };
        //btn.addEventHandler(ActionEvent.ACTION, manejador);
        
        //Lambda lenta
//        EventHandler<ActionEvent> manejador = (e) -> {
//            System.out.println("HelloWorld!");
//            lbl.setText("HelloWorld!");
//        };
        //btn.setOnAction(manejador);
        
        //Lambda rapida
        btn.setOnAction((event) -> {
            System.out.println("HelloWorld!");
            lbl.setText("HelloWorld!");
        });

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
