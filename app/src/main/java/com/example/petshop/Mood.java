package com.example.petshop;


import java.util.Date;

public abstract class Mood {
    private Date date;
    public Mood(){

        this.date=new Date();
    }
    public Mood(Date d){

        this.date=d;
    }
    public void  setDate(Date d){
        this.date=d;
    }
    public Date getDate(){

        return date;
    }
    public abstract String getMood();
}
