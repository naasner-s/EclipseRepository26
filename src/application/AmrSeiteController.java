package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AmrSeiteController {
    @FXML
    private Button btSchließen;

    @FXML
    private TextField tfText;
    
    @FXML
    private Button btDrücken2;

    
    @FXML
    String schließenFenster(ActionEvent event) {
    	
    	Stage stage = (Stage) btSchließen.getScene().getWindow();
        stage.close();	
        return tfText.getText();
    }
    
    
    String getText()
    {
    	return tfText.getText();
    }


}
