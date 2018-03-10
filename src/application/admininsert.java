package application;
import java.io.File;
import java.sql.*;

import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class admininsert extends Button{
	protected static final String CURRENT_TIMESTAMP = null;
	Statement statement;
	Connection connection;
	File file=new File("statue.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
	File file2=new File("press.png");
	Image i2=new Image(file2.toURI().toString());
	ImageView ii2=new ImageView(i2);
	ImageView ii3=new ImageView(i2);
	ImageView ii4=new ImageView(i2);
	ImageView ii5=new ImageView(i2);
	ImageView ii6=new ImageView(i2);
	ImageView ii7=new ImageView(i2);
	ImageView ii8=new ImageView(i2);
	ImageView ii9=new ImageView(i2);
	ImageView ii0=new ImageView(i2);
	ImageView ii11=new ImageView(i2);
	ImageView ii12=new ImageView(i2);
	ImageView ii13=new ImageView(i2);
	ImageView ii14=new ImageView(i2);
	ImageView ii15=new ImageView(i2);
	ImageView ii16=new ImageView(i2);
	ImageView ii17=new ImageView(i2);
	ImageView ii18=new ImageView(i2);
	ImageView ii19=new ImageView(i2);
	Label l=new Label("Insert Data into the Database");
	Button b=new Button("");
	Button b2=new Button("");
	Button b3=new Button("");
	Button b4=new Button("");
	Button b5=new Button("");
	Button b6=new Button("");
	Button b7=new Button("");
	Button b8=new Button("");
	Button b9=new Button("");
	Button b0=new Button("");
	Button b11=new Button("");
	Button b12=new Button("");
	Button b13=new Button("");
	Button b14=new Button("");
	Button b15=new Button("");
	TextField t=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	TextField t9=new TextField();
	TextField t0=new TextField();
	TextField t11=new TextField();
	TextField t12=new TextField();
	TextField t13=new TextField();
	
	public void admininsert(){
		initializeDB();
		Stage stage=new Stage();
		Pane pane=new Pane();
		MenuBar menubar=new MenuBar();
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
		menu.getStyleClass().add("smenu");
		menubar.getStyleClass().add("smenubar");		
		pane.setPrefSize(850, 550);
		pane.getStyleClass().add("lpane");		
		pane.getChildren().addAll(ii,menubar,l,t,t2,t3,t4,t5,t9,t0,t11,t12,t13,b,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12,b13,b14,b15);
		l.relocate(280, 50);
		l.getStyleClass().add("label");
		t.relocate(50, 100);
		t.setPromptText("CSE-601");
		t.setPrefWidth(80);
		t.getStyleClass().add("ltext");
		t9.relocate(140, 100);
		t9.setPrefWidth(80);
		t9.getStyleClass().add("ltext");
		t2.relocate(50, 160);
		t2.setPromptText("CSE-603");
		t2.setPrefWidth(80);
		t2.getStyleClass().add("ltext");
		t0.relocate(140, 160);
		t0.setPrefWidth(80);
		t0.getStyleClass().add("ltext");
		t3.relocate(50, 220);
		t3.setPromptText("CSE-605");
		t3.setPrefWidth(80);
		t3.getStyleClass().add("ltext");
		t11.relocate(140, 220);
		t11.setPrefWidth(80);
		t11.getStyleClass().add("ltext");
		t4.relocate(50, 280);
		t4.setPromptText("CSE-607");
		t4.setPrefWidth(80);
		t4.getStyleClass().add("ltext");
		t12.relocate(140, 280);
		t12.setPrefWidth(80);
		t12.getStyleClass().add("ltext");
		t5.relocate(50, 340);
		t5.setPromptText("CSE-609");
		t5.setPrefWidth(80);
		t5.getStyleClass().add("ltext");
		t13.relocate(140, 340);
		t13.setPrefWidth(80);
		t13.getStyleClass().add("ltext");
		b.relocate(250, 80);
		b.setGraphic(ii2);
		b2.relocate(390, 80);
		b2.setGraphic(ii3);
		b3.relocate(520, 80);
		b3.setGraphic(ii4);
		b4.relocate(250, 140);
		b4.setGraphic(ii5);
		b5.relocate(390, 140);
		b5.setGraphic(ii6);
		b6.relocate(520, 140);
		b6.setGraphic(ii7);
		b7.relocate(250, 200);
		b7.setGraphic(ii8);
		b8.relocate(390, 200);
		b8.setGraphic(ii9);
		b9.relocate(520, 200);
		b9.setGraphic(ii0);
		b0.relocate(250, 260);
		b0.setGraphic(ii11);
		b11.relocate(390, 260);
		b11.setGraphic(ii12);
		b12.relocate(520, 260);
		b12.setGraphic(ii13);
		b13.relocate(250, 320);
		b13.setGraphic(ii14);
		b14.relocate(390, 320);
		b14.setGraphic(ii15);
		b15.relocate(520, 320);
		b15.setGraphic(ii16);
		
		b.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into operatingone values('"+t.getText()+"','"+t9.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into operatingtwo values('"+t.getText()+"','"+t9.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into operatingthree values('"+t.getText()+"','"+t9.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into computerone values('"+t2.getText()+"','"+t0.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into computertwo values('"+t2.getText()+"','"+t0.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into computerthree values('"+t2.getText()+"','"+t0.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into dataone values('"+t3.getText()+"','"+t11.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into datatwo values('"+t3.getText()+"','"+t11.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into datathree values('"+t3.getText()+"','"+t11.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into perione values('"+t4.getText()+"','"+t12.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b11.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into peritwo values('"+t4.getText()+"','"+t12.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b12.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into perithree values('"+t4.getText()+"','"+t12.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b13.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into aione values('"+t5.getText()+"','"+t13.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b14.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into aitwo values('"+t5.getText()+"','"+t13.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		b15.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				try{
					String query="insert into aithree values('"+t5.getText()+"','"+t13.getText()+"')";
					statement.executeUpdate(query);
					System.out.print("Data Sucessfully inserted");
				}catch(Exception ex){
					
				}
			}
		});
		
		i4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				
			}
		});
		
		Scene scene=new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	
		stage.setScene(scene);		
		stage.show();
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

