/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciagi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.stage.Stage;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.fxml.FXMLLoader;
/**
 * FXML Controller class
 *
 * @author FraKra
 * @version 1.0
 *Kontroler strony startowej.
 */
public class StartPageController implements Initializable {

    @FXML private Button nthButton;
    @FXML private Button progressionButton;
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCalculateNthButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) nthButton.getScene().getWindow();   
        Parent root = FXMLLoader.load(getClass().getResource("NthTermCalculate.fxml"));
        Scene scene = new Scene (root, 640, 480);
        stage.setTitle("Aplikacja Ciągi - obliczanie n-tego wyrazu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleVerifyProgressionButtonAction(ActionEvent event)throws Exception {
        Stage stage = (Stage) nthButton.getScene().getWindow();   
        Parent root = FXMLLoader.load(getClass().getResource("ProgressionCorrectVerify.fxml"));
        Scene scene = new Scene (root, 640, 480);
        stage.setTitle("Aplikacja Ciągi - weryfikacja poprawnosci ciagu");
        stage.setScene(scene);
        stage.show();
    }




    
}
