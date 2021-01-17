/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg.model;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import reg.domain.Companies;
import reg.domain.GenericDao;

/**
 *
 * @author duncan
 */
public class CompanyModel {
    
    private String idInput = "";
    private String idMsg = "";
    private String nameInp = "";
    private String nameMsg ="";
    private String categoryInp ="";
    private String ownerInp ="";
    private String ownerMsg ="";
    private String startInp = "";
    private String startMsg = "";
    private String capitalInp = "";
    private Double capitalValue;
    private String capitalMsg ="";
    private boolean error = false;
    private String regDate ="";
    
    private Companies company = new Companies();
    
    
    public boolean applyRequestValues(HttpServletRequest request){
        idInput = request.getParameter("regNo");
        nameInp = request.getParameter("name");
        ownerInp = request.getParameter("owner");
        startInp = request.getParameter("startDate");
        capitalInp = request.getParameter("capital");
        categoryInp = request.getParameter("category");
        return error;
    }
    
    
    public boolean validation(){
        if(idInput == null || idInput.isEmpty())
        {
            idMsg = "Register";
            error = true;
        }
        
        if(idInput.length()< 4 || idInput.length()>4){
            idMsg="The Registration Number must be four value";
            error= true;
        }
        GenericDao<Companies> compDao = new GenericDao<Companies>(Companies.class);
        Companies comp = compDao.findOneById(idInput);
        if(comp != null ){
          idMsg = "This registration number already exist";
          error = true;
        }
        
       if(capitalInp == null || capitalInp.isEmpty()){
           capitalMsg="capital can not be empty";
           error=true;
       }
       return error;
    }
    public boolean updateModelValues(){
            try{
                 System.out.print("reach here1");
                company.setRegistrationNo(idInput                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               );
                company.setCompanyName(nameInp);
                company.setOwner(ownerInp);
                company.setCapital(capitalInp);
                company.setCategory(categoryInp);
                company.setStartingDate(startInp);
                company.setRegistrationDate(new Date());
            }catch(Exception ex){
                System.out.println(ex);
                error = true;
                
            }
            return error;
        }
    public boolean invokeApplication(){
         System.out.print("reach here2");
        try {
            GenericDao<Companies> compDao = new GenericDao<Companies>(Companies.class);
            compDao.create(company);
        } catch (Exception e) {
            error = true;
        }
        return error;
    }

    public String getIdInput() {
        return idInput;
    }

    public void setIdInput(String idInput) {
        this.idInput = idInput;
    }

    public String getidMsg() {
        return idMsg;
    }

    public void setidMsg(String idMsg) {
        this.idMsg = idMsg;
    }

    public String getNameInp() {
        return nameInp;
    }

    public void setNameInp(String nameInp) {
        this.nameInp = nameInp;
    }

    public String getNameMsg() {
        return nameMsg;
    }

    public void setNameMsg(String nameMsg) {
        this.nameMsg = nameMsg;
    }

    public String getCategoryInp() {
        return categoryInp;
    }

    public void setCategoryInp(String categoryInp) {
        this.categoryInp = categoryInp;
    }

    public String getOwnerInp() {
        return ownerInp;
    }

    public void setOwnerInp(String ownerInp) {
        this.ownerInp = ownerInp;
    }

    public String getStartInp() {
        return startInp;
    }

    public void setStartInp(String startInp) {
        this.startInp = startInp;
    }

    public String getCapitalInp() {
        return capitalInp;
    }

    public void setCapitalInp(String capitalInp) {
        this.capitalInp = capitalInp;
    }

    public Double getCapitalValue() {
        return capitalValue;
    }

    public void setCapitalValue(Double capitalValue) {
        this.capitalValue = capitalValue;
    }

    public String getCapitalMsg() {
        return capitalMsg;
    }

    public void setCapitalMsg(String capitalMsg) {
        this.capitalMsg = capitalMsg;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Companies getCompany() {
        return company;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
    
    
}
        
