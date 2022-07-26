package com.examplejavaexel.demo.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_keluarga")
public class Keluarga implements Serializable{
    
    @Id                                                     /* generate column id for primary key */
    @GeneratedValue(strategy = GenerationType.IDENTITY)     /* generate auto increment for column id */
    private Long id;

    private String name;

    private String address;

    /*                      Generated constructor on Visual Studio Code 
     *      right click on project -> choose (Source Action) -> choose (Generate constructor)
    */
    
    public Keluarga() {
    }

    public Keluarga(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    /*                      Generated Setter Getter on Visual Studio Code 
     *      right click on project -> choose (Source Action) -> choose (Generate Setter Getter)
    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    
    
}
