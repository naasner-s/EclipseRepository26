package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DarioSeiteController {
    @FXML
    private Button btSchliessen;

    @FXML
    private TextField tfText;
    
    @FXML
    String schliessenFenster(ActionEvent event) {
    	
    	Stage stage = (Stage) btSchliessen.getScene().getWindow();
        stage.close();
        return tfText.getText();
    }
    
    
    String getText()
    {
    	return tfText.getText();
    }


}
