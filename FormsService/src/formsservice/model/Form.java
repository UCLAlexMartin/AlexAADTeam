package formsservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Form {
	private int id;
	private int typeId;
	private String name;
	private String URL;
	
	public Form(){
	}
	
	public int getId(){
		return this.id;
	}
	
	public int getTypeId(){
		return this.typeId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getURL(){
		return this.URL;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setTypeId(int typeId){
		this.typeId=typeId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setURL(String URL){
		this.URL=URL;
	}
}
