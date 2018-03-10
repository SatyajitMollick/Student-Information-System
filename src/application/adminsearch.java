package application;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.sql.*;


import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class adminsearch extends Button{
	Statement statement;
	Connection connection;
	TextField t=new TextField();
	Button b=new Button("Search");
	File file=new File("search.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	public void adminsearch(){
		initializeDB();
		Stage stage=new Stage();
		Pane pane=new Pane();
		pane.setPrefSize(300, 180);
		pane.getChildren().addAll(ii,t,b);
		t.relocate(80, 50);
		t.setPromptText("Enter ID");
		b.relocate(120, 100);
		Scene scene=new Scene(pane);
		stage.setScene(scene);
		stage.show();
		b.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				information i=new information();
				i.information();
				stage.hide();
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
	public class information extends Button{
		File file=new File("information.png");
		Image i=new Image(file.toURI().toString());
		ImageView ii=new ImageView(i);
		Button b=new Button();
		Button b2=new Button("Search");
		Label l=new Label();
		Label l2=new Label("ID : 	");
		Label l3=new Label("Department : 	");
		Label l4=new Label("E-mail : 	");
		Label l5=new Label("Blood Group : 	");
		Label l6=new Label("Address : 	");
		Label l7=new Label();
		Label l8=new Label();
		Label l9=new Label();
		Label l0=new Label();
		Label l11=new Label();
		Label l12=new Label("Rajshahi University Of Engineering & Technology");
		public void information(){
			Stage stage=new Stage();
			Pane pane=new Pane();
			pane.setPrefSize(850, 550);
			pane.getChildren().addAll(ii,b,l,l2,l3,l4,l5,l6,l7,l8,l9,l0,l11,l12);
			b.setPrefSize(150, 150);
			b.relocate(600, 180);
			l.relocate(620, 370);
			l2.relocate(193, 210);
			l3.relocate(106, 250);
			l4.relocate(157, 290);
			l5.relocate(100, 330);
			l6.relocate(142, 370);
			l7.relocate(240, 210);
			l8.relocate(240, 250);
			l9.relocate(240, 290);
			l0.relocate(240, 330);
			l11.relocate(240, 370);
			l12.relocate(43, 28);
			t.getStyleClass().add("text");
			t.setPromptText("Enter ID");
			l.getStyleClass().add("spane");
			l2.getStyleClass().add("spane");
			l3.getStyleClass().add("spane");
			l4.getStyleClass().add("spane");
			l5.getStyleClass().add("spane");
			l6.getStyleClass().add("spane");
			l7.getStyleClass().add("spane");
			l8.getStyleClass().add("spane");
			l9.getStyleClass().add("spane");
			l0.getStyleClass().add("spane");
			l11.getStyleClass().add("spane");
			l12.getStyleClass().add("big");
			b.getStyleClass().add("round");
			
			try{
				String query="select * from information where ID='"+t.getText()+"'";
				
				ResultSet rset=statement.executeQuery(query);
				if(rset.next()){
					
					l.setText(rset.getString(1));
					l7.setText(rset.getString(2));
					l8.setText(rset.getString(3));
					l9.setText(rset.getString(5));
					l0.setText(rset.getString(4));
					l11.setText(rset.getString(6));
					InputStream input = new ByteArrayInputStream(rset.getBytes(7));
		            Image imge = new Image(input);
		            ImageView view=new ImageView(imge);
		            b.setGraphic(view);}
			}catch(Exception e){
				
			}
			Scene scene=new Scene(pane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		
}}}
