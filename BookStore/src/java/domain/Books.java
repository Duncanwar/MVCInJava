/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author duncan
 */
@Entity
public class Books {
    @Id
    private UUID ISBN;
    private String title;
    private String authors;
    private LocalDate publicationYears;
    private String category;
    private Integer purchasingPrice;
    private Integer sellingPrice;
    private LocalDate recordingDate;
    
    public UUID getISBN() {
        return ISBN;
    }

    public void setISBN(UUID ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public LocalDate getPublicationYears() {
        return publicationYears;
    }

    public void setPublicationYears(LocalDate publicationYears) {
        this.publicationYears = publicationYears;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(int purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public LocalDate getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(LocalDate recordingDate) {
        this.recordingDate = recordingDate;
    }
}
