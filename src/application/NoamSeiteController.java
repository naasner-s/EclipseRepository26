package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NoamSeiteController {
	 @FXML
	    private Button btSD;
	 @FXML
	    private TextField tfSD;
	@FXML
    private Slider sd;

	String text;
    @FXML
    private Button btSchließen;

    @FXML
    private TextField tfText;

    @FXML
    void schließenFenster(ActionEvent event) {
    	Stage stage = (Stage) btSchließen.getScene().getWindow();
        stage.close();
    	//setText(tfText.getText());
    	setText(tfSD.getText());

    }
    @FXML
    void sliderAnzeige(ActionEvent event) {
    	tfSD.setText(String.valueOf(sd.getValue()));
    	
    }

    String getText2()
    {
    	return tfText.getText();
    }
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
    

}

