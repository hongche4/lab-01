package com.example.petshop;

import java.util.Date;

public class sad extends Mood{
    public sad(){
        super();
    }
    public sad (Date d){
        super(d);
    }
    @Override
    public String getMood() {
        return "Sad";
    }
}
