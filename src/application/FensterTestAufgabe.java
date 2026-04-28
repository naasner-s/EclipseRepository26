package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class FensterTestAufgabe extends Application 
{
	Stage meineBühne;
	AnchorPane meinBühnenbild;
	
	@Override
	public void start(Stage primaryStage) {
		meineBühne=primaryStage;
					
		try 
		{
		   FXMLLoader lLoader = new FXMLLoader();
		   lLoader.setLocation(FensterTestAufgabe.class.getResource("FensterTestView.fxml"));
		   meinBühnenbild= (AnchorPane) lLoader.load();
			
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		Scene lScene = new Scene(meinBühnenbild);
		meineBühne.setScene(lScene);
		meineBühne.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
