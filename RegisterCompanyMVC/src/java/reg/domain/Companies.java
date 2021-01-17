/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author duncan
 */
@Entity
public class Companies {
    @Id
    @Column(unique=true, nullable=false, length=4)
    private String registrationNo;
    private String companyName;
    private String category;
    private String owner;
    private String startingDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date registrationDate;
    private String capital;
    
    public Companies(String registrationNo, String companyName, String category, String owner, String startingDate, Date registrationDate, String capital) {
        this.registrationNo = registrationNo;
        this.companyName = companyName;
        this.category = category;
        this.owner = owner;
        this.startingDate = startingDate;
        this.registrationDate = registrationDate;
        this.capital = capital;
    }

    public Companies() {
      
    }
    
    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    
}
