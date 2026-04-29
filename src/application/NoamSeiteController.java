package application;




import java.io.File;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class NoamSeiteController {
	Media media;
	@FXML
    private MediaView mv;
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
    
    MediaPlayer mediaPlayer;
    
    

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
	void initialize()
	{
		File file = new File("H:/Downloads/DBZ OP Instrumental.mp4");
    	String path = file.toURI().toString();
		media = new Media(path);
        //Media media = new Media("H:/Downloads/DBZ OP Instrumental.mp4");
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mv.setPreserveRatio(true);
        mv.setFitWidth(600);
        mediaPlayer.play();
	}
	
	@FXML
    void sliderAnzeige(ActionEvent event) {
    	tfSD.setText(String.valueOf(sd.getValue()));
    	/*
    	File file = new File("H:/Downloads/DBZ OP Instrumental.mp4");
    	String path = file.toURI().toString();

    	Media media = new Media(path);
        //Media media = new Media("H:/Downloads/DBZ OP Instrumental.mp4");
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        */
    	
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

