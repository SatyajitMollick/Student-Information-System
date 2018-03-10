package application;
import java.io.File;

import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class adminlogin extends Button{
	
	File file=new File("adminlogin.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
	
	File file2=new File("vbox.jpg");
	Image i2=new Image(file2.toURI().toString());
	ImageView ii2=new ImageView(i2);
	
	File file3=new File("Usera.png");
	Image i3=new Image(file3.toURI().toString());
	ImageView ii3=new ImageView(i3);
	
	Button bl=new Button("Log-In");
	TextField t=new TextField();
	PasswordField p=new PasswordField();
	
	public void adminlogin(){
		Stage stage=new Stage();
		Pane pane=new Pane();
		pane.setPrefSize(850, 550);
		pane.getStyleClass().add("lpane");
		
		t.setPromptText("Enter Name here");
		p.setPromptText("Enter ID here");
		
		t.getStyleClass().add("ltex");
		p.getStyleClass().add("ltex");
		bl.getStyleClass().add("lbut");
		bl.setPrefSize(250, 30);
		VBox vb=new VBox();
		vb.getChildren().addAll(t,p,bl);
		
		
		vb.getStyleClass().add("lvbox");
		vb.setPrefSize(250, 180);
		vb.relocate(300, 180);
		vb.setOpacity(.8);
		ii3.relocate(80, 170);
		pane.getChildren().addAll(ii,ii3,vb);
		
		bl.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				inner i=new inner();
				i.inner();
				stage.hide();
			}
		});
		
		
		
		Scene scene=new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setScene(scene);
		
		stage.show();
	}
	public class inner extends Button{
		public void inner(){
			admin a=new admin();
			a.admin();
		}
	}

}

