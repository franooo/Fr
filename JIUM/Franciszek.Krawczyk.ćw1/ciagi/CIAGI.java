/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciagi;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;

import javafx.scene.Parent;


/**
 *Klasa podstawowa projektu. 
 * @version 1.0
 * @author FraKra
 * Klasa odpowiada za uruchomienie strony startowej programu.
 */

public class CIAGI extends Application {
    
   
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        
      
      //  Parent root = FXMLLoader.load(getClass().getResource("ProgressionCorrectVerify.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));
        Scene scene = new Scene (root, 640, 480);
        primaryStage.setTitle("Aplikacja Ciągi");
        primaryStage.setScene(scene);
        primaryStage.show();
        
      
        

        
        
        
        
    }
     
 
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}
