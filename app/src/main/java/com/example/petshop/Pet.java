package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    public String getName() {

        return name;
    }
    public void setName(String name){

        this.name = name;
    }

    public Date getBirthDate(){

        return birthDate;
    }

    public void setBirthDate(Date birthDate){

        this.birthDate = birthDate;
    }

    private String name;
    private Date birthDate;
    public Pet(String name){
        this.birthDate = new Date();
        this.name = name;
    }
    public  Pet(String name , Date birthDate){
        this.birthDate = birthDate;
        this.name = name;
    }
    public abstract String speak();
}
