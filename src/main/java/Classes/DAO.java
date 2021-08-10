package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

    //JDBC url
	//JDBC userName
	//JDBC password
	private final String url = "jdbc:postgresql://localhost/bankdb";
	private final String user ="postgres";
	private final String password ="20December2012";
	
	private void connect() {
         try (Connection connection = DriverManager.getConnection(url,user,password);){
    	 if(connection !=null) {
    		 System.out.println("Connected to PostgreSQL sucessfully!");
    	 }else {
    		 System.out.println("Failed to connect PostgreSQL server");
    	 }
    	 
        }  catch (SQLException e) {
    	 // TODO Auto-generated catch block
    	 e.printStackTrace();	 
        }
	}
	
/*	public static void main(String[] args) {
		DBConnection connection = new DBConnection();
		connection.connect();
		
	}*/
	}
