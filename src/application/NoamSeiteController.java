package application;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class NoamSeiteController {
	  @FXML
	    private ImageView iv;

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
    
    Image bild;
    
    

    @FXML
    void schließenFenster(ActionEvent event) {
    	Stage stage = (Stage) btSchließen.getScene().getWindow();
        stage.close();
        if(tfText.getText().isEmpty())
        	setText(tfSD.getText());
        else
        	setText(tfText.getText());
        setBild(iv.getImage());
        
        
        


    }
    
	public Image getBild() {
		return bild;
	}

	public void setBild(Image bild) {
		this.bild = bild;
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

