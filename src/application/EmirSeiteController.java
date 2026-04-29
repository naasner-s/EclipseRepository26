package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class EmirSeiteController {
    @FXML
    private Button btSchließen;

    @FXML
    private TextField tfText;
    @FXML
    private MediaView mediaView;
    
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
    public void initialize() {
    	String path = getClass().getResource("Videos/dombora.mp4").toExternalForm();
    	
    	Media media = new Media(path);
    	MediaPlayer player = new MediaPlayer(media);
    	mediaView.setMediaPlayer(player);
    	player.play();
    	
    }
    

}
