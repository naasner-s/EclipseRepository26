package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Slider;

public class AndrejSeiteController {
	String Rückgabe;
	
    @FXML
    private Button btSchließen;
    
    @FXML
    private Slider slider;

    @FXML
    private TextField tfText;
    
    @FXML
    String schließenFenster(ActionEvent event) {
    	
    	Stage stage = (Stage) btSchließen.getScene().getWindow();
        stage.close();
        
        if(slider.getValue() != 0 && tfText.getText().isEmpty()) {
        	this.setRückgabe(String.valueOf(slider.getValue()));
        	return Rückgabe;
        }
        
        else if(!tfText.getText().isEmpty())
        {
        	this.setRückgabe(tfText.getText());
        	return Rückgabe;
        	
        }
        else {
        	return Rückgabe = "0";
        }
    }
    
  /*  @FXML
    String schließenFenster(ActionEvent event) {
    	
    	Stage stage = (Stage) btSchließen.getScene().getWindow();
        stage.close();
        
        if(!tfText.getText().equals(null))
        {
        	return tfText.getText();
        	
        }
        else if(slider.getValue() != null) {
        	return String.valueOf(slider.getValue());
        }
        else {
        	return null;
        }
    }
    */

    
    
    
    String getText()
    {
    	return tfText.getText();
    }
    
    Double getSlider()
    {
    	return slider.getValue();
    }


	public String getRückgabe() {
		return Rückgabe;
	}


	public void setRückgabe(String rückgabe) {
		Rückgabe = rückgabe;
	}
	
	
    
    
}
