package formsservice.dao;

import java.sql.ResultSet;

import formsservice.model.Form;

public class FormDao {
  
  public Form getForm(int id){
	  DatabaseManager.openSystemConn();
	  ResultSet result = DatabaseManager.query("");
	  
	  Form f = new Form();
	  
	  DatabaseManager.closeConn();
	  return f;
  }
}
