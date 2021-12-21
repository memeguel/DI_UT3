/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author CFGS
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group grupo=new Group();
        
        Circle circulo=new Circle(60, 40, 30, Color.WHITE);
        
        Text texto=new Text(10, 90, "JavaFX mola mogollón");
        texto.setFill(Color.DARKRED);
        
        Font fuente=new Font(20);
        texto.setFont(fuente);
        
        grupo.getChildren().add(circulo);
        grupo.getChildren().add(texto);
        
        //Scene escena=new Scene(grupo);
        Scene escena=new Scene(grupo,450,300);
        
        escena.setFill(Color.GREEN);
        
        primaryStage.setScene(escena);
        
        primaryStage.setTitle("Demo 3 métodos Scene");

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
