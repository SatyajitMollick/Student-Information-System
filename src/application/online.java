package application;

import java.io.File;
import java.net.URL;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class online extends Button{
	
	

	public void online() {
		Stage stage=new Stage();
		StackPane pane=new StackPane();
		//pane.setPrefSize(850, 550);
		
		WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        File f = new File("C:\\xampp\\htdocs\\index.html");
        try {
            webView.getEngine().load(f.toURI().toURL().toString());
        } catch (Exception ex) {
            
        }
        pane.getChildren().add(webView);
	
		Scene scene=new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
	}

}
