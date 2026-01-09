package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{
    public Happy(){

        super();
    }
    public Happy (Date d){

        super(d);
    }
    @Override
    public String getMood() {

        return "happy";
    }
}
