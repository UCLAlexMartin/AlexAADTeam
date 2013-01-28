package formsservice.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import formsservice.dao.FormDao;
import formsservice.model.Form;

@Path("/form")
public class FormResource {
    
	@GET
	@Produces({MediaType.TEXT_XML})
	@Path("{formid}")
	public Form getForm(@PathParam("formid") int formid) {
		FormDao fdao = new FormDao();
		return fdao.getForm(formid);
	}
	
	@GET
	@Produces({MediaType.TEXT_XML})
	public List<Form> getForms() {
		FormDao fdao = new FormDao();
		List<Form> forms = new ArrayList<Form>();
	    forms = fdao.getForms();
		return forms;
	}
}
