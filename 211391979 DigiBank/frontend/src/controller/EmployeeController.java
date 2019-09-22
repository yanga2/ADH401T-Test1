//frontend

package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import model.Digibank;
import service.DigibankEJB;

@ManagedBean(name = "digibankcontroller")
@SessionScoped
public class DigibankController{
 
    @EJB
    private DigibankEJB digibankEJB;
    
  //from form
  	@ManagedProperty(value="#{digibank}")
    private Digibank digibank;
  	
    private List<Digibank> digibankList = new ArrayList<>();
 
   public List<Digibank> getDigibankList() {
       //digibankList = DigibankEJB.findEmployees();
        return digibankList;
    }
 
   public String viewDigibank(){
        return "digibankList.xhtml";
    }
   
    public String addNewBankDetails() {
         digibankEJB.addNew(digibank.getEntity());
      //  employeeList = employeeEJB.findEmployees();
        return "digibankList.xhtml";
    }

	public Digibank getDigibank() {
		return digibank;
	}

	public void setDigibank(Digibank digibank) {
		this.digibank = digibank;
	}
    
    
}