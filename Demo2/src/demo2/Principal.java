/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author CFGS
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Demo 2 métodos Stage");
        primaryStage.setWidth(400);
        primaryStage.setHeight(350);
        
        primaryStage.setMinWidth(250);
        primaryStage.setMinHeight(150);
        
        primaryStage.setMaxWidth(700);
        primaryStage.setMaxHeight(600);
        
//        primaryStage.setX(0);
//        primaryStage.setY(0);

        primaryStage.centerOnScreen();
        
        primaryStage.setOpacity(0.7);
        
        primaryStage.setResizable(false);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
