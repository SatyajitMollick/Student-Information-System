package application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class adminshow extends Button{
	
	public void adminshow(){
		Stage stage=new Stage();
		Pane pane=new Pane();
		pane.setPrefSize(300, 300);
		
		Scene scene=new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

}
