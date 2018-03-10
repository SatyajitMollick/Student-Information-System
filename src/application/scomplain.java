package application;

import java.io.File;
import java.sql.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class scomplain extends Button{
	TextField t=new TextField();
	TextArea t2=new TextArea();
	Button b=new Button("Click");
	Statement statement;
	Connection connection;
	File file=new File("com.png");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	public void scomplain(){
		initializeDB();
		
		Stage stage=new Stage();
		Pane pane=new Pane();
		pane.setPrefSize(300, 420);
		pane.getChildren().addAll(ii,t,t2,b);
		t.relocate(75, 50);
		t.setPromptText("Enter ID");
		t2.relocate(50, 80);
		t2.setPrefSize(200, 280);
		b.relocate(50, 370);
		Scene scene=new Scene(pane);
		stage.setScene(scene);
		stage.show();
		b.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into scomplain values('"+t.getText()+"','"+t2.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}	
			}
		});
		
	}
	private void initializeDB() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","");
			statement=connection.createStatement();		
	}
	catch(Exception ex){
		ex.printStackTrace();
		}
	}
}
