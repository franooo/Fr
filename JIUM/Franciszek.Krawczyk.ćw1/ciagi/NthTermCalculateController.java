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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author FraKra
 * @version 1.0
 * Kontroler do strony aplikacji. Odpowiada za wywołanie reakcji na przycisi w widoku.
 */
public class NthTermCalculateController implements Initializable {

    Progression progression;
    
    @FXML private CheckBox arithmeticCheck;
    @FXML private CheckBox geometricCheck;
    @FXML private TextField aValue;
    @FXML private TextField rValue;
    @FXML private TextField nthTerm;
    @FXML private Label result;
    @FXML
    private Button backButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        progression = new Geometric();
        arithmeticCheck.setSelected(true);
        geometricCheck.setSelected(false);
        result.setVisible(false);
    }    

     @FXML
    private void setArithmetic(ActionEvent event) {
        
        progression = new Arithmetic();
        arithmeticCheck.setSelected(true);
        geometricCheck.setSelected(false);
        
        
    }


     @FXML
    private void setGeometric(ActionEvent event) {
    
        
        progression = new Geometric();
        arithmeticCheck.setSelected(false);
        geometricCheck.setSelected(true);
        
    }

    @FXML
    private void calculateProgression(ActionEvent event) {
           try{
            progression.setA(Double.parseDouble(aValue.getText()));
            progression.setB( Double.parseDouble(rValue.getText()));
            double resultProgression = progression.getNTerm(Integer.parseInt(nthTerm.getText()));
            result.setText(Double.toString(resultProgression));              
            result.setVisible(true);
        
        }
        catch(Exception e){
            result.setText("Błędne dane.");
            result.setVisible(true);
        }
    }

    @FXML
    private void backwardButton(ActionEvent event) throws Exception {
        Stage stage = (Stage) backButton.getScene().getWindow();   
        Parent root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));
        Scene scene = new Scene (root, 640, 480);
        stage.setTitle("Aplikacja Ciągi - weryfikacja poprawnosci ciagu");
        stage.setScene(scene);
        stage.show();
    }
    
}
