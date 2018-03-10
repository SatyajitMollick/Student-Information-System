package application;

import java.sql.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.stage.Stage;
import javafx.util.Callback;

public class notice extends Button{
	Statement statement;
	Connection connection;
	ObservableList<ObservableList> data;
    TableView tableview=new TableView();
	public void notice(){
		initializeDB();
		 data = FXCollections.observableArrayList();
		try{

			String query="select * from message";
			ResultSet rset = statement.executeQuery(query);
            for(int i=0 ; i<rset.getMetaData().getColumnCount(); i++){
                final int j = i;                
                TableColumn col = new TableColumn(rset.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                    public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                        return new SimpleStringProperty(param.getValue().get(j).toString());                        
                    }                    
                });
               
                tableview.getColumns().addAll(col); 
                //System.out.println("Column ["+i+"] ");
            }
            while(rset.next()){
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rset.getMetaData().getColumnCount(); i++){
                    row.add(rset.getString(i));
                }
               // System.out.println("Row [1] added "+row );
                data.add(row);

            }
            tableview.setItems(data);
           
		}catch(Exception ex){
			ex.printStackTrace();
		}
	
		Stage stage=new Stage();
		
		Scene scene=new Scene(tableview);
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
