package com.web.web.domain.entities;

import org.springframework.boot.SpringApplication;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons") 
public class Person {
    @Id
    @Column(name="id_person", columnDefinition="varchar(20)", nullable = false)
    private String idPerson;

    @Column(name="first_name", columnDefinition="varchar(50)", nullable = false)
    private String firstName;

    @Column(name="last_name", columnDefinition="varchar(50)", nullable = false)
    private String lastName;

    @ManyToOne
    City cities;

    public Person() {
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }
    
    


}
