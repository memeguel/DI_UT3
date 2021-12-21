/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo4;

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
public class Demo4 extends Application {
    static Label lbl;
    @Override
    public void start(Stage primaryStage) {
        BorderPane root=new BorderPane();
        
        Button btn=new Button();
        btn.setText("Say HelloWorld!");
        
        //lbl=new Label();
        
        root.setBottom(lbl);
        root.setCenter(btn);
        
        //EventHandler<ActionEvent> manejador=new miClaseManejadora(lbl);
        EventHandler<ActionEvent> manejador=new miClaseManejadora();
        btn.addEventHandler(ActionEvent.ACTION, manejador);
        
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
    private static class miClaseManejadora implements EventHandler<ActionEvent>{
        
//        Label lbl;
//        
//        public miClaseManejadora(Label lbl) {
//            this.lbl=lbl;
//        }
        
        @Override
        public void handle(ActionEvent event) {
            System.out.println("HelloWorld!");
            lbl.setText("HelloWorld!");
        }
    
    }
}
