package formsservice.dao;

import java.sql.*;

public class DatabaseManager {

	 private static Connection conn = null;
     private static Statement statement = null;
     private static ResultSet resultSet = null;
     private static String driver = "com.mysql.jdbc.Driver";
     private static String dbURL = "jdbc:mysql://sql2.freemysqlhosting.net/";

     public static void openSystemConn (){
    
    	String connString = dbURL + "sql21630";
    	  
        String username = "sql21630";
        String password = "lX3%tB6*"; 
        
        try 
        {
        	Class.forName(driver).newInstance();
		    conn  = DriverManager.getConnection(connString, username, password);
        } 
        catch (Exception e) 
        {
            System.err.println("Can't connect to the database");
            System.err.println(e.getMessage());
        }
        
     }
     
     public static void openCharityConn (String dbName) throws Exception{
     
    	String connString = dbURL + dbName;
    	 
        String username = "temp";
        String password = "temp";
        
        try 
        {
        	Class.forName(driver).newInstance();
		    conn  = DriverManager.getConnection(connString, username, password);
		    
        } 
        catch (Exception e) 
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        
     }
     
     public static void closeConn(){
    	 try
    	 {
    		 conn.close();
    	 }
    	 catch (Exception e) 
         {
             System.err.println("Can't close the connection");
             System.err.println(e.getMessage());
         }
     }
     
     public static ResultSet query(String request){
    	 try {
    		 statement = conn.createStatement();

	    	 resultSet = statement.executeQuery(request);	
		 } catch (SQLException e) {
			 System.err.println("Connection problem");
             System.err.println(e.getMessage());
		 }
		 return resultSet;
     }
         
}
