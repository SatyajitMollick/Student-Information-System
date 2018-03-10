package application;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.sql.*;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class studentlogin extends Button{
	Statement statement;
	Connection connection;
	Button bl=new Button("Log-In");
	TextField t=new TextField();
	PasswordField p=new PasswordField();
	
	
	File file=new File("studentlogin.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
	File file3=new File("Usera.png");
	Image i3=new Image(file3.toURI().toString());
	ImageView ii3=new ImageView(i3);
	//Button l=new Label("",i3);
	
	File file2=new File("vbox.jpg");
	Image i2=new Image(file2.toURI().toString());
	ImageView ii2=new ImageView(i2);
	public void studentlogin(){
		initializeDB();
		Stage stage=new Stage();
		Pane pane=new Pane();
		pane.setPrefSize(850, 550);
		pane.getStyleClass().add("lpane");
		//pane.getChildren().addAll(t,p,b);
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
				inners i=new inners();
				i.inners();
				stage.hide();
			}
		});
		
		Scene scene=new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setScene(scene);
		
		stage.show();
	}
	public class inners extends Button{
		public void inners(){
			try{
				String query="select Name,ID from information where Name='"+t.getText()+"'and ID='"+p.getText()+"'";
				ResultSet rset = statement.executeQuery(query);
				if(rset.next()){
					
					student s=new student();
					s.student();
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
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
	public class student extends Button{
		Statement statement;
		Connection connection;
		private ObservableList<ObservableList> data;
	    private TableView tableview=new TableView();
		File file=new File("moon.jpg");
		Image i=new Image(file.toURI().toString());
		ImageView ii=new ImageView(i);
		Label l=new Label("Message");
		
		File file2=new File("message.png");
		Image i2=new Image(file2.toURI().toString());
		ImageView ii2=new ImageView(i2);
		Label l2=new Label("",ii2);
		
		File file3=new File("ct.png");
		Image i3=new Image(file3.toURI().toString());
		ImageView ii3=new ImageView(i3);
		Label l3=new Label("",ii3);
		
		File file4=new File("attendance.png");
		Image i4=new Image(file4.toURI().toString());
		ImageView ii4=new ImageView(i4);
		Label l4=new Label("",ii4);
		
		File file5=new File("events.png");
		Image i5=new Image(file5.toURI().toString());
		ImageView ii5=new ImageView(i5);
		Label l5=new Label("",ii5);
		
		File file6=new File("stu.png");
		Image i6=new Image(file6.toURI().toString());
		ImageView ii6=new ImageView(i6);
		Label l6=new Label("",ii6);
		
		File file7=new File("ctdates.png");
		Image i7=new Image(file7.toURI().toString());
		ImageView ii7=new ImageView(i7);
		
		File file8=new File("routine.png");
		Image i8=new Image(file8.toURI().toString());
		ImageView ii8=new ImageView(i8);
		
		File file9=new File("busss.png");
		Image i9=new Image(file9.toURI().toString());
		ImageView ii9=new ImageView(i9);
		
		File file0=new File("vication.png");
		Image i0=new Image(file0.toURI().toString());
		ImageView ii0=new ImageView(i0);
		
		File file11=new File("teacher.png");
		Image i11=new Image(file11.toURI().toString());
		ImageView ii11=new ImageView(i11);
		
		File file12=new File("complain.png");
		Image i12=new Image(file12.toURI().toString());
		ImageView ii12=new ImageView(i12);
		
		File file13=new File("go.png");
		Image i13=new Image(file13.toURI().toString());
		ImageView ii13=new ImageView(i13);
		
		
		
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
		
		TextField t1=new TextField();
		TextField t2=new TextField("teacher");
		TextField t3=new TextField("vacation");
		TextField ta=new TextField();
		TextField t4=new TextField("ctdates");
		TextField t5=new TextField("routine");
		
		public void student(){
			initializeDB();
			Pane pane=new Pane();
			MenuBar menubar=new MenuBar();
			
			
			
			Menu menu=new Menu();
			menu.setText("Open");
			Menu menu2=new Menu();
			menu2.setText("Show");
			Menu menu3=new Menu();
			menu3.setText("Extra");
			MenuItem i=new MenuItem("Activity Log");
			MenuItem i2=new MenuItem("News Feed");
			MenuItem i3=new MenuItem("Log Out");
			MenuItem i4=new MenuItem("Exit");
			menu.getItems().addAll(i,i2,new SeparatorMenuItem());
			menu.getItems().add(menu3);
			menu3.getItems().addAll(i3,i4);
			menubar.getMenus().addAll(menu,menu2);
			menubar.setPrefSize(850, 35);
			
			pane.setPrefSize(850, 550);
			pane.getStyleClass().add("spane");
			pane.getChildren().addAll(ii,menubar,b,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12,t1);
			menu.getStyleClass().add("smenu");
			menubar.getStyleClass().add("smenubar");
			
			//b.getStyleClass().add("sbutton");
			b.setPrefSize(70, 70);
			b.relocate(735, 50);
			//b.setGraphic(ii6);
			b2.relocate(10, 40);
			b2.setGraphic(ii2);
			b3.relocate(10, 150);
			b3.setGraphic(ii3);
			b4.relocate(10, 260);
			b4.setGraphic(ii4);
			b5.relocate(10, 370);
			b5.setGraphic(ii5);
			b6.relocate(200, 440);
			b6.setGraphic(ii7);
			b7.relocate(350, 440);
			b7.setGraphic(ii8);
			b8.relocate(500, 440);
			b8.setGraphic(ii9);
			b9.relocate(650, 440);
			b9.setGraphic(ii0);
			b0.relocate(200, 350);
			b0.setGraphic(ii11);
			b11.relocate(350, 350);
			b11.setGraphic(ii12);
			b12.relocate(720, 343);
			b12.setGraphic(ii13);
			t1.getStyleClass().add("st");
			t1.relocate(500, 360);
			t1.setPromptText("Go Online Website");
			
			try{
				String query="select * from picture where Name='"+t.getText()+"'";
				ResultSet rset=statement.executeQuery(query);
				if(rset.next()){
					InputStream input = new ByteArrayInputStream(rset.getBytes(3));
		            Image imge = new Image(input);
		            ImageView view=new ImageView(imge);
		            b.setGraphic(view);
				}	
			}catch(Exception ex){
				
			}
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
					studentlogin l=new studentlogin();
					l.studentlogin();
					stage.hide();
				}
			});	
			
			b.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					
				}
			});
			b2.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					
					notice n=new notice();
					n.notice();
				}
			});
			b3.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					File file=new File("search.jpg");
					Image i=new Image(file.toURI().toString());
					ImageView ii=new ImageView(i);
					Stage stage=new Stage();
					Pane pane=new Pane();
					pane.setPrefSize(300, 180);
					Button bo=new Button("Search");
					
					pane.getChildren().addAll(ii,ta,bo);
					ta.relocate(80, 50);
					bo.relocate(120, 100);
					Scene scene=new Scene(pane);
					stage.setScene(scene);
					stage.show();
					bo.setOnAction(new EventHandler<ActionEvent>(){
						public void handle(ActionEvent e){
							cone co=new cone();
							co.cone();
							stage.hide();
						}
					});
				}
			});
			b4.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					try{
						String query="";
						statement.executeUpdate(query);
						System.out.print("Data Sucessfully inserted");
					}catch(Exception ex){
						
					}
				}
			});
			b5.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					try{
						String query="";
						statement.executeUpdate(query);
						System.out.print("Data Sucessfully inserted");
					}catch(Exception ex){
						
					}
				}
			});
			b6.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					Stage stage=new Stage();
					ScrollPane spane=new ScrollPane();
					spane.setPrefSize(930, 350);
					String s=t4.getText();
					try{
						String query="select * from other where ID='"+s+"'";
						ResultSet rset=statement.executeQuery(query);
						if(rset.next()){
							InputStream input = new ByteArrayInputStream(rset.getBytes(2));
				            Image imge = new Image(input);
				            ImageView view=new ImageView(imge);
				            spane.setContent(view);
						}
						System.out.print("Data Sucessfully Viewed");
					}catch(Exception ex){
						
					}
					Scene scene=new Scene(spane);
					stage.setScene(scene);
					stage.show();
				}
			});
			b7.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					Stage stage=new Stage();
					ScrollPane spane=new ScrollPane();
					spane.setPrefSize(880, 440);
					String s=t5.getText();
					try{
						String query="select * from other where ID='"+s+"'";
						ResultSet rset=statement.executeQuery(query);
						if(rset.next()){
							InputStream input = new ByteArrayInputStream(rset.getBytes(2));
				            Image imge = new Image(input);
				            ImageView view=new ImageView(imge);
				            spane.setContent(view);
						}
						System.out.print("Data Sucessfully Viewed");
					}catch(Exception ex){
						
					}
					Scene scene=new Scene(spane);
					stage.setScene(scene);
					stage.show();
				}
			});
			b8.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					
				}
			});
			b9.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					Stage stage=new Stage();
					ScrollPane spane=new ScrollPane();
					spane.setPrefSize(950, 550);
					String s=t3.getText();
					try{
						String query="select * from other where ID='"+s+"'";
						ResultSet rset=statement.executeQuery(query);
						if(rset.next()){
							InputStream input = new ByteArrayInputStream(rset.getBytes(2));
				            Image imge = new Image(input);
				            ImageView view=new ImageView(imge);
				            spane.setContent(view);
						}
						System.out.print("Data Sucessfully inserted");
					}catch(Exception ex){
						
					}
					Scene scene=new Scene(spane);
					stage.setScene(scene);
					stage.show();
				}
			});
			b0.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					Stage stage=new Stage();
					ScrollPane spane=new ScrollPane();
					spane.setPrefSize(850, 550);
					String s=t2.getText();
					try{
						String query="select * from other where ID='"+s+"'";
						ResultSet rset=statement.executeQuery(query);
						if(rset.next()){
							InputStream input = new ByteArrayInputStream(rset.getBytes(2));
				            Image imge = new Image(input);
				            ImageView view=new ImageView(imge);
				            spane.setContent(view);
						}
						System.out.print("Data Sucessfully inserted");
					}catch(Exception ex){
						
					}
					Scene scene=new Scene(spane);
					stage.setScene(scene);
					stage.show();
				}
			});
			b11.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					
					
					scomplain sc=new scomplain();
					sc.scomplain();
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
		public class cone extends Button{
			public void cone(){
				File file=new File("ctm.jpg");
				Image i=new Image(file.toURI().toString());
				ImageView ii=new ImageView(i);
				Label lo=new Label();
				Label lo2=new Label();
				Label lo3=new Label();
				Label lc=new Label();
				Label lc2=new Label();
				Label lc3=new Label();
				Label ld=new Label();
				Label ld2=new Label();
				Label ld3=new Label();
				Label lp=new Label();
				Label lp2=new Label();
				Label lp3=new Label();
				Label la=new Label();
				Label la2=new Label();
				Label la3=new Label();
				Stage stage=new Stage();
				Pane pane=new Pane();
				pane.setPrefSize(560, 400);
				pane.getChildren().addAll(ii,lo,lo2,lo3,lc,lc2,lc3,ld,ld2,ld3,lp,lp2,lp3,la,la2,la3);
				lo.relocate(50 , 50);
				lo2.relocate(260 , 50);
				lo3.relocate(380 , 50);
				lc.relocate(50 , 100);
				lc2.relocate(260 , 100);
				lc3.relocate(380 , 100);
				ld.relocate(50 , 150);
				ld2.relocate(260 , 150);
				ld3.relocate(380 , 150);
				lp.relocate(50 , 200);
				lp2.relocate(260 , 200);
				lp3.relocate(380 , 200);
				la.relocate(50 , 250);
				la2.relocate(260 , 250);
				la3.relocate(380 , 250);
				try{
					String query="select operatingone.marks,operatingtwo.marks,operatingthree.marks,dataone.marks,datatwo.marks,datathree.marks,computerone.marks,computertwo.marks,computerthree.marks,perione.marks,peritwo.marks,perithree.marks,aione.marks,aitwo.marks,aithree.marks from operatingone,operatingtwo,operatingthree ,dataone,datatwo,datathree,computerone,computertwo,computerthree,perione,peritwo,perithree,aione,aitwo,aithree where operatingone.roll=operatingtwo.roll and operatingtwo.roll=operatingthree.roll and operatingthree.roll=dataone.roll and dataone.roll=datatwo.roll and datatwo.roll=datathree.roll and datathree.roll=computerone.roll and computerone.roll=computertwo.roll and computertwo.roll=computerthree.roll and computerthree.roll=perione.roll and perione.roll=peritwo.roll and peritwo.roll=perithree.roll and perithree.roll=aione.roll and aione.roll=aitwo.roll and aitwo.roll=aithree.roll and operatingone.roll='"+ta.getText()+"'";
					ResultSet rset=statement.executeQuery(query);
					if(rset.next()){
						String marks1=rset.getString(1);
						String marks2=rset.getString(2);
						String marks3=rset.getString(3);
						String marks4=rset.getString(7);
						String marks5=rset.getString(8);
						String marks6=rset.getString(9);
						String marks7=rset.getString(4);
						String marks8=rset.getString(5);
						String marks9=rset.getString(6);
						String marks0=rset.getString(10);
						String marks11=rset.getString(11);
						String marks12=rset.getString(12);
						String marks13=rset.getString(13);
						String marks14=rset.getString(14);
						String marks15=rset.getString(15);
						lo.setText("Operating. CT One : "+marks1);
						lo2.setText(" CT Two : "+marks2);
						lo3.setText(" CT Three : "+marks3);
						lc.setText("Computer.. CT One : "+marks4);
						lc2.setText(" CT Two : "+marks5);
						lc3.setText(" CT Three : "+marks6);
						ld.setText("Data Com.. CT One : "+marks7);
						ld2.setText(" CT Two : "+marks8);
						ld3.setText(" CT Three : "+marks9);
						lp.setText("Peripheral CT One : "+marks0);
						lp2.setText(" CT Two : "+marks11);
						lp3.setText(" CT Three : "+marks12);
						la.setText("Artificial E. CT One : "+marks13);
						la2.setText(" CT Two : "+marks14);
						la3.setText(" CT Three : "+marks15);
					}
				}catch(Exception e){
					
				}
				
				Scene scene=new Scene(pane);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
			}
		}
		
	}


}

