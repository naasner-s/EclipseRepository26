package application;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NaasnerFenster extends Stage {
	Stage meineBühne;
	AnchorPane meinBühnenbild;
	private String text = "";
	
	public NaasnerFenster() {
		super();
		setTitle("Zweite Fenster");
		initModality(Modality.APPLICATION_MODAL);
		
		Label label = new Label("Say something: ");
		TextField textfield = new TextField();
		VBox main = new VBox(label, textfield);
		main.setSpacing(10);

		Button ok = new Button("OK");
		Button cancel = new Button("Cancel");

		textfield.setOnAction(e -> {
		text = textfield.getText();
		close();
		});


		ok.setOnAction(e -> {
		text = textfield.getText();
		close();
		});

		cancel.setOnAction(e -> {
		close();
		});

		HBox buttons = new HBox(ok, cancel);
		buttons.setSpacing(5);
		buttons.setAlignment(Pos.CENTER_RIGHT);
		buttons.setPadding(new Insets(15, 0, 0, 0));

		BorderPane pane = new BorderPane(main);
		pane.setBottom(buttons);
		pane.setPadding(new Insets(20));

		Scene scene = new Scene(pane, 350, 120);
		setScene(scene);
		
		
	}
	public String getText() 
	{
		return text;
		}
}
