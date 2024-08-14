package com.web.web.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
    @Id
    @Column(columnDefinition="varchar(5)", nullable = false)
    private String codecity;

    @Column(columnDefinition="varchar(50)", nullable = false)
    private String namecity;

    @ManyToOne
    @JoinColumn(name = "codecity_id")
    private City cities;

    public City() {
    }
    public City(String codecity, String namecity) {
        this.codecity = codecity;
        this.namecity = namecity;
    }
    public String getCodecity() {
        return codecity;
    }
    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }
    public String getNamecity() {
        return namecity;
    }
    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }
    


}
