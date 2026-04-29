package application;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FensterTestController {
	
    @FXML
    private CheckBox cbAdrian;
	
    @FXML
    private Button btFensterAdrian;
	
    @FXML
    private Button btDrücken;

    @FXML
    private TextField tfAnzeige;
    
    @FXML
    void WaechselnFensterAdi(ActionEvent event) throws IOException 
    {
    	Stage stage3 = new Stage();
    	FXMLLoader loaderAdrian = new FXMLLoader();
    	loaderAdrian.setLocation(getClass().getResource("FensterAdrian.fxml"));
    	Parent rootAdrian = loaderAdrian.load();
    	FensterAdrianController controller3 = loaderAdrian.getController();
    	stage3.setScene(new Scene(rootAdrian));
    	stage3.setTitle("Das ist Adrian's Fenster");
    	stage3.initModality(Modality.APPLICATION_MODAL);
    	
    	stage3.showAndWait();
    	tfAnzeige.setText(controller3.getText());
    	cbAdrian.setSelected(controller3.getBool());
    }

    @FXML
    void drueckenSchaltflaeche(ActionEvent event) throws IOException 
    {
    	Stage stage2 = new Stage();
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("NaasnerSeite.fxml"));
    	Parent root = loader.load();
        NaasnerSeiteController controller2 = loader.getController();  //Braucht man nur, wenn man Werte aus dem neuen Fenster zurückgeben will
        stage2.setScene(new Scene(root));
        stage2.setTitle("Das ist das 2. Fenster");
        stage2.initModality(Modality.APPLICATION_MODAL); // Dann kann das alte Fenster nicht mehr aktiv sein
      
        stage2.showAndWait();
        tfAnzeige.setText(controller2.getText()); //Holt aus dem schließenden Fenster den Wert
            	
	}
 }


