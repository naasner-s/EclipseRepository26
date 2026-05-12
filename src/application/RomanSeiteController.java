package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Slider;

public class RomanSeiteController {
    @FXML
    private Button btSchließen;

    @FXML
    private Slider tfText;
    
    @FXML
    Double schließenFenster(ActionEvent event) {
    	
    	Stage stage = (Stage) btSchließen.getScene().getWindow();
        stage.close();
        return tfText.getValue();
    }
    
    
    Double getText()
    {
    	return tfText.getValue();
    }


}
