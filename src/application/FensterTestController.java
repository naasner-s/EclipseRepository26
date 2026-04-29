package application;

import java.io.IOException;

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
    private Button btDrücken;
    @FXML
    private Button btDrücken1;
  
    @FXML
    private TextField tfAnzeige;

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
    void drueckenSchaltflaeche2(ActionEvent event) throws IOException 
    {
    	Stage stage2 = new Stage();
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("OmarSeite.fxml"));
    	Parent root = loader.load();
        NaasnerSeiteController controller2 = loader.getController();  //Braucht man nur, wenn man Werte aus dem neuen Fenster zurückgeben will
        stage2.setScene(new Scene(root));
        stage2.setTitle("Das ist das 2. Fenster");
        stage2.initModality(Modality.APPLICATION_MODAL); // Dann kann das alte Fenster nicht mehr aktiv sein
      
        stage2.showAndWait();
        tfAnzeige.setText(controller2.getText()); //Holt aus dem schließenden Fenster den Wert
            	
	}
 }


