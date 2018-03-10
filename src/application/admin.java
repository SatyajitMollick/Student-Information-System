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

public class admin extends Button{
	Statement statement;
	Connection connection;
	File file=new File("show.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
	File file2=new File("buttoni.png");
	Image i2=new Image(file2.toURI().toString());
	ImageView ii2=new ImageView(i2);
	
	File file3=new File("buttond.png");
	Image i3=new Image(file3.toURI().toString());
	ImageView ii3=new ImageView(i3);
	
	File file4=new File("buttonss.png");
	Image i4=new Image(file4.toURI().toString());
	ImageView ii4=new ImageView(i4);
	
	File file5=new File("buttonash.png");
	Image i5=new Image(file5.toURI().toString());
	ImageView ii5=new ImageView(i5);
	
	File file6=new File("usera.png");
	Image i6=new Image(file6.toURI().toString());
	ImageView ii6=new ImageView(i6);
	
	File file7=new File("scomplain.png");
	Image i7=new Image(file7.toURI().toString());
	ImageView ii7=new ImageView(i7);
	
	File file8=new File("amessage.png");
	Image i8=new Image(file8.toURI().toString());
	ImageView ii8=new ImageView(i8);
	
	File file9=new File("aevents.png");
	Image i9=new Image(file9.toURI().toString());
	ImageView ii9=new ImageView(i9);
	
	Button b=new Button("");
	Button b2=new Button("");
	Button b3=new Button("");
	Button b4=new Button("");
	Button b5=new Button("");
	Button b6=new Button("");
	Button b7=new Button("");
	Button b8=new Button("");
	
	TextField t=new TextField();
	public void admin(){
		initializeDB();
		Pane pane=new Pane();
		MenuBar menubar=new MenuBar();
		VBox vb=new VBox();
		vb.getChildren().addAll(b,b2,b3,b4);
		vb.getStyleClass().add("lvbox");
		vb.setPrefSize(200, 300);
		vb.relocate(5, 40);
		vb.setOpacity(.8);
		
		Menu menu=new Menu();
		menu.setText("V");
		Menu menu2=new Menu();
		menu2.setText("Show");
		Menu menu3=new Menu();
		menu3.setText("Others");
		MenuItem i=new MenuItem("Help");
		MenuItem i2=new MenuItem("Setting");
		MenuItem i3=new MenuItem("Log Out");
		MenuItem i4=new MenuItem("Exit");
		menu.getItems().addAll(i,i2,new SeparatorMenuItem());
		menu.getItems().add(menu3);
		menu3.getItems().addAll(i3,i4);
		menubar.getMenus().addAll(menu,menu2);
		menubar.setPrefSize(850, 35);
		
		pane.setPrefSize(850, 550);
		pane.getStyleClass().add("spane");
		pane.getChildren().addAll(ii,menubar,vb,b5,b6,b7,b8);
		menu.getStyleClass().add("smenu");
		menubar.getStyleClass().add("smenubar");
			
		b.setGraphic(ii2);
		b2.setGraphic(ii3);
		b3.setGraphic(ii4);
		b4.setGraphic(ii5);
		b5.setGraphic(ii6);
		b5.relocate(640, 40);
		b6.setGraphic(ii7);
		b6.relocate(250, 350);
		b7.setGraphic(ii8);
		b7.relocate(400, 350);
		b8.setGraphic(ii9);
		b8.relocate(550, 350);
		b.getStyleClass().add("button");
		b2.getStyleClass().add("button");
		b3.getStyleClass().add("button");
		b4.getStyleClass().add("button");
		b5.getStyleClass().add("button");
		t.getStyleClass().add("st");
		Stage stage=new Stage();
		Scene scene=new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setScene(scene);
		stage.show();

		i4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				
				stage.hide();
			}
		});	
		
		i3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				adminlogin al=new adminlogin();
				al.adminlogin();
				stage.hide();
			}
		});	
		b.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				admininsert ai=new admininsert();
				ai.admininsert();
			}
		});
		b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				admindelete ad=new admindelete();
				ad.admindelete();
			}
		});
		b3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				adminsearch ai=new adminsearch();
				ai.adminsearch();
			}
		});
		b4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				adminshow ash=new adminshow();
				ash.adminshow();
			}
		});
		b6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				admincomplain ac=new admincomplain();
				ac.admincomplain();
			}
		});
		b7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				File file=new File("com.png");
				Image i=new Image(file.toURI().toString());
				ImageView ii=new ImageView(i);
				TextArea t2=new TextArea();
				Button b=new Button("Click");
				Stage stage=new Stage();
				Pane pane=new Pane();
				pane.setPrefSize(300, 420);
				pane.getChildren().addAll(ii,t2,b);
				t2.relocate(50, 60);
				t2.setPrefSize(200, 280);
				t2.setPromptText("Enter Message here");
				b.relocate(50, 360);
				Scene scene=new Scene(pane);
				stage.setScene(scene);
				stage.show();
				b.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent e){
						try{
							String query="insert into message values('"+t2.getText()+"')";
							statement.executeUpdate(query);
							System.out.print("Data Sucessfully inserted");
						}catch(Exception ex){
							
						}	
					}
				});
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
