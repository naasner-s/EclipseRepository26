package application;

import javafx.scene.control.CheckBox;

import java.util.concurrent.Delayed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class FensterAdrianController 
{

	    @FXML
	    private Button btFensterSchließen;

	    @FXML
	    private Button btThatDosentExists;

	    @FXML
	    private TextField tfRueckgabeText;

	    @FXML
	    private TextField tfThatDosentExists;
	    
	    Integer Presscounter = 0;
	    Boolean ThisBoolDosentExists = false;
	    PauseTransition delay = new PauseTransition(Duration.seconds(2));

	    
	    @FXML
	    void ActionThatDosentExists(ActionEvent event) throws InterruptedException 
	    {	
	    	
	    	if (Presscounter==0)
	    	{
	    		btThatDosentExists.setText("Stop");
	    		Presscounter++;
	    	}
	    	
	    	else if (Presscounter==1)
	    	{
	    		tfThatDosentExists.setVisible(true);
	    		tfThatDosentExists.setText("You Lost");
	    		ThisBoolDosentExists=true;
	    		Presscounter++;
	    		
	    		
	    		delay.setOnFinished(e -> {
	    		    Stage stage = (Stage) btThatDosentExists.getScene().getWindow();
	    		    stage.close();
	    		});
	    		delay.play();
	    	}
	    }

	    
	    
	    @FXML
	    String schließenFenster(ActionEvent event) 
	    {
	    	Stage stage = (Stage) btFensterSchließen.getScene().getWindow();
	        stage.close();
	        return tfRueckgabeText.getText();
	    }

	    String getText()
	    {
	    	return tfRueckgabeText.getText();
	    }
	    
	    Boolean getBool()
	    {
	    	return ThisBoolDosentExists;
	    }
}
