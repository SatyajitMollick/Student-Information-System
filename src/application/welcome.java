package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class welcome extends Application {
	File file=new File("welcome.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	Label l=new Label("",ii);
	
	File file2=new File("buttona.png");
	Image i2=new Image(file2.toURI().toString());
	ImageView ii2=new ImageView(i2);
	Label l2=new Label("",ii2);
	
	File file3=new File("buttons.png");
	Image i3=new Image(file3.toURI().toString());
	ImageView ii3=new ImageView(i3);
	Label l3=new Label("",ii3);
	
	File file4=new File("buttono.png");
	Image i4=new Image(file4.toURI().toString());
	ImageView ii4=new ImageView(i4);
	Label l4=new Label("",ii4);
	
	File file5=new File("buttone.png");
	Image i5=new Image(file5.toURI().toString());
	ImageView ii5=new ImageView(i5);
	Label l5=new Label("",ii5);
	
	Button b=new Button("");
	Button b2=new Button("");
	Button b3=new Button("");
	Button b4=new Button("");
	public void start(Stage stage) {
		Pane pane=new Pane();
		pane.setPrefSize(850, 550);
		pane.getStyleClass().add("pane");
		pane.getChildren().addAll(l,l2,b,b2,b3,b4);
		//b.relocate(100, 200);
		b.setGraphic(ii2);
		b.relocate(10, 330);
		b.setPrefSize(200, 50);
		b.getStyleClass().add("button");
		//b2.relocate(150, 260);
		b2.setGraphic(ii3);
		b2.relocate(220, 330);
		b2.setPrefSize(200, 50);
		b2.getStyleClass().add("button");
		b3.setGraphic(ii4);
		b3.relocate(430, 330);
		b3.setPrefSize(200, 50);
		b3.getStyleClass().add("button");
		b4.setGraphic(ii5);
		b4.relocate(640, 330);
		b4.setPrefSize(200, 50);
		b4.getStyleClass().add("button");
		
		Scene scene=new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		b3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				online on=new online();
				on.online();
			}
		});
		b4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				Platform.exit();
			}
		});
		b.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
					adminlogin al =new adminlogin();
					al.adminlogin();	
			}
		});
		b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				studentlogin sl=new studentlogin();			  				
  				sl.studentlogin();
			}
		});	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
