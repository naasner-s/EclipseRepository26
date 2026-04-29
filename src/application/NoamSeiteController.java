package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NoamSeiteController {
	
	String text;
    @FXML
    private Button btSchließen;

    @FXML
    private TextField tfText;

    @FXML
    void schließenFenster(ActionEvent event) {
    	Stage stage = (Stage) btSchließen.getScene().getWindow();
        stage.close();
    	setText(tfText.getText());
    }

    
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
    

}

