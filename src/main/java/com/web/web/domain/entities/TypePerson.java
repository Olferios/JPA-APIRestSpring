package com.web.web.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "type_persons")
public class TypePerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    



}
