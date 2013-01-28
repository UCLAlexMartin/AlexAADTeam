package formsservice.dao;

import java.util.ArrayList;
import java.util.List;

import formsservice.model.Form;

public class FormDao {
	private ArrayList<Form> contentProvider = new ArrayList<Form>();  

	public FormDao(){
		Form f = new Form();
		f.setId(0);
		f.setName("my form");
		f.setTypeId(1);
		f.setURL("www.myform.org");
		this.contentProvider.add(f);
		
		Form f1 = new Form();
		f1.setId(1);
		f1.setName("my second form");
		f1.setTypeId(2);
		f1.setURL("www.mysecondform.org");
		this.contentProvider.add(f1);
	}

	public Form getForm(int id){
		return this.contentProvider.get(id);
	}

	public List<Form> getForms() {
		return this.contentProvider;
	}
}
