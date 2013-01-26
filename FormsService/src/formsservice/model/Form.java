package formsservice.model;

import java.sql.Date;
import java.util.ArrayList;

public class Form {
	private int id;
	private String type;
	private String name;
	private Date createdDate;
	private String URL;
	private ArrayList<FormField> fields;
	
	public Form(){
		
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getType(){
		return this.type;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Date getDate(){
		return this.createdDate;
	}
	
	public String getURL(){
		return this.URL;
	}
	
	public ArrayList<FormField> getFields(){
		return this.fields;
	}
}
